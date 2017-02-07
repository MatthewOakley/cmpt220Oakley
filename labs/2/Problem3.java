/**
 * file: Problem3.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: lab 2: 3.11
 * due date: February 7, 2017   
 * version: 1
 *
 * This file will take in 2 numbers month and year and with
 * those numbers will give back month year and how many 
 * days
 */

import java.util.Scanner;

public class Problem3 {
  public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    
    int month = 0;
    int year = 0;
    
    // will get a vaild month range from the user
    do {
      System.out.print("Please input a month. (Integer): ");
      month = input.nextInt();
    } while(month <= 0 || month > 12);
    
    do {
      System.out.print("Please input a year: ");
      year = input.nextInt();
    } while (year < 0);
    
    boolean leap = false;
    
    // will determine if it is a leap year or not
    // not leap
    if (year % 4 != 0){
      leap = false;
    }
    // leap
    else if (year % 100 != 0) {
      leap = true;
    }
    // not leap
    else if (year % 400 != 0) {
      leap = false;
    }
    // leap
    else {
      leap = true;
    }
    
    // will check which month then display it to console
    switch (month) {
      case 1:
        System.out.println("January " + year + " has 31 days");
        break;
      
      // has the potential to have an extra day for leap year
      case 2:
        if (leap) {
          System.out.println("February " + year + " has 29 days");
        }
        else {
          System.out.println("February " + year + " has 28 days");
        }
        break;
      
      case 3:
        System.out.print("March " + year + " has 31 days");
        break;
      
      case 4:
        System.out.print("April " + year + " has 30 days");
        break;
        
      case 5:
        System.out.print("May " + year + " has 31 days");
        break;
      
      case 6:
        System.out.print("June " + year + " has 30 days");
        break;
      
      case 7:
        System.out.print("July " + year + " has 31 days");
        break;
      
      case 8:
        System.out.print("August " + year + " has 31 days");
        break;
        
       case 9:
        System.out.print("September " + year + " has 30 days");
        break;
      
      case 10:
        System.out.print("October " + year + " has 31 days");
        break;
      
      case 11:
        System.out.print("November " + year + " has 30 days");
        break;
      
      case 12:
        System.out.print("December " + year + " has 31 days");
        break;
        
      default:
        System.out.println("Error: Invalid Month!");
        System.exit(1);
    }
    
  }
}