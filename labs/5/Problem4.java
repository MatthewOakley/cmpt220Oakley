/**
 * file: Problem4.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 8.13
 * due date: March 28, 2017   
 * version: 1  
 *
 * This program finds the largest number in a 2D array
 */
 
import java.util.Scanner;

public class Problem4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and "
        + "columns of the array: ");
    
    // gets row and column
    int row = input.nextInt();
    int column = input.nextInt();
    
    // gets all the array numbers
    System.out.println("Enter the array: ");
    double[][] array = new double[3][4];
    
    for(int i = 0; i < row; i++){
      for(int j = 0; j < column; j++){
        array[i][j] = input.nextDouble();
      }
    }
    
    int[] cords = locateLargest(array);
    
    System.out.println("The location of the largest element is at (" 
        + cords[0] + ", " + cords[1] + ")");
  }
  
  /*
   * locateLargest
   *
   * This progam will locate the largest value in a 2D array
   *
   * Prameters:
   *   a: This is the array that will be searched for largest value
   *
   * Return Value: returns the cords of where the largest 
   *     value is located
   */
  public static int[] locateLargest(double[][] a){
    
    // sets a minimum value to first spot in array
    double large = a[0][0];
    
    // sets cords to 0,0 which is current minimum value
    int[] cords = {0,0};
    
    // checks all the columns in a row then goes to next row
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
        // if a new larger value is found sets it to that
        if(large < a[i][j]){
          large = a[i][j];
          // gets cords to new largest value
          cords[0] = i;
          cords[1] = j;
        }
      }
    }
    return cords;
  }
}
