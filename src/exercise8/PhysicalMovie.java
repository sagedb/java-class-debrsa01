package exercise8;

/**
 * Class PhysicalMovie
 * MediaLIbrary code 1
 * @author yasiro01
 */
public class PhysicalMovie extends Movie {
  private final String medium;
  private String location;

public PhysicalMovie(String medium, String location, String director, int releaseYear, long id, String title, int quantity) {
    super(director, releaseYear, id, title, quantity);
    this.medium = medium;
    this.location = location;
}

  /**
   * Get the value of medium
   * @return the value of medium
   */
  public String getMedium() {
    return medium;
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
      return this.getTitle()+" ("+Integer.toString(this.releaseYear)+") by "+this.getDirector()+" is located at "+this.getLocation();
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
