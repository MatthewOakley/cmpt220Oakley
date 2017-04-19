public class Queue {
  
  private int[] elements = new int[DEFAULT_SIZE];
  private int size = 8;
  private static final int DEFAULT_SIZE = 8;
  private int fill = 0;
  
  
  // default constructor
  Queue(){
    
  }
  
  public void enqueue(int value){
    int[] newElements = new int[size + 1];
    
    // add new element to queue
    this.fill++;
    
    // will go through the array and do a deep copy
    for(int i = 0; i < size; i++){
      newElements[i] = elements[i];
    }
    
    if(this.size == this.fill){
      this.size++;
    }
    
    // sets last index to the user input
    newElements[size - 1] = value;
    
    // clears location of old elements and sets new location
    elements = null;
    elements = newElements;
  }
  
  //dequeue(){}
  
  public boolean empty(){
    if(this.fill == 0)
      return true;
    else
      return false;
  }
  
  public int getSize(){
    return this.size;
  }
  
}