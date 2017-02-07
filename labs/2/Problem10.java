/**
 * file: Problem10.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: 4.25
 * due date: February 7, 2017   
 * version: 1
 *
 * This file will generate a random plate number for the user
 * this plate number contains 3 uppercase letters followed 
 * by four random numbers
 */

public class Problem10 {
  public static void main(String [] args) {
    
    String plate = "";
    
    // will generate 3 random uppercase letters
    for(byte i = 0; i < 3; i++) {
      // this will generate a number from 65-90 and turn it 
      // into a character then add it onto plate
      plate = plate + (char)(int)Math.floor( (Math.random() 
      * 26) + 65);
    }
    
    // this will generate 4 random numbers
    for(byte i = 0; i < 4; i++) {
      // this will generate a number from 0 - 9 and add it to
      // the end of plate
      plate =  plate + (int)Math.floor( (Math.random() 
      * 10));
    }
    System.out.print(plate);
  }
}