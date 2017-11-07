/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.HashMap;

/**
 *
 * @author debrsa01
 */
public class exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testtask1();
        testtask2();
        testtask3();
        testtask4();
        testtask5();
        testtask6();
        testtask7();
        testtask8();
        testtask9();
        testtask10();
        
    }
        /**
     *
     * @param num
     * @return
     */
    //Question 1
    public static int task1(int num){
        return num * 2;
    }
    
    @Test
    public static void testtask1(){
        //test 1
        int a = 4;

        int expected = 8;
        int result = task1(a);
        assertEquals(expected, result);
        
        //test 2
        a = a * 2;
        expected = 16;
        result = task1(a);
        assertEquals(expected, result);
    }
    
    //Question 2
    public static int task2(String astring){
        return Integer.parseInt(astring);
    }
    
    @Test
    public static void testtask2(){
        int expected = 5;
        int result = task2("5");
        assertEquals(expected, result);
        
        
        expected = 45;
        result = task2("45");
        assertEquals(expected, result);
        
    }
    
    
    //Question 3
    public static int task3(char achar){
        int ascii = (int) achar;
//        System.out.println("hello " + Integer.toString(ascii));
        return ascii;
    }
    
    @Test
    public static void testtask3(){
        int expected = 65;
        int result = task3('A');
        assertEquals(expected, result);
        
        expected = 67;
        result = task3('C');
        assertEquals(expected, result);
    }
    
    
    //Question 4
    public static char task4(String word){
        return word.charAt(0);
    }
    
    @Test 
    public static void testtask4(){
        char expected = 'w';
        char result = task4("who doesn't love ");
        assertEquals(expected, result);
        
        expected = 'a';
        result = task4("anime");
        assertEquals(expected, result);
    }
    
    
    //Question 5
    public static int task5(int num1, int num2){
        return num1 + num2;
    }
    
    @Test
    public static void testtask5(){
        int expected = 50;
        int result = task5(10,40);
        assertEquals(expected, result);
        
        expected = 50;
        result = task5(80, -30);
        assertEquals(expected, result);
    }
    

    //Question 6
    public static char task6(String astring, int num){
        String numstring = Integer.toString(num);
        astring = numstring + astring;
        return astring.charAt(0);
    }
    
    @Test
    public static void testtask6(){
        char expected = '0';
        int result = task6("hi, neighbor", 0);
        assertEquals(expected, result);
        
        expected = '5';
        result = task6("leave me alone, neighbor", 5);
        assertEquals(expected, result);
    }
    
    
    
    //Question 7
    public static int task7(int[] numarray){
        return numarray[1];
    }
    
    @Test
    public static void testtask7(){
        int expected = 2;
        int[] anarray = {1,2,3,4};
        int result = task7(anarray);
        assertEquals(expected, result);
        
        expected = 6;
        int[] anotherarray = {5,6,7,8};
        result = task7(anotherarray);
        assertEquals(expected, result);
    }
    
    
    //Question 8
    public static boolean task8(int[] numarray, int lengthhope){
        return lengthhope == numarray.length;
    }
    
    @Test
    public static void testtask8(){
        boolean expected = true;
        int[] anarray = {1,2,3,4};
        boolean result = task8(anarray, 4);
        assertEquals(expected, result);
        
        expected = false;
        int[] anotherarray = {5,6,7,8};
        result = task8(anotherarray, 3);
        assertEquals(expected, result);
    }


    
//Question 9
    public static int task9(String[] stringarray){
        String firststring = stringarray[0];
        return firststring.length();
    }
    
    @Test
    public static void testtask9(){
        int expected = 2;
        String[] anarray = {"yo", "homeboy"};
        int result = task9(anarray);
        assertEquals(expected, result);
        
        expected = 7;
        String[] anotherarray = {"homeboy", "whatisup?"};
        result = task9(anotherarray);
        assertEquals(expected, result);
    }
    
    
    //Question 10
    public static int task10(HashMap dathashmap){
        // assumes k = int, v = int
        if(dathashmap.containsKey(1)){
            int firstval = (int) dathashmap.get(1);
            return firstval;
        }
        else{
            System.out.println("key not in hashmap, bub");
            return -1;
        }
        
    }
    

    @Test
    public static void testtask10(){
        int expected = 5;
        HashMap thehashmap = new HashMap(4);
        thehashmap.put(1, 5);
        int result = task10(thehashmap);
        assertEquals(expected, result);
        
        expected = 7;
        thehashmap.clear();
        thehashmap.put(1, 7);
        result = task10(thehashmap);
        assertEquals(expected, result);
    }
    
    
}
