package Ex3.B3_7;

public class B3_7{
    private float x;
    private static float y;
    private float z;
    public B3_7(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

}
