/**
 * file: Problem2.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 10.10
 * due date: April 25, 2017   
 * version: 1  
 *
 * This file uses the Queue class which can be used to store
 * a group of numbers in a queue (first in first out)
 */
public class Problem2{
  public static void main(String[] args){
    
    // declares a queue object
    Queue line = new Queue();
    
    // inputs 20 numbers into the queue
    for(int i = 1; i <= 20; i++)
      line.enqueue(i);
    
    // will take the twenty numbers out of the queue
    for(int i = 0; i < 20; i++)
      System.out.print(line.dequeue() + " ");
    
  }
}