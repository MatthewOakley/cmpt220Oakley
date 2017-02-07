/**
 * file: Problem4.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: 3.15
 * due date: February 7, 2017   
 * version: 1.1
 *
 * This file will take in a number from the user that will be 
 * compared to the lottery number and display results
 */

import java.util.Scanner;

public class Problem4 {
  public static void main(String [] args) {

    // Generate a lottery number
    int lottery = (int)(Math.random() * 1000);
    
    
    // Prompt the user to enter a guess
    Scanner input = new Scanner(System.in);
    do {
      System.out.print("Enter your lottery pick (three digits): ");
      int guess = input.nextInt();
    } while(guess <= 0);
    
    // Get digits from lottery
    final int lotteryDigit1 = lottery / 100;
    final int lotteryDigit2 = lottery /10 % 10;
    final int lotteryDigit3 = lottery % 10;
    
    // Get digits from guess
    int guessDigit1 = guess / 100;
    int guessDigit2 = guess / 10 % 10;
    int guessDigit3 = guess % 10;
    
    System.out.println("The lottery number is " + lottery + "\t" + guess);
    
    // gets total for guess and lottery
    int lotteryTotal = lotteryDigit1 + lotteryDigit2 + lotteryDigit3;
    int guessTotal = guessDigit1 + guessDigit2 
    + guessDigit3;
    
    byte winCase = 0;
    
    // Check the guess
    // guess and lottery are the same in order
    if (guess == lottery) {
      winCase = 3;
    }
    // guess and lottery have same digits out of order
    else if ( (lotteryDigit3 == guessDigit1 
    || lotteryDigit3 == guessDigit2 
    || lotteryDigit3 == guessDigit3) 
    && ( lotteryTotal == guessTotal )
    && ((lotteryDigit1 == guessDigit1
    || lotteryDigit1 == guessDigit2 
    || lotteryDigit1 == guessDigit3 ) 
    && (lotteryDigit2 == guessDigit1 
    || lotteryDigit2 == guessDigit2
    || lotteryDigit2 == guessDigit3))) {
      winCase = 2;
    }
    // one number in common
    else if (guessDigit1 == lotteryDigit1 
    || guessDigit1 == lotteryDigit2 
    || guessDigit1 == lotteryDigit3
    || guessDigit2 == lotteryDigit1
    || guessDigit2 == lotteryDigit2
    || guessDigit2 == lotteryDigit3
    || guessDigit3 == lotteryDigit1
    || guessDigit3 == lotteryDigit2
    || guessDigit3 == lotteryDigit3 ) {
      winCase = 1;
    }
    // no winner
    else {
      winCase = 0;
    }
    
    // This will tell the user what they got in the lottery game
    switch (winCase) {
      case 3:
        System.out.println("You have won $10,000");
        break;
      
      case 2:
        System.out.println("You have won $3,000");
        System.exit(1);
        break;
      
      case 1:
        System.out.println("You have won $1,000");
        break;
      
      default: 
        System.out.println("You have won nothing!");
        break;
      
    }
  }
}
