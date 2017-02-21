/**
 * file: Driver_lab3java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 3 Question 3
 * due date: February 21 2017
 * version: 1
 *
 * compute the p-norm between two points
 */

import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    // declares all of the values
    double x1 = 0;
    double x2 = 0;
    double y1 = 0;
    double y2 = 0;
    double p = 0;
    double ans = 0;
    double check = 0;
    
    while((check = input.nextDouble()) != 0) {
      
      // get the input from the user
      x1 = check;
      y1 = input.nextDouble();
      x2 = input.nextDouble();      
      y2 = input.nextDouble();
      p = input.nextDouble();
      
      // calcluates (|x1-x2|p+|y1-y2|p)1/p
      ans = Math.pow((Math.pow(Math.abs(x1 - x2),p) 
      + Math.pow(Math.abs(y1 - y2),p)),(1/p));
      System.out.println(ans);
    }
  }
}