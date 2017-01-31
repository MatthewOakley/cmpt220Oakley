/**
 * file: Problem3.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 1: 2.5  
 * due date: January 31, 2017   
 * version: 1
 *
 * This files gets subtotal and gratuity rate from user then 
 * calculates it and gives user gratuity and total cost.
 * 
 */

import java.util.Scanner;
 
public class Problem3 {
  public static void main(String [] args) {
    
    double subtotal;
    double gratuityRate;
    double gratuity;
    double total;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the subtotal and a gratuity rate: ");
    
    // Gets subtotal first then gratuity rate from user
    do {
      
      subtotal = input.nextDouble();
    
    }while(subtotal <= 0);
    
    do{
    
      gratuityRate = input.nextDouble();
    
    }while(gratuityRate <= 0);
    
    // calculates gratuity
    gratuity = subtotal * (gratuityRate / 100.0);
    
    // calculates the total cost
    total = subtotal + gratuity;
    
    System.out.format("The gratuity is $%.2f"+ 
    " and total is $%.2f", gratuity, total);
  }
}