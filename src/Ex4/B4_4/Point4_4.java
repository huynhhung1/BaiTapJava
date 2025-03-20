package Ex4.B4_4;

public class Point4_4 {
    float x=0.0f;
    float y=0.0f;
    public  Point4_4(float x,float y){
        this.x=x;
        this.y=y;
    }
    public  Point4_4(){

    }
    public float getX(){
        return x;

    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;

    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[]{x,y};

    }
    public String toString(){
        return "("+x+","+y+")";
    }

}
