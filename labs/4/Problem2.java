/**
 * file: Problem2.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: project 6.20
 * due date: February 28, 2017   
 * version: 1  
 *
 * This program will display fahrenheit and celsius temps
 */

import java.util.Scanner;

public class Problem2 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please put in a string of text: ");
    
    // get string of text from user
    String text = input.nextLine();
    
    int num = countLetters(text);
    
    System.out.println("The string " + text + " has " + num 
    + " letter(s).");
  }
  
  /**
  * countLetters
  * 
  * This function will keep track of how many letters there
  * are in a string of text
  * 
  * Parameters:
  *  :s the line of text the user entered which will be checked 
  *
  * Return value: will return the total numbers of letters in s
  */
  public static int countLetters(String s) {
    int length = s.length();
    // makes line of text all lower case
    s = s.toLowerCase();
    int counter = 0;
    
    // will go and check each letter to see if it is a character
    for(int i =0; i < length; i++) {
      if(isAlpha(s.charAt(i) ) )
        counter++;
      
    }
    
    return counter;
  }
  
  /**
  * isAlpha
  * 
  * This function will check if a character is a letter or not
  * 
  * Parameters:
  *  :letter this will be check to see if it is a letter 
  *
  * Return value: will return true or false if it is a letter or not
  */
  public static boolean isAlpha(char letter) {
    
    switch(letter) {
      case 'a':
        return true;
      case 'b':
        return true;
      case 'c':
        return true;
      case 'd':
        return true;
      case 'e':
        return true;
      case 'f':
        return true;
      case 'g':
        return true;
      case 'h':
        return true;
      case 'i':
        return true;
      case 'j':
        return true;
      case 'k':
        return true;
      case 'l':
        return true;
      case 'm':
        return true;
      case 'n':
        return true;
      case 'o':
        return true;
      case 'p':
        return true;
      case 'q':
        return true;
      case 'r':
        return true;
      case 's':
        return true;
      case 't':
        return true;
      case 'u':
        return true;
      case 'v':
        return true;
      case 'w':
        return true;
      case 'x':
        return true;
      case 'y':
        return true;
      case 'z':
        return true;
      default:
        return false;
    }
  }
}