package Ex4.B4_1;

public class Test4_1 {
    public static void main(String[] args) {
        Circle4_1 c = new Circle4_1(5.0,"green");
        System.out.println("Dientich" +c.getArea());
        System.out.println("color:"+ c.getColor());

        System.out.println(c.toString());
        Cylinder c1=new Cylinder(9,6,"black");
        System.out.println("Hinh Tru"+
                "Ban kinh"+ c1.getRadius()+
                " color"+ c1.getColor()+
                "Area"+c1.getArea()+
                "Volume"+ c1.getVolume());
    }
}
