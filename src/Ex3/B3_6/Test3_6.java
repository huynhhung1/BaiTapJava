package Ex3.B3_6;
public class Test3_6 {
    public static void main(String[] args) {
        B3_6 ball = new B3_6(50,50,10,5,25);
        System.out.println(ball);
        for (int i=0;i<5;i++){
            ball.move();
            System.out.println(ball);
        }
        ball.reflectHorizontal();
        ball.move();
        System.out.println(ball);
        ball.reflectVertical();
        ball.move();
        System.out.println(ball);
    }
}
