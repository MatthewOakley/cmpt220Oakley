/**
 * file: Problem4.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 1: 2.6
 * due date: January 31, 2017   
 * version: 1
 *
 * This files will get a number between 0 and 1000 break it
 * down into seperate numbers and add it up and display
 * the total to the console
 */

import java.util.Scanner;

public class Problem4 {
  public static void main(String [] args) {
    
    int digits = 0;
    
    Scanner input = new Scanner(System.in);
    
    
    do {
      
      System.out.print("Enter a number between 0 and 1000: ");
      digits = input.nextInt();
      
    }while(digits < 0 || digits > 1000);
    
    // gets each location in the user's input indexZero is the
    // first number
    int indexZero = digits / 1000;
    int indexOne = (digits % 1000 ) / 100;
    int indexTwo = digits % 100 / 10;
    int indexThree = (digits % 10);
    
    // calculates the total of all indexs added up
    int total = (indexZero + indexOne + indexTwo + indexThree);
    
    System.out.println("The sum of the digits is " + total);
  }
  
}