/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

/**
 *
 * @author debrsa01
 */
public class PlantCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plant rose1 = new Plant(true, false, "Rose", 10);
        System.out.println(rose1);
        Plant rose2 = new Plant(true, false, "Rose", 10);
        System.out.println(rose2);
        if (rose1==rose2){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }
        /*
        If you do not specify an equals() method in your class, then java
        will try to figure it out by seeing if both variables point to the 
        same object
        
        */
        
    }
    
    
    Plant oak1 = new Plant(false, true, "Oak", 50);
    Plant oak2 = oak1;
    
    PlantGarden garden = new PlantGarden(2,3);
    
    
}
