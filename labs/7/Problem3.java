/**
 * file: Problem3.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 10.17
 * due date: April 25, 2017   
 * version: 1  
 *
 * This will find the first 10 square numbers after long.MAX_VALUE
 */

import java.math.BigInteger; 
 
public class Problem3{
  public static void main(String[] args){
    
    // sets long max value to a string
    long start = (long)Math.ceil(Math.sqrt(Long.MAX_VALUE));
    
    String longMax = Long.toString(start);
    
    // makes n set to maximum long value
    BigInteger n = new BigInteger(longMax);
    
    // makes an array of BigIntegers so the squares can be stored
    BigInteger[] nums = new BigInteger[10];
    
    // will get the first 10 square numbers and save them to the array
    for(int q = 0; q < 10; q++){
      // add one to big integer number
      n = n.add(BigInteger.ONE);
      
      // does the square of the big int
      nums[q] = n.pow(2);
    }
    
    // displays the 10 squared numbers
    for(int i = 0; i < 10; i++)
      System.out.println( (i + 1) + ": " + nums[i]);
  }
}
