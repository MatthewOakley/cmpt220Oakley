public class Problem2{
  public static void main(String[] args){
    
    Queue q = new Queue();
    
    System.out.println(q.empty());
    System.out.println(q.getSize());
    
    // inputs 20 numbers into the queue
    for(int i = 1; i < 20; i++){
      q.enqueue(i);
    }
    System.out.println(q.empty());
    System.out.println(q.getSize());
  }
}