package Ex2.b2_5;

public class Account2_5 {
    private int id;
    private Customer2_5 customer;;
    private double balance=0.0;
    public Account2_5(int id, Customer2_5 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account2_5(int id, Customer2_5 customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }
    public Customer2_5 getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {

        this.balance = balance;

    }
    public String toString(){
        return customer+ " balance=$" + balance;
    }
    public void deposit (double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        if(amount > balance){
            System.out.println("So tien vuot qua so du hien tai");

        }else {
            balance -= amount;

        }
    }




}
