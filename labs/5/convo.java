import java.util.Scanner;
import java.util.Arrays;

public class convo{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int len1 = 0;
    int len2 = 0;
    
    len1 = input.nextInt();
    len2 = input.nextInt();
    
    // declares array and inputs the numbers
    double[] array1 = new double[len1];
    for(int i = 0; i < len1; i++)
      array1[i] = input.nextDouble();
    
    double[] array2 = new double[len2];
    for(int j = 0; j < len2; j++)
      array2[j] = input.nextDouble();
    
    double[] result = convolveVectors(array1, array2);
    
    int[] resultInt = new int[len1 + len2 - 1];
    
    for(int m = 0; m < (len1 + len2 -1); m++)
      resultInt[m] = (int)Math.round(result[m]);
    
    for(int q = 0; q < resultInt.length; q++)
      System.out.print(resultInt[q] + " ");
    
    System.out.println();
  }
  
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    // write your code here
    
    // flips second array
    for(int k = 0; k < vSecond.length / 2; k++){
      double temp = vSecond[k];
      vSecond[k] = vSecond[vSecond.length - k - 1];
      vSecond[vSecond.length - k - 1] = temp;
    }
    
    // will go through the entire convolution process
    for(int index = 0; index < vResult.length; index++){
      // makes sure no garbage numbers are in the array
      vResult[index] = 0;
      // this is where shifting and multiplying happens
      for(int shift = 0; shift <= index; shift++){
        // will make sure it does not go out of bounds
        if( (index - shift >= 0) && ( (shift <= index) && ( (index-shift < vFirst.length) && ( shift < vSecond.length) ) ) ){
          vResult[index] += vFirst[index - shift] * vSecond[shift];
        }
      }
      // testing code
      // System.out.println("TEST: " + Arrays.toString(vResult));
    }
    
    return vResult;  
  }
}