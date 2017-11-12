package exercise6;

import java.util.Objects;

/**
 * Class Lemur
 * @author yasiro01
 */
public class Lemur {
    private String name;
    private Integer age;
    private Integer tailLength;

    public Lemur(String name, Integer age, Integer tailLength) {
        this.name = name;
        this.age = age;
        this.tailLength = tailLength;
    }

    public Lemur(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.tailLength = 20;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.age);
        hash = 83 * hash + Objects.hashCode(this.tailLength);
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
        final Lemur other = (Lemur) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.tailLength, other.tailLength)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lemur{" + "name=" + name + ", age=" + age + ", tailLength=" + tailLength + '}';
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTailLength() {
        return tailLength;
    }

    public void setTailLength(Integer tailLength) {
        this.tailLength = tailLength;
    }
    
    
}
