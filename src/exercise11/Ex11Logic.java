package exercise11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Exercise 11 logic
 * @author yasiro01
 */
public class Ex11Logic {
  
  /**
   * Task 1
   * @param <T>
   * @param item
   * @return length of the parameter's string representation
   */
  // TODO: Implement method strLen
    public <T> int strLen(T item){
        return item.toString().length();
    }
  
  /**
   * Task 2
   * @param <T>
   * @param item1
   * @param item2
   * @param item3
   * @return the greater of three parameters
   */
  // TODO: Implement method greater
    public <T extends Comparable> T greater (T item1, T item2, T item3){
        T greatest = item1;
        if(greatest.compareTo(item2) < 0){
            greatest = item2;
        }
        if(greatest.compareTo(item3) < 0){
            greatest = item3;
        }
        return greatest;
    }
  
    
  /**
   * Task 3
   * @param <T>
   * @param list of objects
   * print a list of items
   */
  // TODO: Implement method printList
    
    public <T> void printList(T ... list){
        for (T item : list){
            System.out.print(item);
            System.out.print(" ");
        }
    }
  
  /**
   * Task 4
   * @param <T>
   * @param list of objects
   * @return the smallest item in the collection
   */
  // TODO: Implement method findMinItem

    public static <T extends Comparable> T findMinItem(List<T> list) {
        T min = null;
        for (T item : list){
//            System.out.println(item);
            if(min == null){
                min = item;
            }
            if(item.compareTo(min) < 0){
                min = item;
            }
        }
        
        return min;
    }

    
}

  /**
   * Task 5
   * @param <T>
   * @param <U>
   * A class with two data members, T fuzz and U buzz
   * Implement the constructor, getters, setters, and toString
   */
  // TODO: Implement class Foo
    

class Foo<T, U> {
  private T fuzz;
  private U buzz;
  
  public Foo(T fuzz, U buzz) {
    this.fuzz = fuzz;
    this.buzz = buzz;
  }

    public T getFuzz() {
        return fuzz;
    }

    public void setFuzz(T fuzz) {
        this.fuzz = fuzz;
    }

    public U getBuzz() {
        return buzz;
    }

    public void setBuzz(U buzz) {
        this.buzz = buzz;
    }

    @Override
    public String toString() {
        return "Foo{" + "fuzz=" + fuzz + ", buzz=" + buzz + '}';
    }
  
    
}