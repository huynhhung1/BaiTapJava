package Ex5.B5_1;

public class Line5_1 {
    private B5_1 begin;
    private B5_1 end;
    public Line5_1(B5_1 _begin, B5_1 _end) {
        begin = _begin;
        end = _end;
    }
    public Line5_1(int beginX, int beginY, int endX, int endY) {
        begin = new B5_1(beginX, beginY);
        end = new B5_1(endX, endY);

    }
    public String toString() {
        return begin.toString() + " " + end.toString();
    }
    public B5_1 getBegin() {
        return begin;
    }
    public B5_1 getEnd() {
        return end;
    }
    public void setBegin(B5_1 _begin) {
        begin = _begin;
    }
    public void setEnd(B5_1 _end) {
        end = _end;
    }
    public void setBeginX(int _beginX) {


    }
    public void setBeginY(int _beginY) {

    }
    public void setEndX(int _endX) {

    }
    public void setEndY(int _endY) {

    }
    public void setBeginXY(int beginX, int beginY) {

    }
    public void setEndXY(int endX, int endY) {

    }
    public int getLenght(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return (int) Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public int getGradient(){
        int xDiff= end.getX() - begin.getX();
        int yDiff= end.getY() - begin.getY();
        return (int) Math.atan2(yDiff,xDiff);
    }
}
