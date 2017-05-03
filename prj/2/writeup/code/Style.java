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
      
      indenter(indents, line);
      
      
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
   *   inDent: This will track how far indented the program is
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
      else if( (spaceCount == inDent[0] - 2) && lineText.charAt(i) == '}')
        return true; // this means closing brace on line alone is in correct spot
      else if(spaceCount == inDent[0] && lineText.charAt(i) == '}')
        return false; // this means closing brace is two to the left and wrong
      else if (spaceCount == inDent[0])
        return true; // this means that the line has good indenation
      else
        return false; // line ends too early: bad indentation
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
   * This will increase or decrease the indentation level based
   * on each line of the user's source code
   *
   * Parameters:
   *   lineText: This is the line that will be checked for amount of indents
   *   indents: This is what will store the amount of indents needed per line
   *
   * Return value: None
   */
  public static void indenter(int[] indents, String lineText){
    
    // will see if the line has a one line indent
    boolean isWhile = false;
    boolean isFor = false;
    boolean isIf = false;
    boolean isElseIf = false;
    boolean isElse = false;
    
    
    // the length of the text this will also save computations
    int textLen = lineText.length();
    
    // keeps orginal indent to see if there is any brace
    int orgIndents = indents[0];
    
    // will count the number of spaces
    int spaces = 0;
    
    // used to see if there is any text in the string
    boolean noText = true;
    
    // will search for any indenting phrases
    for(int i = 0; i < textLen; i++){
      
      if(lineText.charAt(i) == ' ' && noText)
        spaces++;
      else
        noText = false;
      if(!(noText)){
        // if the first text in a line is a 'while'
        if(textLen > spaces + 5 && "while".equals(lineText.substring(spaces, spaces + 5)))
          isWhile = true;
        
        // if the first text in a line is a 'for'
        if(textLen > spaces + 3 && "for".equals(lineText.substring(spaces, spaces + 3)))
          isFor = true;
        
        // if the first text in a line is a 'if'
        if(textLen > spaces + 2 && "if".equals(lineText.substring(spaces, spaces + 2)))
          isIf = true;
        
        // if the first text in a line is a 'else if'
        if(textLen > spaces + 7 && "else if".equals(lineText.substring(spaces, spaces + 7)))
          isElseIf = true;
        
        // if the first text in a line is a 'else'
        if(textLen > spaces + 4 && "else".equals(lineText.substring(spaces, spaces + 4)))
          isElse = true;
      }
      
      // unexpected opening brace
      if(lineText.charAt(i) == '{')
        indents[0] += 2; // shifts indentation 2 to the right
      else if(lineText.charAt(i) == '}')
        indents[0] -= 2; // shifts indentation 2 to the left
    }
    
    // will check if curly braces were added if not makes it
    // one line indent
    if(orgIndents == indents[0]&& isWhile == true)
      indents[1]++;
    else if(orgIndents == indents[0]&& isFor == true)
      indents[1]++;
    else if(orgIndents == indents[0]&& isIf == true)
      indents[1]++;
    else if(orgIndents == indents[0]&& isElseIf == true)
      indents[1]++;
    else if(orgIndents == indents[0]&& isIf == true)
      indents[1]++;
    
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