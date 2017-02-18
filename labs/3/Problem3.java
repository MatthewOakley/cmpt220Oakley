/**
 * file: Problem3.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 3 5.12
 * due date: February 21 2017
 * version: 1
 *
 * This program will find the small value of n if n^2 > 12,000
 */

public class Problem3 {
  public static void main(String [] args) {
    
    double num = 12000;
    int n = 0;
    
    // will run until there is no remainder for sqrt of num
    while(true) {
      num++;
      
      // if the sqrt has a remainder will not break
      if(!remainder(Math.sqrt(num))) {
        n = (int)Math.sqrt(num);
        break;
      }
      
    }
    
    System.out.println("The smallest value of n so that n^2 " 
    + "> 12,000: " + n);
  }
  
  // this takes in a double and will return a boolean the
  // boolean will be true for remainder or false for no remainder
  static boolean remainder(double number) {
    // no remainder
    if(number - ((int)(number)) == 0)
      return false;
    // remainder
    else
      return true;
  }
}