/**
 * file: Problem9.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: 4.15
 * due date: February 7, 2017   
 * version: 1
 *
 * This file will ask the user to input a letter then it will show
 * the number that corresponds to that letter if no number
 * corresponds then it will say invalid input
 */

import java.util.Scanner;

public class Problem9 {
  public static void main(String [] args) {
    // makes a scanner
    Scanner input = new Scanner(System.in);
    char letter;
    
    // gets letter from user
    System.out.print("Enter a letter: ");
    letter = input.next().charAt(0);
    
    // converts the letter to upper case
    letter = Character.toUpperCase(letter);
    
    if (letter == 'A' 
    || letter == 'B'
    || letter == 'C' ) {
      System.out.println("The corresponding number is 2");
    }
    else if (letter == 'D'
    || letter == 'E'
    || letter == 'F' ) {
      System.out.println("The corresponding number is 3");
    }
    else if (letter == 'G' 
    || letter == 'H'
    || letter == 'I' ) {
      System.out.println("The corresponding number is 4");
    }
    else if (letter == 'J' 
    || letter == 'K'
    || letter == 'L' ) {
      System.out.println("The corresponding number is 5");
    }
    else if (letter == 'M' 
    || letter == 'N'
    || letter == 'O' ) {
      System.out.println("The corresponding number is 6");
    }
    else if (letter == 'P' 
    || letter == 'Q'
    || letter == 'R'
    || letter == 'S'   ) {
      System.out.println("The corresponding number is 7");
    }
    else if (letter == 'T' 
    || letter == 'U'
    || letter == 'V' ) {
      System.out.println("The corresponding number is 8");
    }
    else if (letter == 'W' 
    || letter == 'X'
    || letter == 'Y' 
    || letter == 'Z') {
      System.out.println("The corresponding number is 9");
    }
    else {
      System.out.println(letter + " is an invalid input");
    }
  }
}