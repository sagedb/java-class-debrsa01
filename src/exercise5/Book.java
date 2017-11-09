package exercise5;

/**
 * Class Book
 * Task 2: Create a class Book with the following private data members: String title, String author, double price
 * @author yasiro01
 */
public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString(){
//        System.out.println(String.format("%d by %d costs %4.2f", this.title, this.author, this.price));
        return String.format("%s by %s costs %.2f", this.title, this.author, this.price);
//        return this.title + " by " + this.author + " costs " + this.price;
    }
    
}
