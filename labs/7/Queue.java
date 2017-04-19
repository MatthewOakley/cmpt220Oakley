/**
 * file: Queue.java 
 * author: Matthew Oakley 
 * course: CMPT 220-201
 * assignment: problem 10.10
 * due date: April 25, 2017   
 * version: 1  
 *
 * This is the Queue class which can be used to include the
 * queue data structure
 */

/**
 * Queue
 * 
 * This class implements a Queue which is a data structure
 * This is first in first out (FIFO)
 *
 */
public class Queue {
  
  // This is the default size the queue will always start with
  private static final int DEFAULT_SIZE = 8;
  
  private int size = DEFAULT_SIZE;
  private int[] elements = new int[size];
  
  // This is used to keep track of how many elements are in the queue
  private int index = 0;
  
  
  // Default constructor
  Queue(){
    
  }
  
  /**
   * enqueue
   *
   * This will take the queue and add an element to the end of it   
   *
   * Parameters:
   *   value: the value that will be added to the end of the queue
   *
   * Return Value:
   *   none
   */
  public void enqueue(int value){
    
    // if the index size nears the end of the queue it will make the size bigger
    if(index + 1 == size)
      size *= 2;
    
    // declares a new queue that will store all the elements
    int[] newElements = new int[size];
    
    // will go through the array and do a deep copy
    for(int i = 0; i < index; i++)
      newElements[i] = elements[i];
    
    // add the newest elements to the queue
    newElements[index] = value;
    
    // moves the next position the next number will be at
    index++;
    
    // clears location of old elements and sets new location
    elements = null;
    elements = newElements;
  }
  
  /**
   * dequeue
   *
   * This will take the current element in the front of the queue and return it
   * Then it will move the rest of the elements in the queue up one spot   
   *
   * Parameters:
   *   none
   *
   * Return Value:
   *   The first element in the queue
   */
  public int dequeue(){
    // This will grab the first element in the queue and save it as output
    int output = elements[0];
    
    // This will try and keep the smallest size possible for the queue
    if(index + 1 < size / 2)
      size /= 2;
    
    // declares a new queue that will store the smaller size
    int[] newElements = new int[size];
    
     // will go through the array and do a deep copy but leave out the first element
    for(int i = 1; i < index; i++)
      newElements[i - 1] = elements[i];
    
    // moves the spot where the next element will be placed back one
    index--;
    
    // clears location of old elements and sets new location
    elements = null;
    elements = newElements;
    
    return output;
  }
  
  /**
   * empty
   *
   * This will check if there are any elements in the queue 
   *
   * Parameters:
   *   none
   *
   * Return Value:
   *   If there are elements in the queue will return true
   *   If there are no elements in the queue will return false
   */
  public boolean empty(){
    if(index == 0)
      return true;
    else
      return false;
  }
  
  /**
   * getSize
   *
   * This will get the current amount of elements in the queue 
   *
   * Parameters:
   *   none
   *
   * Return Value:
   *   The current amount of elements in the queue
   */
  public int getSize(){
    return this.index;
  }
  
}