package Ex3.B3_6;
public class B3_6 {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    public B3_6(float x, float y, int radius,int speed,int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;

        double radians = Math.toRadians(direction);
        this.xDelta = (float) Math.cos(radians);
        this.yDelta = (float) Math.sin(radians);


    }
    public float getX() {

        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;

    }
    public void setY(float y) {
        this.y = y;
    }
    public int getRadius() {

        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public float getXDelta() {
        return xDelta;
    }
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public float getYDelta() {
        return yDelta;
    }
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move() {
        x += xDelta;
        y += yDelta;

    }
    public void reflectHorizontal(){
        xDelta = -xDelta;
    }
    public void reflectVertical(){
        yDelta = -yDelta;
    }
    public String toString() {
        return "Ball[x"+x+"y"+y+",speed=("+xDelta+","+yDelta+")]";
    }

}
