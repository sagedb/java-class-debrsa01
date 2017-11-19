package exercise8;

/**
 * Class Item
 * @author yasiro01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;

    public Item(long id, String title, int quantity) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }

    public Item(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    

  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
    return quantity > 0;
  }

  /**
   * Check out an item (decrease quantity by 1), if possible
   */
  public void checkout() {
    if(this.quantity>0){
        this.quantity--;
    }
    else{
        System.out.println("There are no more copies left.");
    }
  }

  /**
   * Check in an item
   */
  public void checkin() {
      this.quantity++;
  }
  
  @Override
  public String toString() {
      return "We have "+Integer.toString(this.getQuantity())+" copies of "+this.getTitle();
  }
  

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}
