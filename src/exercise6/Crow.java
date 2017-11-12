package exercise6;

import java.util.Objects;

/**
 * Class Crow
 * @author yasiro01
 */
//Create a class Crow with the following data members: String name, integer age, and integer iq (100 by default)
public class Crow {
    private String name;
    private int age;
    private int iq;

    public Crow(String name, int age, int iq) {
        this.name = name;
        this.age = age;
        this.iq = iq;
    }

    public Crow(String name, int age) {
        this.name = name;
        this.age = age;
        this.iq = 100;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIq() {
        return iq;
    }

    @Override
    public String toString() {
        return "Crow{" + "name=" + name + ", age=" + age + ", iq=" + iq + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.age;
        hash = 89 * hash + this.iq;
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
        final Crow other = (Crow) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.iq != other.iq) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
