
package exercise_1;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;
/**
 * @author debrsa01
 */
public class Exercise_1 {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println("---Task 1---");
    System.out.println("Hello World"+ "\n");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() { 
    System.out.println("---Task 2---");
    int x = 1;
    for(x=1;x < 101;++x){
        if(x%3 == 0 && x%5==0){
            System.out.println("huh");
        } else{
            if(x%3==0){
                System.out.println("foo"); 
            }else{
                if(x%5==0){
                    System.out.println("bar");
                }else{
                    System.out.println(x);
                }
            }
        }
    }
    System.out.print("\n");
        
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    int sum = 0;
        int count = 0;
        while(count<101){
            if(count%7==0){
                sum = sum + count;              
            }
            ++count;
        }
        System.out.println("---Task 3--- ");
        System.out.println("The sum of all multiples of 7 between 1 and 100 is " + Integer.toString(sum) + "\n");
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
        int sum = 0;
        long product = 1L;
        for(int count=1;count<=20;count++){
            sum = sum + count;
            product = product * count;
        }
        System.out.println("---Task 4---");
        System.out.printf("The sum of all numbers between 1 and 20 is " + Integer.toString(sum)); 
        System.out.println("The sum of all numbers between 1 and 20 is " + product);
//        System.out.print("Sum of numbers 1-20: ");
//        System.out.println(sum);
//        System.out.print("Product of numbers 1-20: ");
//        System.out.println(product);
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    System.out.println("---Task 5---");
    Scanner userInput = new Scanner(System.in);
    System.out.printf("Enter your full name%n");
    String fullName = userInput.nextLine();  
    String[] nameArray = fullName.split(" ");
    String initials = "";
    for(int i=0;i<nameArray.length;++i){
        initials = initials + nameArray[i].charAt(0);
    }
    initials = initials.toUpperCase();
    System.out.printf("Your initials are " + initials + "%n%n");
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   * Which means: item at index0 is 0, index 1 is 1, index 2 is 8, etc...
   */
  public static void task6() {
    int[] numArray = new int[10];
    System.out.printf("---Task 6---%n");
    for(int i=0;i<numArray.length;i++){
        numArray[i] = i*i*i;
        if(i==numArray.length - 1){
            System.out.printf(Integer.toString(numArray[i])+"%n%n");
            break;
        };
        System.out.print(Integer.toString(numArray[i])+" ");
    }
    //Can't just print numArray, but it works
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    Random rnd = new Random();
    rnd.setSeed(252);
    int [] containsArray = new int[100];
    for(int i=0;i<containsArray.length;++i){
        containsArray[i] = rnd.nextInt(100);
    }
    System.out.println("---Task 7---");
    Scanner userInput = new Scanner(System.in);
    System.out.printf("Enter a number%n");
    String checkNum = userInput.nextLine();
    int checkForNum = Integer.parseInt(checkNum);
    boolean itsIn = false;
    for(int i=0;i<containsArray.length;++i){
        if(containsArray[i] == checkForNum){
            itsIn = true;
        }
    }
    if(itsIn){
        System.out.println(checkNum + " was found in the array\n");
    }
    else{
        System.out.println(checkNum + " was not found in the array\n");
    }

  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    System.out.println("---Task 8---");
    int thesum = 0;
    for(int i=0;i<numbers.length;++i){
        thesum = thesum + numbers[i];
    }
    System.out.print("Sum of all items in [");
    for(int i=0;i<numbers.length;++i){
        System.out.print(Integer.toString(numbers[i]) + ' ');
    }
    System.out.print("] is ");
    System.out.print(Integer.toString(thesum) + "\n\n");
    return thesum;
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    System.out.println("---Task 9---");
    Scanner userInput = new Scanner(System.in);
    System.out.printf("Please enter a word%n");
    String userWord = userInput.nextLine();
    boolean wordOrdered = true;
//    int[] asciiArrayOfWord = new int[userWord.length()];
    for (int i = 0; i < userWord.length(); ++i) {
//        System.out.println(userWord.charAt(i));
        if(i==userWord.length() - 1){
            break;
        }
        if((int)userWord.charAt(i) > (int)userWord.charAt(i+1)){
            wordOrdered = false;
        }
    
    }
    if(wordOrdered){
        System.out.println("Letters of " + userWord + " are in in order\n");
    }
    else{
        System.out.println("Letters of " + userWord + " are NOT in in order\n");
    }
    
    return wordOrdered;
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    System.out.println("---Task 10---");
    boolean[] numArray = new boolean[100];
    for(int i=0;i<100;++i){
        if(i==0 || i==1){
            numArray[i] = false;
        }else{
        numArray[i] = true;
        }
    }
    //okay, the array should be set up
    for(int i=2;i<numArray.length;++i){
        if (numArray[i] == true){
            for(int j=i*i;j<numArray.length;++j){
                if(j%i==0){
                    numArray[j] = false;
                }
            }
        }
    }
    System.out.println("Prime numbers between 1 and 100");
    for(int x=0;x<numArray.length;++x){
        if (numArray[x]==true){
            System.out.print(Integer.toString(x) + ' ');
        }
    }
    System.out.print('\n');
    
    
  }

}
