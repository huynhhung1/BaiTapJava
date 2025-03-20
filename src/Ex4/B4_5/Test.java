package Ex4.B4_5;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape("green ",false);
        System.out.println(shape.toString());
        Circle4_5 circle = new Circle4_5(1.0,"green ",false);
        System.out.println(circle.toString());
        System.out.println("Circle Area:" + circle.getArea());
        System.out.println("Circle Perimeter:" + circle.getPerimeter());
        Rectangle rectangle = new Rectangle(4.6,5.9,"red ",false);
        System.out.println(rectangle.toString());
        System.out.println("Rectangle Area:" + rectangle.getArea());
        System.out.println("Rectangle Perimeter:" + rectangle.getPerimeter());
        Square square = new Square(3.5,"black ",true);
        System.out.println(square.toString());
        System.out.println("Square Area:" + square.getArea());
        System.out.println("Square Perimeter:" + square.getPerimeter());


    }

}
