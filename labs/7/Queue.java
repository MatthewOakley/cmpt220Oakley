public class Queue {
  
  private static final int DEFAULT_SIZE = 8;
  private int size = DEFAULT_SIZE;
  private int[] elements = new int[size];
  private int index = 0;
  
  
  // default constructor
  Queue(){
    
  }
  
  public void enqueue(int value){
    
    elements[index] = value;
    
    index++;
    
    if(index + 2 == size)
      size *= 2;
    
    int[] newElements = new int[size];
    
    // will go through the array and do a deep copy
    for(int i = 0; i < index; i++){
      newElements[i] = elements[i];
      System.out.println("1: " + newElements[i] + " 2: " + elements[i]);
    }
    System.out.println("--------------------");
    System.out.println(newElements.length);
    System.out.println("--------------------");
    
    
    
    // clears location of old elements and sets new location
    elements = null;
    elements = newElements;
  }
  
  //dequeue(){}
  
  public boolean empty(){
    if(index == 0)
      return true;
    else
      return false;
  }
  
  public int getSize(){
    return this.size;
  }
  
}