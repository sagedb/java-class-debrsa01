package exercise5;

/**
 * Class Room
 * Task 1: Create a class Room with the following private data members: String building, int number
 * @author yasiro01
 */
public class Room {
    private String building;
    private int number;

    public Room(String building, int number) {
        this.building = building;
        this.number = number;
    }

    public String getBuilding() {
        return building;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return building + ' ' + Integer.toString(number);
    }
    
    
}
