/**
 * file: Problem6.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: 4.5
 * due date: February 7, 2017   
 * version: 1
 *
 * This file will take in the number of sides in a polygon and
 * the length of the sides then it will compute the total are 
 * and display it to the console
 */
 
import java.util.Scanner;

public class Problem6 {
  public static void main(String [] args) {
    int numOfSides= 0;
    double side= 0;
    
    Scanner input = new Scanner(System.in);
    
    // lets the user input the numer of sides the polygon has
    do{
      System.out.print("Enter the number of sides: ");
      numOfSides = input.nextInt();
    } while(numOfSides <= 0);
    
  // lets the user enter the length of the sides
  do {
    System.out.print("Enter the side: ");
    side = input.nextDouble();
  } while(side <= 0);
    
  // will compute the are with number of sides and length
  double area = (numOfSides * Math.pow(side, 2)) 
  / (4.0 * Math.tan(Math.PI / numOfSides) ) ;
    
  System.out.println("The area of the polygon is: " + area);
  }
}