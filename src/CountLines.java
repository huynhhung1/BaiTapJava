package BT13_3;

import java.io.*;

public class CountLines {
    public static void main(String[] args) {
        int lineCount=0;
        try(BufferedReader br=new BufferedReader(new FileReader("intput2.txt"))){
            while(br.readLine()!=null){
                lineCount++;
            }
            System.out.println("Number of lines: "+lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}