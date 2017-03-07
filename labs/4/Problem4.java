/**
 * file: Problem4.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 7.18
 * due date: February 28, 2017   
 * version: 1  
 *
 * Joke: https://gfycat.com/BrownImmediateEquestrian 
 *
 * This program will sort an array using bubble sort
 */

import java.util.Scanner;

public class Problem4 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter ten numbers: ");
    double nums[] = new double[10];
    
    // gets ten numbers from the user
    for(int i = 0; i < 10; i++) {
      nums[i] = input.nextDouble();
    }
    
    // sorts the array
    bubS(nums);
    
    // dislpays the numbers
    for(int i = 0; i < 10; i++)
      System.out.print(nums[i] + " ");
  }
  
  /**
  * bubS
  * 
  * This function will sort an array of numbers using bubble sort
  * 
  * Parameters:
  *  :array the array of numbers that will be sorted will
  * automatically sort them so no need of return
  *
  * Return value: no return method void
  */
  public static void bubS(double array[]) {
    boolean done = true;
    
    // will keep running until entire array is sorted
    do {
      done = false;
      int i = 0;
      double temp = 0;
      
      // will go through the array
      for(i = 0, temp = 0; i < 9; i++) {
        // if the next spots is less will swap spots
        if(array[i] > array[i + 1]) {
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          
          done = true;
        }
      }
    }while(done);
  }
}
