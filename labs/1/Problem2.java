/**
 * file: Problem2.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 1: 2.1  
 * due date: January 31, 2017   
 * version: 1
 *
 * This files converts Celsius to Fahrenheit then displays 
 * it to the console.
 * fahrenheit = (9 / 5) * celsius + 32
 * 
 */
 
 import java.util.Scanner;
 
public class Problem2 {
  
  public static void main(String [] args) {
    
    double celsius = 0.0;
    double fahrenheit = 0.0;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a degree in Celsius: ");
    
    // gets celsius from user
    celsius = input.nextDouble();
    
    // computes fahrenheit
    fahrenheit = (9.0/5.0) * celsius + 32;
    
    
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    
  }
}