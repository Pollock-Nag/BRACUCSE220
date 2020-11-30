import java.util.Scanner;
public class Lab09Task04{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a decimal value");
    int n = sc.nextInt();
    System.out.println("Binary output of "+n+" is "+bin(n));
  }
  
 static String bin (int n){
 String bin="";
 if(n==0||n==1){
 bin=""+n;
 }
 else{
 return bin=bin+bin(n/2)+n%2;
 }
 return bin;
 }
}