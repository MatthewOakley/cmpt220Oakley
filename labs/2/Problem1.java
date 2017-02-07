/**
 * file: Problem1.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: 3.4
 * due date: February 7, 2017   
 * version: 1
 *
 * This file will make a random int and then it will display
 * what month that int correlates to.
 */

public class Problem1 {
  public static void main(String [] args) {
    
    // gets random number range from 1-12
    double month = Math.floor(1.0 + Math.random() * 12.0);
    
    // System.out.println(month);
    
    if (month == 1) {
      System.out.println("January");
    }
    else if (month == 2) {
      System.out.println("February");
    }
    else if (month == 3) {
      System.out.println("March");
    }
    else if (month == 4) {
      System.out.println("April");
    }
    else if (month == 5) {
      System.out.println("May");
    }
    else if (month == 6) {
      System.out.println("June");
    }
    else if (month == 7) {
      System.out.println("July");
    }
    else if (month == 8) {
      System.out.println("August");
    }
    else if (month == 9) {
      System.out.println("September");
    }
    else if (month == 10) {
      System.out.println("October");
    }
    else if (month == 11) {
      System.out.println("November");
    }
    else {
      System.out.println("December");
    }
  }
}