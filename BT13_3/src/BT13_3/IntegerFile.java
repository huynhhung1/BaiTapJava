package BT13_3;

import java.io.*;
public class IntegerFile {
    public static void main(String[] args) {
        try(DataOutputStream dos= new DataOutputStream(new FileOutputStream("number.dat"))) {
            int[] numbers = {10,20,30,40,50};
            for(int num: numbers)
            {
                dos.writeInt(num);
            }
            System.out.println("Numbers saved to file");
        } catch(IOException e) {
            e.printStackTrace();
        }
        try(DataInputStream dis= new DataInputStream(new FileInputStream("number.dat"))) {
            while(dis.available() >0)
            {
                System.out.println(dis.readInt());
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}