import java.util.Scanner;
import java.util.Arrays;

public class Problem4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter the number of rows and columns of the array: ");
    
    // gets row and column
    int row = input.nextInt();
    int column = input.nextInt();
    
    // gets all the array numbers
    System.out.println("Enter the array: ");
    double[][] array = new double[3][4];
    for(int i = 0; i < row; i++){
      for(int j = 0; j < column; j++){
        array[i][j] = input.nextDouble();
      }
    }
    
    int[] cords = locateLargest(array);
    
    System.out.println("The location of the largest element is at (" 
        + cords[0] + ", " + cords[1] + ")");
  }
  
  public static int[] locateLargest(double[][] a){
    
    // sets a minimum value
    double min = a[0][0];
    
    int[] cords = {0,0};
    
    // looks to see if a lower value is found
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
        if(min < a[i][j]){
          min = a[i][j];
          cords[0] = i;
          cords[1] = j;
        }
      }
    }
    
    return cords;
    
  }
}