package BT13_3;

import java.io.*;

public class KeyBoardToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("output1.txt")
        ) {
            System.out.println("Enter text(type'exit' to exit):");
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line + System.lineSeparator());
            }
            System.out.println("Data saved to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}