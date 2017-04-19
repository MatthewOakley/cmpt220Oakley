/**
 * file: BMI.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 10.2
 * due date: April 25, 2017   
 * version: 1  
 *
 * This is the BMI class which can be used to calculate
 * the current BMI
 */

/**
 * BMI
 * 
 * This class implements a BMI which stores all the needed
 * information to calculate BMI and show current status
 *
 */
public class BMI{
  
  private String name = "";
  private int age = 0;
  
  // pounds
  private double weight = 0;
  
  // inches
  private double height = 0;
  
  public static final double KILOGRAMS_PER_POUND = 0.45359237;
  public static final double METERS_PER_INCH = 0.0254;
  
  private double feet = 0;
  private double inches = 0;
  
  // default constructor
  BMI(){
    // calls a constructor to auto put information in
    this("Default",0,0,0);
  }
  
  // constructor that inclueds name.age.weight,feet,inches
  public BMI(String name, int age, double weight, double feet, double inches){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.feet = feet;
    this.inches = inches;
    
    this.height = ( (12 * feet) + inches);
  }
  
  // constructor that includes name,age,weight,height
  public BMI(String name, int age, double weight, double height){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }
  
  // constructor that includes name,weight,height
  public BMI(String name, double weight, double height){
    this(name, 20, weight, height);
  }
  
  /**
   * getBMI
   *
   * This is calculate the BMI with the current data
   *
   * Parameters:
   *   none:
   *
   * Return value:
   *   current value of bmi rounded
   */
  public double getBMI(){
    double bmi = weight * KILOGRAMS_PER_POUND / (
      (height * METERS_PER_INCH) * (height * METERS_PER_INCH));
      return Math.round(bmi * 100) / 100.0;
  }
  
  /**
   * getStatus
   *
   * Will calculate that current status based on the BMI
   *  A BMI over 30 will be considered obese
   *
   * Parameters:
   *   none:
   *
   * Return value:
   *   Will give back the current status of bmi
   */
  public String getStatus(){
    double bmi = getBMI();
    
    if(bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }
  
  /**
   * setName
   *
   * This will save user input to name
   * 
   * Parameters:
   *   value: This is the value that will be saved to name
   *
   * Return value:
   *   none
   */
  public void setName(String value){
    this.name = value;
  }
  
  /**
   * getName
   *
   * This will return the current name
   *
   * Parameters:
   *   none
   *
   * Return value:
   *   the current value of name
   */
  public String getName(){
    return this.name;
  }
  
  /**
   * setAge
   *
   * This will save user input to age
   *
   * Parameters:
   *   value: This is the value that will be saved to age
   *
   * Return value:
   *   none
   */
  public void setAge(int value){
    this.age = value;
  }
  
  /**
   * getAge
   *
   * This will return the current age
   *
   * Parameters:
   *   none
   *
   * Return value:
   *   the current value of age
   */
  public int getAge(){
    return this.age;
  }
  
  /**
   * setWeight
   *
   * This will save user input to weight
   *
   * Parameters:
   *   value: This is the value that will be saved to weight
   *
   * Return value:
   *   none
   */
  public void setWeight(double value){
    this.weight = value;
  }
  
  /**
   * getWeight
   *
   * This will return the current weight
   *
   * Parameters:
   *   none
   *
   * Return value:
   *   the current value of weight
   */
  public double getWeight(){
    return this.weight;
  }
  
  /**
   * setHeight
   *
   * This will save user input to height
   *
   * Parameters:
   *   value: This is the value that will be saved to height
   *
   * Return value:
   *   none
   */
  public void setHeight(double value){
    this.height = value;
  }
  
  /**
   * getHeight
   *
   * This will return the current height
   *
   * Parameters:
   *   none
   *
   * Return value:
   *   the current value of height
   */
  public double getHeight(){
    return this.height;
  }
  
  /**
   * setFeet
   *
   * This will save user input to feet
   *
   * Parameters:
   *   value: This is the value that will be saved to feet
   *
   * Return value:
   *   none
   */
  public void setFeet(double value){
    this.feet = value;
  }
  
  /**
   * getFeet
   *
   * This will return the current feet
   *
   * Parameters:
   *   none
   *
   * Return value:
   *   the current value of feet
   */
  public double getFeet(){
    return this.feet;
  }
  
  /**
   * setInches
   *
   * This will save user input to inches
   *
   * Parameters:
   *   value: This is the value that will be saved to inches
   *
   * Return value:
   *   none
   */
  public void setInches(double value){
    this.inches = value;
  }
  
  /**
   * getInches
   *
   * This will return the current inches
   *
   * Parameters:
   *   none
   *
   * Return value:
   *   the current value of inches
   */
  public double getInches(){
    return this.inches;
  }

}
