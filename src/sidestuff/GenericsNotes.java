/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidestuff;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author debrsa01
 */
public class GenericsNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Helper helper = new Helper();
        Integer i = new Integer(252);
        System.out.println(helper.getString(i));
        Double d = new Double(2.52);
        System.out.println(helper.getString(d));
        Student s1 = new Student("Alice");
        System.out.println(helper.getString(s1));
        Student s2 = new Student("Bob");
        System.out.println(helper.greater(s1, s2));
        Student[] roster = {s1, s2};
        helper.printAllItems(roster);
        String[] roster2 = {"Aardvark", "Beaver", "Cheetah"};
        ArrayList<String> roster3 = new ArrayList();
        roster3.add("Chuck");
        roster3.add("Dave");
        helper.printAllItems2(roster3);
    }
    
}

class Helper{
    public <T> String getString(T item){
        return item.toString();
    }
    
    public <T extends Comparable> String greater(T item1, T item2){  // we can say that T has to implement comparable
        if (item1.compareTo(item2) >= 0){
            return item1.toString();
        }
        else{
            return item2.toString();
        }
    }
    
    public <T> void printAllItems(T ... list) {
        for (T item: list){
            System.out.println(item);
        }
    }
    
    public <T> void printAllItems2(Collection<T> coll){
        for (T item: coll){
            System.out.println(item);
        }
    }
}

class Student implements Comparable{
    private String name = "Alice";
    
    public Student(String name){
        this.name = name;
    }
    
    public String toString(){
        return "Student: " + name;
    }
    
    @Override
    public int compareTo(Object o){
        if (o instanceof Student){
            Student anotherStudent = (Student)o;
            return this.name.compareTo(anotherStudent.name);
        }
        else{
            return -1; 
        }
    }
    
}

class Box<T, U>{
    private T data;
    
    public Box(T data){
        this.data = data;
    }
    
    public T getData(){
        return data;
    }
}