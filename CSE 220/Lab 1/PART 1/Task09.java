import java.util.Scanner;
public class Task09{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a=new int[10];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    print(a);
    square(a);
    print(a);
  }
  public static void square(int[] a){
    for(int i=0;i<a.length;i++){
      a[i]*=a[i];
    }
  }
  public static void print(int[] a){
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
}