package Ex3.B3_7;

public class Player3_7 {
    private int number;
    private float x;
    private float y;
    private float z=0.0f;
    public Player3_7(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move(float xDisp,float yDisp) {
        x+=xDisp;
        y+=yDisp;


    }
    public void jump(float zDisp) {
        z+=zDisp;
    }
    public boolean near(B3_7 ball){
        double distance = Math.sqrt(Math.pow(ball.getX()- this.x,2)+ Math.pow(ball.getY() - this.y,2));
        return distance < 8;
    }
    public String toString() {
        return "Player # "+ number+ "at("+x+","+y+","+z+")";
    }
}
