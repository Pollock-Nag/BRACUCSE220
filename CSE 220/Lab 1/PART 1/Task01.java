import java.util.Scanner;
public class Task01{
  
  public static void main(String[] args){
    int[] a={2,3,4,6};
    int[] b={4,5,6,7,3};    
    boolean aRes=method1(a);
    boolean bRes=method1(b);
    System.out.println(aRes);
    System.out.println(bRes);
    
  }
  public static boolean method1(int[] arr){
    if(arr[0]==6 || arr[arr.length-1]==6){
      return true;
    }
    else{
      return false;
    }
  }
}