package exercise8;

/**
 * Class Book
 * @author yasiro01
 */
public abstract class Book extends Item {
  protected final String author;
  protected final int publishingYear;

  public Book(String author, int publishingYear, long id, String title, int quantity) {
    super(id, title, quantity);
    this.author = author;
    this.publishingYear = publishingYear;
  }

  public Book(String author, int publishingYear, long id, String title) {
    super(id, title);
    this.author = author;
    this.publishingYear = publishingYear;
    this.quantity = 1000; //just to get a high number in case
  }
  
  
  /**
   * Get the value of author
   * @return the value of author
   */
  public String getAuthor() {
    return author;
  }
  
  /**
   * Get the value of publishingYear
   * @return the value of publishingYear
   */
  public int getPublishingYear() {
    return publishingYear;
  }
  
}
