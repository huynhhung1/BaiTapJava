package Ex6.baitap66;

public class test66 {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty");
        cat.greets();
        Dog6 dog1 = new Dog6("Buddy");
        Dog6 dog2 = new Dog6("Charlie");
        dog1.greets();
        dog1.greets(dog2);
        BigDog bigDog1 = new BigDog("Max");
        BigDog bigDog2 = new BigDog("Rocky");
        bigDog1.greets();
        bigDog1.greets(dog1);
        bigDog1.greets(bigDog2);
    }
}

