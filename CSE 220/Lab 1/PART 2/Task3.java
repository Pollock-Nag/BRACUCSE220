import java.util.Scanner;
public class Task3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x,n=sc.nextInt();
    int a[]=new int[n];
    try{
      a[5]=99;
      x=n/0;
    }
    catch(ArithmeticException b){
      System.err.println("Mathetical Error");
    }
    catch(ArrayIndexOutOfBoundsException b){
      System.err.println("Out Of Length");
    }
    finally{
      System.out.println("THE END");
    }
    sc.close();
  } 
}
