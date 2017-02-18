/**
 * file: Problem4.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 3 5.13
 * due date: February 21 2017
 * version: 1
 *
 * This program will find the largest value of n if n^3 < 12,000
 */

public class Problem4 {
  public static void main(String [] args) {
    
    double num1 = 0;
    double num2 = 0;
    int n = 0;
    
    // will run until num1 exceeds 12,000 then will give n value of num2
    while(true) {
      if(Math.pow(num1,3) < 12000) {
        num2 = num1;
        num1++;
      }
      else {
        n = (int)num2;
        break;
      }
    }
    
    System.out.println("The largest value of n so that n^3 " 
    + "< 12,000 is: " + n);
  }
}