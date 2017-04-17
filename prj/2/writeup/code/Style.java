/**
 * file: Style.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: project 2
 * due date: May 8, 2017   
 * version: 0.2  
 *
 * This program will make sure the user has correct styling
 * It will also print out where there are styling problems
 * This will only work for Java programs
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;

public class Style {
  public static void main(String [] args) throws Exception {

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
    
    // currently testing for valid extension
    System.out.println("File full name from input: " + args[0]);
    System.out.println("File full name post check: " + fileName);
    
    File file = new File(fileName);
    
    Scanner input = new Scanner(file);
    
    int tabCount = 0;
    String line = " ";
    
    String bunch = "";
    
    // the amount of lines 80 to 99
    int lines80 = 0;
    // the amount of lines 100+
    int lines100 = 0;
    
    // will check the code for any style problems
    while(input.hasNext()) {
      line = input.nextLine();
      
      // if tabs are found it will count how many
      tabCount += tabReader(line);
      
      // if character count >= 100 will count how many times
      if(charCount(line) == 2)
        lines100++;
      // if character count >= 80 will count how many lines
      else if (charCount(line) == 1)
        lines80++;
    }

    // this is where the data will be outputted to a file named
    // (inputFileName) + Comments.txt
    // will get the filename and make a file that has comments
    PrintWriter writer = new PrintWriter( 
        (fileName.substring(0,fileName.length()-5) + "Comments.txt")
        ,"UTF-8");
    writer.println("Tab Count: " + tabCount);
    writer.println("Lines with 100+ characters: " + lines100);
    writer.println("Lines with 80-99 characters: " + lines80);
    writer.close();
    
  }
  
  /*
   * tabReader
   * 
   * This will take in a line of text and will give back 
   * how many tabs are in that line
   *
   * Parameters:
   *  :lineText the line of text that will be scanned for tabs 
   *
   * Return value: will return the number of tabs found
   */
  public static int tabReader(String lineText){
    int length = lineText.length();
    int counter = 0;
    
    // will go through line of code and look for tabs
    for(int i = 0; i < length; i++){
      if(lineText.charAt(i) == '\t'){
        counter++;
      }
    }
    
    return counter;
  }
  
  /*
   * charCount
   * 
   * This will take in a line of text and will give back 
   * how many a value based on how large the line is
   *
   * Parameters:
   *  :lineText the line of text that will be scanned for how
   * long the line of text is
   *
   * Return value: will return 2 if value is >= 100
   *                   will return 1 if value is 80-99
   *                   will return 0 if there is no problem
   */
  public static int charCount(String lineText){
    int length = lineText.length();
    if(length > 100) {
      return 2;
    }
    else if (length > 80) {
      return 1;
    }
    else {
      return 0;
    }
    
  }
}