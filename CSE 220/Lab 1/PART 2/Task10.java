import java.util.Scanner;
public class Task10{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    int[] a = {1, 4, 8, 16, 25, 36, 49, 64, 81, 100};
    
    System.out.println("Enter Position: ");
    int pos = sc.nextInt();
    
    System.out.println("Left Rotate:");
    
    for(int i = pos ; i<a.length ; i++){
      System.out.print(a[i]+", ");
    }
    
    for(int i = 0 ; i<pos-1; i++){
      System.out.print(a[i]+", ");
    }
    
    System.out.println(a[pos-1]+"\n");
    
    System.out.println("Right Rotate:");
    
    for(int i = a.length-pos ; i<a.length ; i++){
      System.out.print(a[i]+", ");
    }
    
    for(int i = 0 ; i<(a.length-pos)-1; i++){
      System.out.print(a[i]+", ");
    }
    System.out.println(a[(a.length-pos)-1]);
    
  }
}