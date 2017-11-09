/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import java.util.Objects;

/**
 *
 * @author debrsa01
 */
public class Plant {
    private final boolean flowering;
    private final boolean edible;
    private final String species;
    private int height = 0;

    public Plant(boolean flowering, boolean edible, String species, int height){
        this.flowering = flowering;
        this.edible = edible;
        this.species = species;
        this.height = height;
    }
    
    public boolean isFlowering() {
        return flowering;
    }

    public boolean isEdible() {
        return edible;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.flowering ? 1 : 0);
        hash = 83 * hash + (this.edible ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.species);
        hash = 83 * hash + this.height;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plant other = (Plant) obj;
        if (this.flowering != other.flowering) {
            return false;
        }
        if (this.edible != other.edible) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        if (!Objects.equals(this.species, other.species)) {
            return false;
        }
        return true;
    }

    public String getSpecies() {
        return species;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        //return "Plant{" + "flowering=" + flowering + ", edible=" + edible + ", species=" + species + ", height=" + height + '}';
//        return String.format("This % bla bla %")
        if(edible){
            return "This plant is edible";
        }
        else{
            return "Run away!";
        }
    }
    
    
    

    
}
