package Ex2.b2_3;

public class Book2_3 {
    private String ISBN;
    private Author author;
    private double price;
    private int qty;
    private String name;
    public Book2_3(String ISBN,String name, Author author, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book2_3(String ISBN,String name, Author author, double price, int qty) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;

    }
    public String getISBN() {
        return ISBN;
    }
    public String getName(){
        return name;

    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;

    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;

    }
    public String getAuthorName(){
        return author.getName();
    }
    public String toString(){

        return "Book[isbn="+ ISBN +", name="+ name+ ","+ author.toString()+
                ", price"+ price+", qty="+qty+"]";
    }


}
