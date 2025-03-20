package BT13_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");
            int byteData;
            while((byteData = fis.read())!=-1);
            {
                fos.write(byteData);

            }
            System.out.println("Thanh Cong");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
