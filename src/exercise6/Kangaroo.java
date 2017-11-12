package exercise6;

import java.util.Objects;

/**
 * Class Kangaroo
 * @author yasiro01
 */
public class Kangaroo {
    //String name, integer age, and integer babies (1 by default)
    private String name;
    private Integer age;
    private Integer babies;

    public Kangaroo(String name, Integer age, Integer babies) {
        this.name = name;
        this.age = age;
        this.babies = babies;
    }

    public Kangaroo(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.babies = 1;
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

    public Integer getBabies() {
        return babies;
    }

    public void setBabies(Integer babies) {
        this.babies = babies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.age);
        hash = 67 * hash + Objects.hashCode(this.babies);
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
        final Kangaroo other = (Kangaroo) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.babies, other.babies)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Kangaroo{" + "name=" + name + ", age=" + age + ", babies=" + babies + '}';
    }
    
    
}
