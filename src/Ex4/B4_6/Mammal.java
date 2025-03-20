package Ex4.B4_6;
public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }
    public String toString() {
        return "Mammal[Animal[name="+super.name+"]]";

    }
}
