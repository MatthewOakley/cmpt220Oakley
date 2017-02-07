/**
 * file: Grader.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: Q2  
 * due date: February 7, 2017   
 * version: 1.1
 *
 * Gets grades from user and calculates final grade
 * This will also display letter grade
 */

import java.util.Scanner;

public class Grader {
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
    
    String letter;
    
    // will assign letter to corresponding letter grade
    if (totalGrade >= 95)
      letter = "A";
    else if (totalGrade >= 90)
      letter = "A-";
    else if (totalGrade >= 87)
      letter = "B+";
    else if (totalGrade >= 83)
      letter = "B";
    else if (totalGrade >= 80)
      letter = "B-";
    else if (totalGrade >= 77)
      letter = "C+";
    else if (totalGrade >= 73)
      letter = "C";
    else if (totalGrade >= 70)
      letter = "C-";
    else if (totalGrade >= 65)
      letter = "D+";
    else if (totalGrade >= 60)
      letter = "D";
    else
      letter = "F";
    
    System.out.println("Your final grade is: " + letter);
    
  }
}