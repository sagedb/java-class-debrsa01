package exercise8;

import java.util.ArrayList;

/**
 * Class DigitalMovie
 * MediaLIbrary code 2
 * @author yasiro01
 */
public class DigitalMovie extends Movie {
  private String service;

    public DigitalMovie(String service, String director, int releaseYear, long id, String title) {
        super(director, releaseYear, id, title);
        this.quantity = -1;
        this.service = service;
    }

  /**
   * Get the value of service
   * @return the value of service
   */
  public String getService() {
    return service;
  }

  /**
   * Set the value of service
   * @param service new value of service
   */
  public void setService(String service) {
    this.service = service;
  }
  
  @Override
  public String toString(){
      return "We have a copy of " + this.title;
  }
  
  @Override
  public void checkin(){}
  
  @Override
  public void checkout(){}
  
  @Override
  public String getInfo() {
      return this.title+" ("+Integer.toString(this.getReleaseYear())+") by "+this.getDirector()+" is available for "+this.service;
  }
  
}
