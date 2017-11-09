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
public class PlantGarden {
    Plant[][] myPatch;
    
    public PlantGarden(int width, int depth){
        myPatch = new Plant[width][depth];
    }
    
    public void plantAPlant(Plant newPlant, int x, int y){
        if(x<myPatch.length && y < myPatch[0].length){
        myPatch[x][y] = newPlant;
        }
    }
    
    public void chopItDown(int x, int y){
        if(x<myPatch.length && y < myPatch[0].length){
            myPatch[x][y] = null;
        }
    }
    
}
