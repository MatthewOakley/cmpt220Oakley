/**
 * file: Location.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 9.13
 * due date: April 18, 2017   
 * version: 1  
 *
 * This is the location class used for finding largest number
 * In 2D array
 */

/**
 * Location
 * 
 * This class implements a Location which stores row and column
 * It calculates largest number in 2D array
 *
 */
class Location{
  
  // default data values
  public int row = 0;
  public int column = 0;
  public double maxValue = 0;
  
  // default constructor
  Location(){
    // calls constructor that includes all 3 input fields
    this(0,0,0);
  }
  
  // constructor with 3 inputs
  Location(int r, int c, double value){
    // sets the max value found
    setMax(value);
    // sets the row location
    setRow(r);
    // sets the column location
    setColumn(c);
  }
  
  /**
   * setMax
   * 
   * This function lets the user set the max value for the location
   *
   * Parameters:
   *   value: the value that maxValue will be set to
   *
   * Return value: This function has no return value
   */
  public void setMax(double value){
    this.maxValue = value;
  }
  
  /**
   * getMax
   *
   * This function will get the maxValue from the location class
   *
   * Parameters: 
   *  None
   *
   * Return value: This will return the current maxValue
   */
  public double getMax(){
    return this.maxValue;
  }
  
  
  /**
   * setRow
   * 
   * This function lets the user set the row for the location
   *
   * Parameters:
   *   value: the value that row will be set to
   *
   * Return value: This function has no return value
   */
  public void setRow(int value){
    this.row = value;
  }
  
  /**
   * getRow
   *
   * This function will get the row from the location class
   *
   * Parameters: 
   *  None
   *
   * Return value: This will return the current row
   */
  public int getRow(){
    return this.row;
  }
  
  
  /**
   * setColumn
   * 
   * This function lets the user set the column value for the location
   *
   * Parameters:
   *   value: the value that maxValue will be set to
   *
   * Return value: This function has no return value
   */
  public void setColumn(int value){
    this.column = value;
  }
  
  /**
   * getColumn
   *
   * This function will get the column from the location class
   *
   * Parameters: 
   *  None
   *
   * Return value: This will return the current column
   */
  public int getColumn(){
    return this.column;
  }
  
  
  /**
   * locateLargest
   * 
   * This function will go through a 2D array and find the 
   * largest value in that array and save the row and column
   *
   * Paramters:
   *  a: the array that will be searched
   *
   * Return value: location of spot in array and the value
   */
  public Location locateLargest(double[][] a){
    
    // sets a minimum value to first spot in array
    setMax(a[0][0]);
    
    // checks all the columns in a row then goes to next row
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
        // if a new larger value is found sets it to that
        if(getMax() < a[i][j]){
          setMax(a[i][j]);
          // gets cords to new largest value
          setRow(i);
          setColumn(j);
        }
      }
    }
    
    // return location
    return this;
  }
}