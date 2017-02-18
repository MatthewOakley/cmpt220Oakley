/**
 * file: Problem1.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 3 5.1
 * due date: February 21 2017
 * version: 1
 *
 * This program will let the user enter in as many numbers they want
 * With these numbers it will calculate how many are positve
 * negative and the total and average
 */

import java.util.Scanner;

public class Problem1 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer, the input ends if it is 0: ");
    
    int num = 0;
    int positive = 0;
    int negative = 0; 
    double avg = 0;
    double total = 0;
    
    // will keep prompting user until zero is entered
    do {
      num = input.nextInt();
      // will check if positive or negative
      if(num > 0)
        positive++;
      else if (num <0)
        negative++;
      
      // if not for exiting will add one to the average
      if(num != 0)
        avg++;
      
      total = total + num;
      
    }while(num != 0);
    
    // prints out the data
    System.out.println("The number of positives is " + positive);
    System.out.println("The number of negatives is " + negative);
    System.out.println("The total is " + total);
    System.out.println("The average is " + (total / avg));
  }
}