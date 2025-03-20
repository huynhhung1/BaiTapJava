package Ex5.B5_2;

public class Bai5_2 {
    private double radius;
    private String color;


    public Bai5_2(double radius, String color) {
        this.radius = 1.0;
        this.color = "red";
    }

    public Bai5_2() {

    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";

    }
}
