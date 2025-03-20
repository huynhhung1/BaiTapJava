package Ex4.B4_5;

public class Circle4_5 extends Shape  {
    double radius=1.0;
    public Circle4_5() {
        super();
    }
    public Circle4_5(double radius){
        this.radius=radius;
    }
    public Circle4_5(double radius,String color ,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Circle[Shape[color="+ color+ ",filled="+ filled+", radius="+ radius+"]";
    }

}
