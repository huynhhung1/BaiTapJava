package Ex3.B3_1;

public class B3_1 {
    private double real=0.0;
    private double imag=0.0;
    public B3_1() {

    }

    public B3_1(double real, double imag) {
        this.real=real;
        this.imag=imag;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag) {
        this.real=real;
        this.imag=imag;
    }
    public String toString(){
        return "Real: "+real+" Imag: "+imag;
    }
    public boolean isreal(){
        if (imag==0.0){
            return true;
        }

        return false;
    }
    public boolean isimag(){
        if (imag==0.0){
            return true;
        }
        return false;
    }
    public boolean equals(double real, double imag){
        return this.real==real&&this.imag==imag;
    }
    public boolean equals(B3_1 another){
        return this.real==another.real&&this.imag==another.imag;
    }
    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }
    public B3_1 addInto(B3_1 right){
        this.real+=right.real;
        this.imag+=right.imag;
        return this;
    }
    public B3_1 addNew(B3_1 right){
        return new B3_1(this.real+right.real,this.imag+right.imag);
    }

}
