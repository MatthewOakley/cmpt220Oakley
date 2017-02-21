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
  
  /**
  * isPalindrome
  * 
  * This function will check if a number is palindrome an example
  * of this is 232 is plalindrome while 223 is not
  * 
  * Parameters:
  * number: the number which will be checked if it is palindrome
  * 
  * Return value: will return true if it is palindrome
  */
  public static boolean isPalindrome(int number) {
    int reverseNumber = reverse(number);
    // will compare the two numbers
    if(reverseNumber == number)
      return true;
    else
      return false;
    
  }
   
  /**
  * reverse
  * 
  * This function will take the number that is given and reverse it
  * 
  * Parameters:
  *  number: the number which will be reversed
  * 
  * Return value: will return the reversed number
  */
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