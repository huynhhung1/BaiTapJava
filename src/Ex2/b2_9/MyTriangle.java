package Ex2.b2_9;

public class MyTriangle {
    private Mypoint2_9 v1;
    private Mypoint2_9 v2;
    private Mypoint2_9 v3;
    public MyTriangle(Mypoint2_9 v1, Mypoint2_9 v2, Mypoint2_9 v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new Mypoint2_9(x1, y1);
        this.v2 = new Mypoint2_9(x2, y2);
        this.v3 = new Mypoint2_9(x3, y3);
    }

    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }
    public String getType(){
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
         if (side1 == side2 && side2 == side3){
             return "Tam giac deu";

         }else if (side1 == side2 ||side2 == side3 || side1 == side3){
             return "Tam giac can";
         }else {
             return "Tam giac thuong";

         }

    }
    public String toString(){
        return "MyTriangle[v1=(" + v1.getX()+","+ v1.getY()+"), v2="+
                v2.getX()+","+v2.getY()+"), v3="+v3.getX()+","+v3.getY()+"]";
    }
}
