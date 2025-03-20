package Ex4.B4_4;

public class Test4_4 {
    public static void main(String[] args) {

        Point4_4 point = new Point4_4(1.0f, 2.0f);
        System.out.println("Point:");
        System.out.println("Tọa độ ban đầu: " + point.toString());


        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.0f);
        System.out.println("MovablePoint:"+movablePoint.toString());
        System.out.println("Tọa độ ban đầu: " + movablePoint.toString());


        movablePoint.move();
        System.out.println("Tọa độ sau lần di chuyển thứ 1: " + movablePoint.toString());


        movablePoint.move();
        System.out.println("Tọa độ sau lần di chuyển thứ 2: " + movablePoint.toString());
    }
}


