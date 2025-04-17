package BT13_3;

import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.util.List;
import java.util.concurrent.*;

public class MultiThreadedDownloader {
    private static final List<String> URLS = List.of(
            "https://example.com/url1",
            "https://example.com/url2",
            "https://example.com/url3",
            "https://example.com/url4",
            "https://example.com/url5"
    );
    private static final String OUTPUT_DIR = "downloads";

    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        Files.createDirectories(Paths.get(OUTPUT_DIR));

        // Tạo thread pool
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Tải nội dung từ các URL song song
        for (int i = 0; i < URLS.size(); i++) {
            final int index = i;
            executor.submit(() -> downloadFile(URLS.get(index), OUTPUT_DIR + "/file" + index + ".txt"));
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.MINUTES);

        // Xử lý file song song
        processDownloadedFiles();
    }

    // Tải nội dung từ URL và lưu vào file
    private static void downloadFile(String urlString, String filePath) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(urlString).openStream()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Tải xong: " + filePath);
        } catch (IOException e) {
            System.err.println("Lỗi tải file từ " + urlString + ": " + e.getMessage());
        }
    }

    // Xử lý các file đã tải về: làm sạch dữ liệu HTML và gộp vào một file duy nhất
    private static void processDownloadedFiles() throws IOException {
        File mergedFile = new File("merged_output.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {
            for (int i = 0; i < URLS.size(); i++) {
                String filePath = OUTPUT_DIR + "/file" + i + ".txt";
                File file = new File(filePath);

                if (file.exists()) {
                    String cleanedContent = cleanHtmlContent(Files.readString(Path.of(filePath)));
                    writer.write(cleanedContent);
                    writer.newLine();
                }
            }
        }
        System.out.println("Hoàn tất xử lý. Kết quả lưu vào: merged_output.txt");
    }

    // Loại bỏ HTML khỏi nội dung
    private static String cleanHtmlContent(String html) {
        return BT13_3.Jsoup.parse(html).text();
    }
}
