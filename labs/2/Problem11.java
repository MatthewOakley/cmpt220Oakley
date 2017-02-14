/**
 * file: Problem11.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: 4.26
 * due date: February 7, 2017   
 * version: 1.1
 *
 * This file will generate a take input from a user and then
 * break down the dollars and coins that are needed to pay 
 * that amount of money off
 */

import java.util.Scanner;

public class Problem11 {
  public static void main(String [] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    
    double amount - 0.0;
    
    // Receive the amount
    do {
      System.out.print("Enter an amount in double, for " 
      + "example 11.56: ");
      amount = input.nextDouble();
    } while (amount < 0);
    
    // less code method
    int remainingAmount = (int)Math.round((amount * 100));
    
    /*
     method with substring
      System.out.print("Enter an amount in double, for " 
      + "example 11.56: ");
      String amount = input.next();
      // converts from String to float to int
      int remainingAmount = 
      (int)(100 * Float.parseFloat(amount.substring(0)));
    */
    
    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;
    
    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;
    
    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount %= 10;
    
    // Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount %= 5;
    
    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;
    
    // Display the results
    System.out.println("Your amount " + amount 
    + " consists of");
    System.out.println("\t" + numberOfOneDollars + " dollars");
    System.out.println("\t" + numberOfQuarters + " quarters");
    System.out.println("\t" + numberOfDimes + " dimes");
    System.out.println("\t" + numberOfNickels + " nickels");
    System.out.println("\t" + numberOfPennies + " pennies");
  }
}