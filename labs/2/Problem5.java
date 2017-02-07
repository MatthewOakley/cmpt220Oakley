/**
 * file: Problem5.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: 4.1
 * due date: February 7, 2017   
 * version: 1
 *
 * This file will take in the radius of a pentagon and then first
 * compute the side and with side and radius it will compute
 * the area of the pentagon and display it to the console
 * this will round to the nearest hundreth
 */

import java.util.Scanner;

public class Problem5 {
  public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    double radius = 0.0;
    
    do {
      System.out.println("Enter the length from the center " 
      +  "to a vertex");
      radius = input.nextDouble();
    } while(radius <= 0);
    
    // computes the length of a side
    double s = 2.0 * radius * Math.sin(Math.PI / 5.0);
    
    // computes the area of a pentagon
    double area = (5.0 * Math.pow(s, 2) 
    / (4.0 * Math.tan(Math.PI / 5.0) ) );
    
    // will round it to two decimal places
    area = Math.round(area * 100);
    area = area / 100;
    
    System.out.format("The area of the pentagon is %.2f", area);
  }
}