/**
 * file: Question2.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 1: Q2  
 * due date: January 31, 2017   
 * version: 1
 *
 * Gets grades from user and calculates final grade
 * 
 */

import java.util.Scanner;

public class Question2 {
  public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    
    double midterm = 0;
    double finalExam = 0;
    double projects = 0;
    double hwAndLabs = 0;
    int totalGrade= 0;
    
    System.out.println("Please enter the following as percentage...");
    
    /**
     * Will get each section of grade from the user.
     * Then it will make sure the grade is in a valid range.
     */
    do {
      System.out.print("midterm exam: ");
      midterm = input.nextDouble();
    }while(midterm < 0 || midterm > 100);
    
    do {
      System.out.print("final exam: ");
      finalExam = input.nextDouble();
    }while(finalExam < 0 || finalExam > 100);
    
    do {
      System.out.print("projects: ");
      projects = input.nextDouble();
    }while(projects < 0 || projects > 100);
    
    do {
      System.out.print("homework and labs: ");
      hwAndLabs = input.nextDouble();
    }while(hwAndLabs < 0 || hwAndLabs > 100);
    
    // computes total grade and weighs each section
    totalGrade = (int)((midterm * .20) + (finalExam * .20) 
    + (projects * .20) + (hwAndLabs * .40));
    
    
    System.out.println("Your final grade is: " + totalGrade + "%");
    
  }
}