import java.util.Scanner;
public class Lab09Task01{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Value of n:");
    int n = sc.nextInt();
    System.out.println("Factorial of "+n+" is "+fact(n));
  }
  static int fact(int x){
    if(x==0||x==1){
    return 1;
    }
      return x*fact(x-1);
  }
}