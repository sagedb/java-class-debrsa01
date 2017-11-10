package exercise5;

/**
 * Class Student
 * Task 9: Create a class Student with the following private data members: String name, String major, double gpa.
 * Implement setters for major and gpa
 * @author debrsa01 Sage deBrum Assignment #5 
 */
public class Student {
    private String name;
    private String major;
    private double gpa;

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    
    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public String toString(){
        return String.format("%s is majoring in %s with a GPA of %.1f", this.name, this.major, this.gpa);
    }
    
}
