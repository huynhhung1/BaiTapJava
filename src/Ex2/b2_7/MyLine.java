package Ex2.b2_7;

import Ex2.b2_6.Mypoint;

public class MyLine {
    private Mypoint begin;
    private Mypoint end;
    public MyLine(Mypoint begin, Mypoint end) {
        this.begin = begin;
        this.end = end;

    }
    public MyLine(int  x1, int y1, int x2 ,int y2){
        this.begin = new Mypoint(x1,y1);
        this.end = new Mypoint(x2,y2);
    }
    public Mypoint getBegin() {
        return begin;

    }
    public void setBegin(Mypoint begin) {
        this.begin = begin;
    }
    public Mypoint getEnd() {
        return end;
    }
    public void setEnd(Mypoint end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);

    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public void setBeginXY(int x,int y){
        begin.setX(x);
        begin.setY(y);
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public int[] getEndXY(){
        return end.getXY();

    }
    public void setEndXY(int x,int y){
        end.setX(x);
        end.setY(y);
    }
    public double getLength(){
        return begin.distance(end);

    }
    public double getGradient(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString(){
        return "Myline[begin=("+ begin.getX() + "," + begin.getY() + "),end=("+ end.getX() + "," + end.getY() + ")]";
    }
}

