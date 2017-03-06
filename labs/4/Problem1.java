/**
 * file: Problem1.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 6.8
 * due date: February 28, 2017   
 * version: 1  
 *
 * This program will display fahrenheit and celsius temps
 */

public class Problem1 {
  public static void main(String [] args) {
    
    // celsius
    System.out.println("Celsius\t\tFahrenheit");
    for(int i = 40; i >30; i--)
      System.out.println(i + "\t\t" + celsiusToFahrenheit(i) );
    
    // gives a good amount of spacing
    System.out.println("\n");
    
    // fahrenheit
     System.out.println("Fahrenheit\tCelsius");
    for(int i = 120; i >20; i -= 10)
      System.out.println(i + "\t\t" + fahrenheitToCelsius(i) );
    
  }
  
  /**
  * celsiusToFahrenheit
  * 
  * This function will convert celsius to fahrenheit
  * 
  * Parameters:
  *  :celsius the number which will be used to convert to fahrenheit 
  *
  * Return value: will return the computed value of fahrenheit
  */
  public static double celsiusToFahrenheit(double celsius) {
    double fahrenheit = 0;
    
    fahrenheit = (9.0/5.0) * celsius + 32;
    
    return fahrenheit;
  }
  
   /**
  * fahrenheitToCelsius
  * 
  * This function will convert fahrenheit to celsius
  * 
  * Parameters:
  *  :fahrenheit the number which will be used to convert to celsius
  *
  * Return value: will return the computed value of celsius
  */
  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = 0;
    
    celsius = (5.0 / 9.0) * (fahrenheit - 32);
    
    return celsius;
  }
}