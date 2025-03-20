package Ex4.B4_1;

public class Circle4_1 {
    double radius = 1.0;
    String color= "red";
    public Circle4_1(){

    }
    public Circle4_1(double radius ){
        this.radius = radius;
    }
    public Circle4_1(double radius, String color){
        this.radius = radius;
        this.color = color;
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
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

}
