package Ex2.b2_8;
public class Mypoint2_8 {
    private int x=0;
    private int y=0;
    public Mypoint2_8(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{x, y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;

    }
    public String toString(){
        return "(" + x + ", " + y + ")";

    }
    public double distance(){
        return Math.sqrt(x*x + y*y);
    }
    public double distance(int x, int y){
        int dx= this.x-x;
        int dy= this.y-y;
        return Math.sqrt(dx*dx + dy*dy);


    }
    public double distance(Mypoint2_8 other){
        int dx= this.x-other.x;
        int dy= this.y-other.y;
        return Math.sqrt(dx*dx + dy*dy);

    }

}
