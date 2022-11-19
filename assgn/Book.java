//Create a class Book with the data members bno,bname,price.
//Create a class SpecialEditionBook which is subclass of Book and with a data member discount.
// Create a class BookTest with main() to test the above classes
// Note
//        - Use constructors to give the values to the data members
//        - create a method display() in Book class which displays bno,bname and price
//        and override the same display() of Book class in SpecialEditionBook which displays
//        bno,bname,price using super.display() and display the value of discount.

public class Book {
    private int bno;
    private String bname;
    private int price;

    Book(int bno,String bname,int price)
    {
        this.bno=bno;
        this.bname=bname;
        this.price=price;
    }
    public  void display()
    {
        System.out.println("bno ="+this.bno);
        System.out.println("bname = "+this.bname);
        System.out.println("price = "+this.price);
    }
}
