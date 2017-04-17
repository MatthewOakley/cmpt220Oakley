/**
 * file: Problem2.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 9.13
 * due date: April 18, 2017   
 * version: 1  
 *
 * This program revolves around a Location class
 */
 
import java.util.Scanner;

public class Problem2{
  public static void main(String[] args){
    
    // sets up scanner for user input
    Scanner input = new Scanner(System.in);
    
    // sets up location object
    Location location = new Location();
    
    // asks user for row and column and sets it
    System.out.print("Enter the number of rows and columns in the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    
    // gets all the array numbers
    System.out.println("Enter the array: ");
    double[][] array = new double[3][4];
    
    // user inputs 2D array
    for(int i = 0; i < row; i++){
      for(int j = 0; j < column; j++){
        array[i][j] = input.nextDouble();
      }
    }
    
    // finds the location of largest value
    location.locateLargest(array);
    
    // displays location of largest value
    System.out.println("The location of the largest element is " 
        + location.maxValue + " at (" + location.row + ", " + location.column + ")");
  }
}