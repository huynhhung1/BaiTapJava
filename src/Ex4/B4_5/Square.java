package Ex4.B4_5;

public class Square extends Rectangle {
    double side;
    public Square(){
        super();
    }
    public Square(double side ){
        super(side, side);
    }
    public Square(double side , String color, boolean filled ){
        super(side, side, color, filled);

    }
    public double getSide(){
        return side;

    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double side){
        this.side = side;

    }
    public void setLength(double side){
        this.side = side;
    }
    public String toString(){
        return "Square[Recrangle[Shape[color="+color+",filled="+filled+"],width="+width +",length="+length+"]]";
    }
}
