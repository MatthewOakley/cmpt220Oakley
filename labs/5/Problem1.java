/**
 * file: Problem1.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 7.20
 * due date: March 28, 2017   
 * version: 1  
 *
 * This program sorts using selection sort largest to smallest
 */

import java.util.Scanner;

public class Problem1 {
  public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    
    double[] list = new double[10];
    
    // gets 10 numbers from the user
    System.out.print("Please input a list of 10 numbers: ");
    for(int q = 0; q < 10; q++)
      list[q] = input.nextDouble();
    
    // shows pre sorted list
    System.out.println("Pre-sorted");
    printArray(list);
    
    // sorts the list largest to smallest
    selection(list);
    
    // shows post sorted list
    System.out.println("Post-sorted");
    printArray(list);
    
  }
  
  /*
   * printArray
   * 
   * This will print any size array of doubles
   *
   * Prameters: 
   *   list: the array that will be printed to the screen
   * 
   * Return value: Nothing because it is void only does side effect
   */
  public static void printArray(double[] array){
    for(int k = 0; k < array.length; k++){
      System.out.print(array[k] + " ");
    }
    System.out.println();
  }
  
  /*
   * selection
   *
   * This function will sort an array from largest to smallest
   *
   * Parameters: 
   *   list: the array that will be sorted from largest to smallest
   *
   * Return Value: A sorted array but does this by reference
   */
  public static void selection(double[] list){
    
    double currentMin = 0;
    int currentMinIndex = 0;
    
    // searches overall array
    for(int i = 0; i < list.length - 1; i++){
      currentMin = list[i];
      currentMinIndex = i;
      
      // This is where the array will be sorted
      for(int j = i + 1; j < list.length; j++){
        // will comapre current numbers to next
        if(currentMin < list[j]){
          currentMin = list[j];
          currentMinIndex = j;
        }
      }
      
      // This is where the values are swaped
      if(currentMinIndex != i){
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    } 
  }
}
