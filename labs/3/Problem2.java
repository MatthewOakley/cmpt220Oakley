/**
 * file: Problem2.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 3 5.7
 * due date: February 21 2017
 * version: 1
 *
 * This program will display the total cost of a 4 year college
 * ten years later
 */

public class Problem2 {
  public static void main(String [] args) {
    
    double tuition = 10000;
    double totalCost = 0;
    
    for(int i = 1; i <= 14; i++) {
      tuition = tuition * 1.05;
      // if after 10 years will add to total cost
      if(i == 10)
        System.out.format("Tuition 10th year: %.2f\n", tuition);
      else if (i > 10)
        totalCost = totalCost + tuition;
    }
    System.out.format("The total cost after ten years is : %.2f"
      , totalCost);
  }
}