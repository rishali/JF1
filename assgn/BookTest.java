//Create a class Book with the data members bno,bname,price.
//Create a class SpecialEditionBook which is subclass of Book and with a data member discount.
// Create a class BookTest with main() to test the above classes
// Note
//        - Use constructors to give the values to the data members
//        - create a method display() in Book class which displays bno,bname and price
//        and override the same display() of Book class in SpecialEditionBook which displays
//        bno,bname,price using super.display() and display the value of discount.
public class BookTest {
    public static void main(String[] args) {
        Book obj= new Book(2,"science",200);
        obj.display();
    }
}
