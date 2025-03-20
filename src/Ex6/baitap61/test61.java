package Ex6.baitap61;

public class test61 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "blue", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());

        Shape s2 = new Rectangle(2.0, 4.0, "green", true);
        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());
        System.out.println("Perimeter: " + s2.getPerimeter());

        Shape s3 = new Square(3.0, "yellow", false);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());
    }
}
