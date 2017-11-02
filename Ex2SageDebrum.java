package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author debrsa01
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    nHeads(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    task9();
    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function nHeads() that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row. Seed the randomizer in the main() function.
   * @param n
   */
    public static void nHeads(int n) {
        Random task1rnd = new Random();
        task1rnd.setSeed(252);
        ArrayList<Integer> triesLst = new ArrayList();
        int a = task1rnd.nextInt(2);
        int b = task1rnd.nextInt(2);
        //      int c = task1rnd.nextInt(2);
        triesLst.add(a);

        triesLst.add(b);
        //      triesLst.add(c);
        for(int i = 0; i<triesLst.size();++i){
            if(triesLst.get(i)==1){
                System.out.println("Heads");
            }else{
                System.out.println("Tails");
            }
        }
            int numCheck;
      
        boolean done = false;
        while(done == false){
            if(triesLst.get(triesLst.size()-1)==1 && triesLst.get(triesLst.size()-2)==1 && triesLst.get(triesLst.size()-3)==1){
              System.out.println("Yay 3 heads");
              done = true;
            }
            else{
                numCheck = task1rnd.nextInt(2);
                triesLst.add(numCheck);
                if(numCheck == 1){
                    System.out.println("Heads");
                }
                else{
                    System.out.println("Tails");
                }
            }
          
        }
    }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
    public static boolean task2(int[] arr, int n) {
        boolean result = true;
        for(int i=0; i<arr.length;++i){
            if(arr[i]>n){
                result = false;
            }
        
        }
        return result;
    }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
    public static int task3(int[] arr, int threshold) {
        int count = 0;
        for(int i=0; i<arr.length;++i){
            if(arr[i]<threshold){
                count = count + 1;
            }
        }
        return count;
    }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
    public static void task4(int[] arr) {
        int highest = 0;
        for(int i=0; i<arr.length;++i){
            if(arr[i]>highest){
                highest = arr[i];
            }
        }
        int alotminushighest = 100 - highest;
        for(int i=0; i<arr.length;++i){
            if(arr[i]>highest){
                arr[i] = arr[i]+alotminushighest;
            }
        }
    }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
    int a=0;
    int b=0;
    int c=0;
    int d=0;
    int f=0;
    for(int i=0; i<arr.length;++i){
        if(arr[i]>90){
            a = ++a;
        }else if(arr[i]>80){
            b = ++b;
        }else if(arr[i]>70){
            c = ++c;
        }else if(arr[i]>60){
            d = ++d;
        }else{
            f = ++f;
        }
    }
    System.out.println(Integer.toString(a) + " got an A.");
    System.out.println(Integer.toString(b) + " got a B.");
    System.out.println(Integer.toString(c) + " got a C.");
    System.out.println(Integer.toString(d) + " got a D.");
    System.out.println(Integer.toString(f) + " got an F.");
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    ArrayList<Double> arr = new ArrayList();
    Scanner userInput = new Scanner(System.in);
//    do {
//        System.out.printf("Please enter a number%n");
//        stringUserNum = userInput.nextDouble();
//    } while (stringUserNum != 0.0 || stringUserNum != 0);
    double userNum = 6.9;
    boolean done = false;
    while (done != true){
        System.out.printf("Please enter a number%n");
        userNum = userInput.nextDouble();
        if(userNum == 0.0){
            done = true;
        }else{
            arr.add(userNum);
        }
    }
    
    for(int i=0; i<arr.size();++i){
//        System.out.println(arr.get(i));
        System.out.printf("%f \n", arr.get(i));
    }
    
    
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
//    ArrayList<Integer> arr = new ArrayList(10);
    ArrayList<Integer> arr = new ArrayList();
    Random rnd = new Random();
    rnd.setSeed(420);

    for(int i=0;i<10;++i){
//        arr.set(i, rnd.nextInt(50) + 50);
          arr.add(rnd.nextInt(50)+50);
    }
//    System.out.print("arr.size: ");
//    System.out.println(arr.size());
    
    for(int j=0;j<arr.size();++j){
        System.out.println(Integer.toString(arr.get(j)));
    }
    System.out.print("\n");
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    int count = 0;
    for(int i=0; i<arrLst.size();++i){
        if(arrLst.get(i)<threshold){
            count = count + 1;
        }
    }
    System.out.print("\n");
    return count;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    int[][] matrix = new int[10][10];
    for(int i=0;i<10;++i){
        for(int j=0;j<10;++j){
            matrix[i][j] = (i+1) * (j+1);
        }   
    }
    
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
         System.out.printf("%5d ", matrix[i][j]);
      }
      
      System.out.println();
    }
    
    return matrix;
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
    public static void task10(int[][] matrix) {
        int sum = 0;
        for(int i=0;i<10;++i){
            for(int j=0;j<10;++j){
                sum = sum + matrix[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }

}
