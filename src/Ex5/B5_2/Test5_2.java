package Ex5.B5_2;

public class Test5_2 {
        public static void main(String[] args) {
            // Kiểm thử lớp Circle
            Bai5_2 circle = new Bai5_2(3.0, "blue");
            System.out.println(circle);
            System.out.println("Area of circle: " + circle.getArea());

            // Kiểm thử lớp Cylinder
            Cylinder cylinder = new Cylinder(3.0, "green", 5.0);
            System.out.println(cylinder);
            System.out.println("Volume of cylinder: " + cylinder.getVolume());
        }
    }


