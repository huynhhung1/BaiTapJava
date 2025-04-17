package BT13_3;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.concurrent.*;

public class MultiThreadedSearch {
    private static final List<String> FILES = List.of(
            "downloads/file0.txt",
            "downloads/file1.txt",
            "downloads/file2.txt",
            "downloads/file3.txt",
            "downloads/file4.txt"
    );
    private static final String KEYWORD = "Java"; // Từ khóa cần tìm

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ConcurrentHashMap<String, Integer> resultMap = new ConcurrentHashMap<>();

        for (String file : FILES) {
            executor.submit(() -> {
                int count = countKeywordOccurrences(file, KEYWORD);
                resultMap.put(file, count);
            });
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.MINUTES);

        // Hiển thị kết quả
        System.out.println("Kết quả tìm kiếm từ khóa \"" + KEYWORD + "\":");
        resultMap.forEach((file, count) -> System.out.println(file + ": " + count + " lần"));
    }

    // Hàm đếm số lần xuất hiện của từ khóa trong file
    private static int countKeywordOccurrences(String filePath, String keyword) {
        int count = 0;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += (line.split("\\b" + keyword + "\\b", -1).length - 1);
            }
        } catch (IOException e) {
            System.err.println("Lỗi đọc file: " + filePath);
        }
        return count;
    }
}
