package Ex2.b2_8;

import Ex2.b2_6.Mypoint;

public class MyCircle2_8 {
    private Mypoint center;
    private int radius;
    public MyCircle2_8(){
        this.center = new Mypoint(0,0);
        this.radius = 1;

    }
    public MyCircle2_8(int x, int y, int radius){
        this.center = new Mypoint(x, y);
        this.radius = radius;

    }
    public MyCircle2_8(Mypoint center, int radius){
        this.center = center;
        this.radius = radius;

    }
    public int getRadius(){
        return this.radius;

    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public Mypoint getCenter(){
        return this.center;
    }
    public void setCenter(Mypoint center){
        this.center = center;
    }
    public int getCenterX(){
        return this.center.getX();

    }
    public void setCenterX(int x){

        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);

    }
    public int[] getCenterXY(){
        return this.center.getXY();
    }
    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }
    public String toString(){
        return "MyCircle[radius="+ radius + ",center=("+getCenterX()+","+getCenterY()+")]";

    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle2_8 other){
        return center.distance(other.getCenter());
    }
    public String toString2(){
        return "MyCircle[center="+center.toString()+",radius="+radius +"]";
    }
}
