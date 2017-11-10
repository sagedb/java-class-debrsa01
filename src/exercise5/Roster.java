package exercise5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Roster
 * Task 10: Create a class Roster that contains a private member ArrayList<Student> studentList (reuse class Student from task 9). Its constructor must take the name of a file as a parameter, read data from the file (sample roster.csv is provided, another file of a similar structure may be used for grading), create an object of type Student based on the content of a line, and add that object to the ArrayList studentList.
 * Implement method printRoster that prints all the elements of the studentList.
 * @author yasiro01
 */
public class Roster {
    private final ArrayList<Student> theroster = new ArrayList();

    public Roster(String filename) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        String[] linestuff;
        Student newstudent;
        while ((line = inputFile.readLine()) != null) {
            linestuff = line.split(",");
            newstudent = new Student(linestuff[0], linestuff[1], Double.parseDouble(linestuff[2]));
            theroster.add(newstudent);
        }
    }
    
    public void printRoster(){
        String allthestudents = ""; 
//        while(this.theroster.iterator().hasNext()){
//            nextstudent = theroster.iterator().next();
//            allthestudents = allthestudents + String.format("%s is majoring in %s with a GPA of %.2f%n", nextstudent.getName(), nextstudent.getMajor(), nextstudent.getGpa());
//        }     
//        System.out.println("hello");
//        System.out.println("Listen here welp\n");
        for(int i=0; i<this.theroster.size();i++){
//            allthestudents = allthestudents + theroster.get(i).toString() + "\n";
            System.out.print(theroster.get(i).toString()+"\n");
        }
//        System.out.println(allthestudents);
//        return allthestudents;
    }
    
    
}
