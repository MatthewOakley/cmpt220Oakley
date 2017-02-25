/**
 * file: Problem3.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: project 5.9
 * due date: February 28, 2017   
 * version: 1  
 *
 * This program will find the smallest number in a array
 */

import java.util.Scanner;

public class Problem3 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter ten numbers: ");
    double nums[] = new double[10];
    
    // gets ten numbers from the user
    for(int i = 0; i < 10; i++) {
      nums[i] = input.nextDouble();
    }
    
    // will go through array and find smallest number
    double min = nums[0];
    for(int i = 0;i < 10; i++){
      if(min > nums[i])
        min = nums[i];
    }
    
    System.out.println("The minimum number is: " + min);
  }
}