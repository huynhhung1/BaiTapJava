package Ex3.B3_7;

public class Test3_7 {
    public static void main(String[] args) {
        B3_7 ball = new B3_7(5,5,0);
        Player3_7 player = new Player3_7(10,0,0);

        System.out.println(player);
        System.out.println(ball);
        player.move(2,2);
        System.out.println(player);
        System.out.println(player.near(ball));
        player.jump(1.5f);
        System.out.println(player);


    }
}
