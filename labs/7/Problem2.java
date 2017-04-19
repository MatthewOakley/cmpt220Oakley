public class Problem2{
  public static void main(String[] args){
    
    Queue q = new Queue();
    
    System.out.println(q.empty());
    System.out.println(q.getSize());
    q.enqueue(5);
    System.out.println(q.empty());
    System.out.println(q.getSize());
  }
}