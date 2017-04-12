/**
 * file: Problem1.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 9.1
 * due date: April 18, 2017   
 * version: 1  
 *
 * This program revolves around a Rectangle class
 */

public class Problem1{
  public static void main(String[] args){
    
    // sets a box object with width of 4, height of 40
    Rectangle box1 = new Rectangle(4, 40);
    
    // displays width
    System.out.println("Width: " + box1.getWidth());
    
    // displays height
    System.out.println("Height: " + box1.getHeight());
    
    // displays area
    System.out.println("Area: " + box1.getArea());
    
    // displays perimeter
    System.out.println("Perimeter: " + box1.getPerimeter());
    
    // sets a box object with width of 3.5, height of 35.9
    Rectangle box2 = new Rectangle(3.5, 35.9);
    
    // displays width
    System.out.println("Width: " + box2.getWidth());
    
    // displays height
    System.out.println("Height: " + box2.getHeight());
    
    // displays area
    System.out.println("Area: " + box2.getArea());
    
    // displays perimeter
    System.out.println("Perimeter: " + box2.getPerimeter());
  }
}