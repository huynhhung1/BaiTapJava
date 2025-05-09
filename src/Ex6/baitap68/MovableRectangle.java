package Ex6.baitap68;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed) {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    @Override
    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    @Override
    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    @Override
    public String toString() {
        return "MovableRectangle [topLeft=" + topLeft.toString() + ", bottomRight=" + bottomRight.toString() + "]";
    }
}
