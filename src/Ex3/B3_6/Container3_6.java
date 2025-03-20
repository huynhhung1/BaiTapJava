package Ex3.B3_6;
public class Container3_6 {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public Container3_6(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX(){
        return x1;
    }
    public int getY(){
        return y1;
    }
    public int getWidth() {
        return x2 - x1;

    }
    public int getHeight() {
        return y2 - y1;
    }
    public boolean collides(B3_6 ball){
        float ballx = ball.getX();
        float bally = ball.getY();
        float radius = ball.getRadius();
        float xDelta = ball.getXDelta();
        float yDelta = ball.getYDelta();
        if ((ballx - radius + xDelta)<=x1 || (ballx + radius + xDelta) >= x2){
            ball.reflectHorizontal();
            return true;
        }
        if (bally - radius + yDelta<=y1 || (bally + radius + yDelta) >= y2){
            ball.reflectVertical();
            return true;
        }
        return false;

    }
    public String toString(){
        return "Container["+x1+","+y1+","+x2+","+y2+"]";
    }
}
