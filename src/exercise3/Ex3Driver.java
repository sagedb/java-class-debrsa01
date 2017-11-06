package exercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author yasiro01
 * 
 * and debrsa01
 */


public class Ex3Driver {
  public static final String PATH = "data/";
  /**
   * main application function
   * @param args 
   */
  public static void main(String[] args) throws IOException {
    int[][] matrix1 = null;
    int[][] matrix2 = null;
    int[][] result = null;
    try {
      matrix1 = readFile(PATH + "matrix1.txt");
      matrix2 = readFile(PATH + "matrix2.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
    System.out.println("Matrix 1");
    printMatrix(matrix1);
    System.out.println("Matrix 2");
    printMatrix(matrix2);
    if (matrix1[0].length == matrix2.length) {
      result = multiply(matrix1, matrix2);
    } else {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, "{0}", "Impossible to multiply matrices");
      System.exit(0);
    }
    System.out.println("Result");
    printMatrix(result);
    try {
      PrintWriter pw = new PrintWriter(PATH+"result.txt");
      pw.close();
      writeMatrix(result, PATH + "result.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
  }
  /**
   * Print a matrix
   * @param matrix to print
   */
  public static void printMatrix(int[][] matrix) {
    for (int[] row: matrix) {
      for (int item: row) {
        System.out.printf("%5d", item);
      }
      System.out.printf("%n");
    }
  }
  /**
   * Write a matrix to the file
   * @param matrix 
   * @param filename 
   * @throws java.io.FileNotFoundException 
   */
  public static void writeMatrix(int[][] matrix, String filename) throws FileNotFoundException, IOException {
    
    BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
    //    writer.append(' ');
    //    writer.append(str);
//    for (int[] row: matrix) {
//        for (int item: row) {
//            writer.append(Integer.toString(item));
//        }
//        System.out.printf("%n");
//    }
    
    for (int i=0;i<matrix.length;i++) {
        for (int j=0;j<matrix[i].length;j++) {
            writer.write(Integer.toString(matrix[i][j]) + ' ');
        }
        writer.write("\n");
    }

//    System.out.println("boo");

    
    writer.close();


  }
  /**
   * Read a matrix from a file
   * @param filename
   * @return matrix read from a file
   * @throws java.io.FileNotFoundException
   */
  
 
  public static int[][] readFile(String filename) throws FileNotFoundException {
//    throw new UnsupportedOperationException();
    
//    10. Open the input file and create a Scanner object to read its content
    Scanner reader = new Scanner(new File(filename));
      
//    20. Read two values (rows and columns) from the first line, if possible
    reader.useDelimiter("\n");
    String line;
    line = reader.next();
    String[] lineStuff = line.split(" ");
    int row = Integer.parseInt(lineStuff[0]);
    int col = Integer.parseInt(lineStuff[1]);
    
//    30. Create a new 2-D array
    int [][] newMatrix = new int[row][col];
//    40. Read data from the file, one line at a time, using the Scanner object

    int newrow = 0;
    while(reader.hasNext()){
        line = reader.next();
        lineStuff = line.split(" ");
        for(int newcol=0;newcol<lineStuff.length;++newcol){
            newMatrix[newrow][newcol] = Integer.parseInt(lineStuff[newcol]);
        }
        newrow++;
    }
    
//    50. Split each line into individual tokens and put them into your array
//    60. Return the array
    
    return newMatrix;
  }
  /**
   * Multiply two matrices
   * @param matrix1
   * @param matrix2
   * @return the resulting matrix
   */
  public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
    //compatibility check
    int m1row = 0;
    int m1col = 0;
    int m2row = 0;
    int m2col = 0;
    
    
    for(int m=0;m<matrix2.length;m++){
        m1row++;
    }
    for(int i=0;i<matrix1[0].length;i++){
        m1col++;
    }
    for(int j=0;j<matrix2.length;j++){
        m2row++;
    }
    for(int k=0;k<matrix2[0].length;k++){
        m2col++;
    }

    
    int [][] resultMatrix = new int[m1row][m2col];
    if(m1col!=m2row){
        System.out.println("not able to multiply");
        return resultMatrix; 
    }
    int sum;
    int a;
    int b;
    for(int i=0;i<m1row-2;++i){
        for(int j=0;j<m2col;++j){
            sum = 0;
            for(int k=0;k<m1row;++k){
                System.out.println(Integer.toString(i) + ", "+ Integer.toString(j) + ", " +Integer.toString(k));
                a = matrix1[i][k];
                b = matrix2[k][j];
                sum = sum + (a * b);
                
                
                
                
            }
            System.out.println("matrix[" + Integer.toString(i) + "]["+Integer.toString(j)+"]: "+Integer.toString(sum));
            resultMatrix[i][j] = sum;
        }
    }
    

    
    return resultMatrix;
  }
}
