/**
 * file: Style.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: project 2
 * due date: May 8, 2017   
 * version: 0.2  
 *
 * This program will make sure the user has correct styling
 * It will also print out if there are styling problems
 * This will only work for Java programs
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;

public class Style {
  public static void main(String [] args) throws Exception {
    
    // makes sure the user does correct arguments
    if(args.length != 1){
      System.out.println("Correct Usage: 'java Style <file name>'");
      return;
    }
    
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
    
    // first value is how far indented 2 == 2 spaces
    // the second value is how many single indents for example if()
    int[] indents = {0 , 0};
    
    // will count how many bad indents
    int bIndents = 0;
    
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
      
      System.out.println("|" + line + "|" + line.length());
      
      // this will keep track of the indentation
      if(!(indentKeeper(indents, line))){
        bIndents++;
        System.out.println("BAD!");
      }
      else
        System.out.println("Good!");
      
      
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
    writer.println("Bad Indents: " + bIndents);
    writer.close();
    
  }
  
  /**
   * indentKeeper
   * 
   * This will check and make sure the user has proper indentation
   *
   * Parameters:
   *   lineText: This is the line that will be checked for amount of indents
   *   amount: This will track how far indented the program is
   *
   * Return value: This will return:
   *   True:  Proper Indentation
   *   False: Bad Indentation
   */
  public static boolean indentKeeper(int[] inDent, String lineText){
    
    // counts the number of spaces before text
    int spaceCount = 0;
    
    // this will count the number of spaces before any text
    for(int i = 0; i < lineText.length(); i++){
      
      // still has more spaces
      if(isSpace(lineText.charAt(i)))
        spaceCount++; // this means the proper amount of spaces
      else if (spaceCount == inDent[0])
        return true;
      else
        return false;
    }
    
    // no spaces needed
    /*
    if(spaceCount == inDent[0])
      return true;
    else
      return false;
    */
    return true;
  }
  
  /**
   * indenter
   * 
   * This will increase or decrease the indentation level
   *
   * Parameters:
   *   lineText: This is the line that will be checked for amount of indents
   *
   * Return value: None
   */
  public static void indenter(int[] indents, String lineText){
    
    // if there is an opening brace
    boolean openBrace = false;
    
    // will search for a closing brace
    for(int i = 0; i < lineText.length(); i++){
      // unexpected opening brace
      if(lineText.charAt(i) == '{'){
        //openBrace = true;
        indents[0] += 2;
      }
      // more than one open brace
      //else if(openBrace && lineText.charAt(i) == '{')
        //indents[0] += 2; // shifts indentation two to the right
      // brace pair found
      //else if (openBrace && lineText.charAt(i) == '}')
        //openBrace = false;
      // extra closing brace
      else if(lineText.charAt(i) == '}')
        indents[0] -= 2; // shifts indentation 2 to the left
    }
    
    // will search for while statement
  }
  
  /**
   * tabReader
   * 
   * This will take in a line of text and will give back 
   * how many tabs are in that line
   *
   * Parameters:
   *  lineText: the line of text that will be scanned for tabs 
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
  
  /**
   * isSpace
   * 
   * This will check if a value is a ' '
   *
   * Parameters:
   *  spot: the value that will be checked
   *
   * Return value:
   *   True:  Value is space
   *   False: Value is not space
   */
  public static boolean isSpace(char spot){
    
    // will check if the spot is a space
    if(spot == ' ')
      return true;
    else
      return false;
  }
  
  /**
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