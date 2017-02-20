/**
 * file: Style.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: project 2
 * due date: May 8, 2017   
 * version: 0.0  
 *
 * This program will make sure the user has correct styling
 * It will also print out where there are styling problems
 * This will only work for Java programs
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class Style {
  public static void main(String [] args) throws Exception {
    
    // will make sure that the user puts in a valid file WIP
    /*
    if (argc < 2) {
      System.out.println("Invalid Arguments: java style <file name>");
      System.exit(1);
    }
    */

    String fileName = args[0];
    
    // if user includes .java or not will append it to end of file
    // more than .java
    int length = args[0].length();
    System.out.println("Length: " + length);
    
    // user could not possibly have included .java extension
    if(length <= 5) {
      fileName = fileName + ".java";
    }
    // if users input did not include .java extension it will apend it
    else if (!(fileName.substring(length - 5,length).equals(".java"))) {
      System.out.println(fileName.substring(length - 5,length));
      fileName = fileName + ".java";
    }
    
    System.out.println("File full name from input: " + args[0]);
    System.out.println("File full name post check: " + fileName);
    
    File file = new File(fileName);
    
    Scanner input = new Scanner(file);
    
    int tabCount = 0;
    String nextLetter = " ";
    
    String bunch = "";
    
    while(input.hasNext()) {
      nextLetter = input.nextLine();
      bunch = nextLetter;
      tabCount = tabCount + tabReader(bunch);
      System.out.println(bunch);
    }
    
    System.out.println(bunch);
    System.out.println("Tab Count: " + tabCount);
    
    
  }
  
  static int tabReader(String lineText) {
    int length = 0;
    int counter = 0;
    length = lineText.length();
    for(int i = 0; i < length; i++) {
      if(lineText.charAt(i) == '\t'){
        System.out.println("TAB");
        counter++;
      }
    }
    
    return counter;
  }
}