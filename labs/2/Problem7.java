/**
 * file: Problem7.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: 4.8
 * due date: February 7, 2017   
 * version: 1
 *
 * This file will get an integer from 0 - 127 from the user 
 * and show the corresponding ASCII character 
 */

import java.util.Scanner;

public class Problem7 {
  public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    byte charCode = 0;
    
    // gets and integer from the user between 0 and 127
    do {
      System.out.println("Enter an ASCII code: ");
      charCode = input.nextByte();
    } while (charCode < 0 || charCode > 127);
    
    // sets letter to the corresponding ASCII letter
    char letter = (char)charCode;
    
    System.out.println("The character for ASCII code " 
    + charCode + " is " + letter);
  }
}