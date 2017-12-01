package exercise10;

import java.util.Comparator;
import java.util.Objects;

/**
 * Class Book
 * @author yasiro01
 */
public class Book {
    final String title;
    final String author;
    Double price;
    final Integer year;

    public Book(String title, String author, Double price, Integer year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
    
    public Book(Book otherbook){
        this(otherbook.title, otherbook.author, otherbook.price, otherbook.year);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return Double.parseDouble(String.format("%.2f", price));
    }

    public Integer getYear() {
        return year;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        return true;
    }
    
    public String toString(){
        return String.format("%s (%s) by %s costs $%.2f", this.getTitle(), this.getYear(), this.getAuthor(), this.getPrice());
    }
    
}

class ByTitle implements Comparator<Book> {
    @Override
    public int compare(Book item1, Book item2){
        return item1.title.compareTo(item2.title);
    }
}

class ByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book item1, Book item2){
        return item1.author.compareTo(item2.author);
    }
}

class ByPrice implements Comparator<Book> {
    @Override
    public int compare(Book item1, Book item2){
        return item1.price.compareTo(item2.price);
    }
}

class ByYear implements Comparator<Book> {
    @Override
    public int compare(Book item1, Book item2){
        return item1.year.compareTo(item2.year);
    }
}
