/**
 * file: Problem5.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 3 6.2
 * due date: February 21 2017
 * version: 1
 *
 * This file will compute the sum of integers
 */

import java.util.Scanner;

public class Problem5 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please input in a integer: ");
    long num = input.nextInt();
    
    int sum = sumDigits(num);
    
    System.out.println("The sum of all the digits of " + num 
    + " is: " + sum);
  }
  
  /**
  * sumDigits
  * 
  * This function will compute the sum of the digits the user
  * passing through
  * 
  * Parameters:
  *  :n the number which will broken down into parts then 
  *              added up to find the sum of the digits
  * Return value: will return the value of the sum of the digits
  */
  public static int sumDigits(long n) {
    int sum = 0;
    
    // will keep added sum until there is nothing left
    while(n > 0) {
      sum = sum + (int)(n % 10);
      n = n / 10;
    }
    
    // returns sum
    return sum;
  }
}