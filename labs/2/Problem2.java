/**
 * file: Problem2.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: 3.8
 * due date: February 7, 2017   
 * version: 1
 *
 * This file will take in 3 integers then display them in
 * non-descending order
 */

import java.util.Scanner;

public class Problem2 {
  public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    
    int firstInt = 0;
    int secondInt = 0;
    int thirdInt = 0;
    
    // gets intergers from the user
    System.out.print("1st: ");
    firstInt = input.nextInt();
    System.out.print("2nd: ");
    secondInt = input.nextInt();
    System.out.print("3rd: ");
    thirdInt = input.nextInt();
    
    // is a temporary variable that can store a integer while swapping
    int temp = 0;
    
    // will swap first set of numbers
    // will check first and second locations
    if (firstInt > secondInt) {
      // will swap first and second numbers
      temp = firstInt;
      firstInt = secondInt;
      secondInt = temp;
      // will check second and third locations
      if (secondInt > thirdInt) {
        // will swap second and third numbers
        temp = secondInt;
        secondInt = thirdInt;
        thirdInt = temp;
      }
    }
    
    // will swap second set of numbers
    // will check first and second locations
    if (firstInt > secondInt) {
      // will swap first and second numbers
      temp = firstInt;
      firstInt = secondInt;
      secondInt = temp;
      // will swap second and third locations
      if (secondInt > thirdInt) {
        // will swap second and third numbers
        temp = secondInt;
        secondInt = thirdInt;
        thirdInt = temp;
      }
    }
    
    // displays output
    System.out.println("1st: " + firstInt + " 2nd: " 
    + secondInt + " 3rd: " + thirdInt);
  }
}