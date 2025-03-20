package Ex4.B4_6;
public class Dog extends Mammal {
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooooof");
    }
    public String toString(){
        return "Dog[Mammal[Animal[name="+super.name+"]]]";
    }

}
