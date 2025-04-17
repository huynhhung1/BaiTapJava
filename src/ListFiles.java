package BT13_3;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File directory = new File("D:/TestFolder");
        if (!directory.exists()&& directory.isDirectory()) {
            File[] files = directory.listFiles();
            System.out.println("Danh sach File trong thu muc");
            for(File file : files) {
                System.out.println(file.getName());
            }

        }else {
            System.out.println("Thu muc khong ton tai");
        }
    }
}
