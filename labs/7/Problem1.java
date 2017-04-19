/**
 * file: Problem1.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 10.2
 * due date: April 25, 2017   
 * version: 1  
 *
 * This file uses the BMI class which can be used to calculate
 * the current BMI and mkaes sure it is implemented properly
 */
public class Problem1{
  public static void main(String[] args){
    
    // declares a bmi object with preset values
    BMI bmi = new BMI("matt", 18, 133, 5, 4);
    
    // displays BMI and current status
    System.out.println("BMI: " + bmi.getBMI());
    System.out.println("Status: " + bmi.getStatus());
    
  }
}