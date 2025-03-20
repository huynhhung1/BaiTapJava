package Ex4.B4_3;

public class Test4_3 {
    public static void main(String[] args) {
        // Kiểm tra Point2D
        Point2D point2D = new Point2D(3.5f, 7.5f);
        System.out.println("Point2D:");
        System.out.println("X: " + point2D.getX());
        System.out.println("Y: " + point2D.getY());
        System.out.println("Mảng XY: " + java.util.Arrays.toString(point2D.getXY()));
        System.out.println("Biểu diễn chuỗi: " + point2D.toString());

        // Thay đổi giá trị của Point2D
        point2D.setXY(5.0f, 10.0f);
        System.out.println("\nPoint2D đã được cập nhật:");
        System.out.println("Mảng XY: " + java.util.Arrays.toString(point2D.getXY()));
        System.out.println("Biểu diễn chuỗi: " + point2D.toString());

        // Kiểm tra Point3D
        Point3D point3D = new Point3D(3.5f, 7.5f, 1.5f);
        System.out.println("\nPoint3D:");
        System.out.println("X: " + point3D.getX());
        System.out.println("Y: " + point3D.getY());
        System.out.println("Z: " + point3D.getZ());
        System.out.println("Mảng XYZ: " + java.util.Arrays.toString(point3D.getXYZ()));
        System.out.println("Biểu diễn chuỗi: " + point3D.toString());

        // Thay đổi giá trị của Point3D
        point3D.setXYZ(6.0f, 8.0f, 2.0f);
        System.out.println("\nPoint3D đã được cập nhật:");
        System.out.println("Mảng XYZ: " + java.util.Arrays.toString(point3D.getXYZ()));
        System.out.println("Biểu diễn chuỗi: " + point3D.toString());
    }
}

