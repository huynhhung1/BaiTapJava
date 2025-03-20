package Ex5.B5_2;

public class Cylinder {

    private Bai5_2 base;
    private double height;

    public Cylinder() {
        this.base = new Bai5_2();
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        this.base = new Bai5_2(radius, color);
        this.height = height;
    }

    public Bai5_2 getBase() {
        return base;
    }

    public void setBase(Bai5_2 base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }


    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ", height=" + height + "]";
    }
}
