/**
 * file: Problem6.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 3 6.3
 * due date: February 21 2017
 * version: 1
 *
 * will determine if a number is a palindrome
 */

import java.util.Scanner;

public class Problem6 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    int num = input.nextInt();
    
    // if true number is palindrome
    if(isPalindrome(num))
      System.out.println(num + " is palindrome");
    else
      System.out.println(num + " is not palindrome");
    
  }
  
  // will check if number is palindrome
  public static boolean isPalindrome(int number) {
    int reverseNumber = reverse(number);
    
    if(reverseNumber == number)
      return true;
    else
      return false;
    
  }
  
  // Return the reversal of an integer, i.e., reverse(456) returns 654
  public static int reverse(int number) {
    int rNumber;
    
    String rev = "";
    
    // will take end numbers off and put them 
    // at the start of a string
    while(number > 0) {
      rev = rev + Integer.toString(number % 10);
      number = number / 10;
    }
    
    rNumber = Integer.parseInt(rev);
    
    return rNumber;
  }
}