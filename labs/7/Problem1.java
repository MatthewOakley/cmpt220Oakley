public class Problem1{
  public static void main(String[] args){
    
    // declares a bmi object with preset values
    BMI bmi = new BMI("matt", 18, 133, 5, 4);
    
    System.out.println("BMI: " + bmi.getBMI());
    System.out.println("Status: " + bmi.getStatus());
    
  }
}