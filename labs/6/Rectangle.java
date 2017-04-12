/**
 * file: Rectanglejava 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 9.1
 * due date: April 18, 2017   
 * version: 1  
 *
 * This file contains the declaration of the Rectangle class
 */

/**
 * Rectangle
 * 
 * This class implements a rectangle which stores width and heigth
 * It can also calculate area and perimeter with width and height
 *
 */
class Rectangle{
  
  // sets two data fields width and height with defaults of 1
  private double width = 1;
  private double height = 1;
  
  // default constructor
  Rectangle(){
    
  }
  
  // contructor that sets width and height
  Rectangle(double w, double h){
    // sets width to user input
    this.width = w;
    // sets height to user input
    this.height = h;
  }
  
  /**
   * setWidth
   * 
   * This function lets the user set the width for the rectangle
   *
   * Parameters:
   *   w: the value that width will be set to
   *
   * Return value: This function has no return value
   */
  public void setWidth(double w){
    this.width = w;
  }
  
  /**
   * setHeight
   * 
   * This function lets the user set the height for the rectangle
   * 
   * Parameters:
   *   h: the value that height will be set to
   *
   * Return value: This function has no return value
   */
  public void setHeight(double h){
    this.height = h;
  }
  
  
  /**
   * getWidth
   *
   * This function will get the width from the rectangle class
   *
   * Parameters: 
   *  None
   *
   * Return value: This will return the current width
   */
  public double getWidth(){
    return this.width;
  }
  
  /**
   * getHeight
   * 
   * This function will get the height from the rectangle class
   * 
   * Parameters:
   *  None
   *
   * Return value: This will return the current height
   */
  public double getHeight(){
    return this.height;
  }
  
  /**
   * getArea
   * 
   * This function will calculate and return the current area
   *
   * Paramters:
   *  None
   *
   * Return value: (width * height) which is area
   */
  public double getArea(){
    // calculates the area
    return (width * height);
  }
  
  /**
   * getPerimeter
   * 
   * This function will calculate and return the current perimeter
   *
   * Parameters:
   *  None
   *
   * Return value: (width + width + height + height) which is perimeter
   */
  public double getPerimeter(){
    // calculates the perimeter
    return (width + width + height + height);
  }
  
}