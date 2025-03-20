package Ex6.baitap66;

public class Dog6 extends Animal{
    public Dog6(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog6 another)
    {
        System.out.println("Woooof");
    }
}
