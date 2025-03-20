package Ex6.baitap68;

public class test68 {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Trước khi di chuyển: " + p);
        p.moveUp();
        p.moveRight();
        System.out.println("Sau khi di chuyển lên và sang phải: " + p);
        MovableRectangle r = new MovableRectangle(0, 0, 4, 5, 2, 2);
        System.out.println("Trước khi di chuyển: " + r);
        r.moveRight();
        r.moveDown();
        System.out.println("Sau khi di chuyển xuống và sang phải: " + r);
    }
}
