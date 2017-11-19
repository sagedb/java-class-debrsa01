package exercise8;

/**
 * Class EBook
 * MediaLIbrary code 4
 * @author yasiro01
 */
public class EBook extends Book {
  private final String format;

    public EBook(String format, String author, int publishingYear, long id, String title) {
        super(author, publishingYear, id, title);
        this.format = format;
    }
  
  /**
   * Get the book format
   * @return the value of format
   */
  public String getFormat() {
    return format;
  }
  
  @Override
  public void checkin(){}
  
  @Override 
  public void checkout(){}
  
  @Override
  public String getInfo(){
      return this.title+" ("+Integer.toString(this.publishingYear)+") by "+this.author+" is available via "+this.format;
  }
  
  @Override
  public String toString(){
      return "We have a copy of " + this.title;
  }
  
}
