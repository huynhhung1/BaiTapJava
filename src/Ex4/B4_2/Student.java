package Ex4.B4_2;

public class Student extends Person{
    String program;
    int year;
    double fee;
    public Student(String name, String adress,String program,int year,double fee){
        super(name,adress);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program = program;

    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public String toString(){
        return "Student["+super.toString()+",Program= "+program+",Year= "+year+",Fee= "+fee+"]";
    }
}
