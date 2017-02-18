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
  
  // This will take a number from the user and return the sum
  // of the digits added up for example sumDigits(234) will
  // return 9 because (2 + 3 +4) is 9
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