package Ex6.baitap66;

public class BigDog extends Dog6{
    public BigDog(String name)
    {
        super(name);
    }
    @Override
    public void greets()
    {
        System.out.println("Wooow");
    }
    @Override
    public void greets(Dog6 another)
    {
        System.out.println("Wooooow");
    }
    public void greets(BigDog another)
    {
        System.out.println("Woooooooow");
    }
}
