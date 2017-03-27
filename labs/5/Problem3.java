/**
 * file: Problem3.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 7.32
 * due date: March 28, 2017   
 * version: 1  
 *
 * This program sorts using selection sort largest to smallest
 */

import java.util.Scanner;

public class Problem3{
  public static void main(String[] args){
   
    Scanner input = new Scanner(System.in);
    System.out.print("Enter list: ");
    int size = 0;
    
    // gets the size of the array
    size = input.nextInt();
    int[] list = new int[size];
    
    // fills the array with the list
    for(int i = 0; i < size; i++){
      list[i] = input.nextInt();
    }
    
    // partitions the list
    list = partition(list);
    
    // displays the partitioned list
    System.out.print("After the partition, the list is ");
    for(int k = 0; k < list.length; k++){
      System.out.print(list[k] + " ");
    }
    System.out.println();
  }
  
  /*
   *
   */
  public static int[] partition(int[] list){
    
    int[] partitionList = new int[list.length];
    
    partitionList[0] = list[0];
    
    int index = 0;
    int shift = 1;
    
    // goes to puts data in list
    for(int i = 1; i < list.length; i++){
      
      // if number needs to go before partition
      if(list[i] <= partitionList[index]){
        
        // moves the values
        for(int j = list.length - 1; j > 0; j--){
          partitionList[j] = partitionList[j - 1]; 
        } 
        
        // puts the new value at the start of the array
        partitionList[0] = list[i];
        index++;        
      }
      // will tack on higher value after the pivot
      else {
        partitionList[index + shift] = list[i];
        shift++;
      }
    }
    
    return partitionList;
  }
}
