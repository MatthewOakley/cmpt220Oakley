/**
 * file: Problem2.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 7.31
 * due date: March 28, 2017   
 * version: 1  
 *
 * This program merges two different sorted arrays
 */

import java.util.Scanner;

public class Problem2{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter list1: ");
    
    // gets the size of first list and declares array
    int length1 = input.nextInt();
    int[] list1 = new int[length1];
    
    // gets the value of list1
    for(int i = 0; i < length1; i++){
      list1[i] = input.nextInt();
    }
    
    System.out.print("Enter list2: ");
    
    // gets the size of second list and declares array
    int length2 = input.nextInt();
    int[] list2 = new int[length2];
    
    // gets the value of list2
    for(int i = 0; i < length2; i++){
      list2[i] = input.nextInt();
    }
    
    // declares the largest list
    // merges the two lists
    int[] fullList = new int[length1+length2];
    fullList = merge(list1, list2);
    
    System.out.print("The merged list: ");
    printArray(fullList);
  }
  
  /*
   * printArray
   * 
   * This will print any size array of ints
   *
   * Prameters: 
   *   list: the array that will be printed to the screen
   * 
   * Return value: Nothing because it is void only does side effect
   */
  public static void printArray(int[] array){
    for(int k = 0; k < array.length; k++){
      System.out.print(array[k] + " ");
    }
    System.out.println();
  }
  
  /*
   * merge
   * 
   * This will merge two differnt sized arrays
   *
   * Prameters: 
   *   list1: the first array that will be merged
   *   list2: the second array that will be merged
   * 
   * Return value: will return the entire merged array
   */
  public static int[] merge(int[] list1, int[] list2){
    
    // array that will contain sorted list
    int[] merged = new int[list1.length+list2.length];
    
    int i = 0;
    int j = 0;
    
    for(int q = 0; q < (list1.length+list2.length); q++){
      
       // list1 reached end so fill rest with list2
      if(i == list1.length){
        for(int m = q; j < list2.length; m++){
          merged[m] = list2[j];
          j++;
        }
        return merged;
      }
      // list2 reached end so fill rest with list1
      else if(j == list2.length) {
        for(int m = q; i < list1.length; m++){
          merged[m] = list1[i];
          i++;
        }
        return merged;
      }
      
      // will check which number is lower 
      // and check to see if end of array is reached
      if( (list1[i] < list2[j]) && (i != list1.length) ){
        merged[q] = list1[i];
        i++;
      }
      else if ( (list2[j]< list1[i]) && (j != list2.length) ){
        merged[q] = list2[j];
        j++;
      }
      else if(list1[i] == list2[j]) {
        merged[q] = list1[i];
        i++;
      }
    }
    return merged;
  }
}
