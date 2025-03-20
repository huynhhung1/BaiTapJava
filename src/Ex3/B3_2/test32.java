package Ex3.B3_2;

public class test32 {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1, 2, 3);
        MyPolynomial p2 = new MyPolynomial(2, -1, 4);
        System.out.println("P1(x): " + p1);
        System.out.println("P2(x): " + p2);
        MyPolynomial sum = p1.add(p2);
        System.out.println("P1(x) + P2(x) = " + sum);
        MyPolynomial product = p1.multiply(p2);
        System.out.println("P1(x) * P2(x) = " + product);
        double value = p1.evaluate(2);
        System.out.println("P1(2) = " + value);
    }
}
