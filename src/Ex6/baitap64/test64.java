package Ex6.baitap64;

public class test64 {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5, 5, 2, 3);
        System.out.println("Initial Position: " + point);
        point.moveUp();
        System.out.println("After moveUp: " + point);
        point.moveDown();
        System.out.println("After moveDown: " + point);
        point.moveLeft();
        System.out.println("After moveLeft: " + point);
        point.moveRight();
        System.out.println("After moveRight: " + point);

        MovableCircle circle = new MovableCircle(10, 10, 3, 4, 7);
        System.out.println("Initial Circle: " + circle);
        circle.moveUp();
        System.out.println("After moveUp: " + circle);
        circle.moveDown();
        System.out.println("After moveDown: " + circle);
        circle.moveLeft();
        System.out.println("After moveLeft: " + circle);
        circle.moveRight();
        System.out.println("After moveRight: " + circle);
    }
}

