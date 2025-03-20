package Ex3.B3_1;

public class Test3_1 {
    public static void main(String[] args) {
        B3_1 b1 = new B3_1(3.1,4.05);
        B3_1 b2 = new B3_1(6,8);
        System.out.println("b1"+b1);
        System.out.println("b2"+b2);
        System.out.println("B1 is real"+b1.isreal());
        System.out.println("B1 is imag"+b1.isimag());
        B3_1 sum=b1.addNew(b2);
        System.out.println("sum"+sum);
        b1.addNew(b2);
        System.out.println("b1"+b1);
    }
}
