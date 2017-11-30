package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
    ArrayList<Book> catalog;

  public BookShop() {
      catalog = new ArrayList<Book>();
  }
  
    public BookShop(String filename) throws FileNotFoundException, IOException {
        this();
        String line = null;
        Book aBook;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(filename);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                String[] eachitem = line.split(",");
                aBook = new Book(eachitem[0], eachitem[1], Double.parseDouble(eachitem[2]), Integer.parseInt(eachitem[3]));
                this.addNewTitle(aBook);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex){
            throw new FileNotFoundException();
        }
    }
  
    public BookShop(BookShop anotherBookShop) {
        this();
        for (Book book: anotherBookShop.catalog){
            this.addNewTitle(book);
        }
        
    }
    
    public void addNewTitle(Book book) {
        this.catalog.add(book);
    }

    public int size() {
        return catalog.size();
    }

    public void discountAll(Double discountPercent) {
        for(Book book: this.catalog){
            book.setPrice(book.getPrice() - (book.getPrice() / discountPercent));
        }
    }

    public void printCatalog() {
        for(Book book: this.catalog){
            System.out.print(book.toString());
        }
    }

    public void order(Comparator<Book> comp) {
        
    }

    public ArrayList<Book> getCatalog() {
        return this.catalog;
    }

}
