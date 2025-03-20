package Ex6.baitap65;

public class test65 {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        System.out.println("Initial Circle: " + c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        ResizableCircle rc1 = new ResizableCircle(10);
        System.out.println("Initial ResizableCircle: " + rc1);
        System.out.println("Area: " + rc1.getArea());
        System.out.println("Perimeter: " + rc1.getPerimeter());

        rc1.resize(150);
        System.out.println("\nAfter resizing to 150%:");
        System.out.println("Updated ResizableCircle: " + rc1);
        System.out.println("Updated Area: " + rc1.getArea());
        System.out.println("Updated Perimeter: " + rc1.getPerimeter());
    }
}
