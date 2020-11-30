import java.util.Scanner;
public class Task08{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the size");
    int x = sc.nextInt();
    int[] a = new int [x];
    int[] b = new int [x];
    int[] c = new int[x];
    System.out.println("Enter number for Matrix A");
    for(int i=0; i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Enter number for Matrix B");
    for(int i=0; i<b.length;i++){
      b[i]=sc.nextInt();
    }
    System.out.print("C = [ ");
     for(int i=0; i<c.length;i++){
      c[i]=5*a[i]-b[i];
      System.out.print(+c[i]+" ");
    }
    System.out.println("]");
  }
}