package exercise8;

/**
 * Class PaperBook
 * MediaLIbrary code 3
 * @author yasiro01
 */
public class PaperBook extends Book {
  private final int pages;
  private String location;

    public PaperBook(int pages, String location, String author, int publishingYear, long id, String title, int quantity) {
        super(author, publishingYear, id, title, quantity);
        this.pages = pages;
        this.location = location;
    }
  
  

  /**
   * Get the number of pages
   * @return the value of pages
   */
  public int getPages() {
    return pages;
  }
  
  /**
   * Get the value of location
   * @return the value of location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Set the value of location
   * @param location new value of location
   */
  private void setLocation(String location) {
    this.location = location;
  }

  /**
   * Move an item to a new location
   * @param newLocation 
   */
  public void move(String newLocation) {
    this.location = newLocation;
  }
  
  @Override
  public String getInfo(){
      return this.getTitle()+" ("+Integer.toString(this.getPublishingYear())+") by "+this.getAuthor()+" is located at "+this.getLocation();
  }
  
  @Override
  public String toString(){
      if(this.quantity>1 || this.quantity==0){ 
        return "We have "+Integer.toString(this.quantity)+" copies of "+this.title;
    }
    else{
        return "We have a copy of " + this.title;
    }
  }
  
}
