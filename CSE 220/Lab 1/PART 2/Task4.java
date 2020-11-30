import java.util.InputMismatchException;
import java.util.Scanner;
public class Task4{
  public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    try{
      int x,n=sc.nextInt();
      int a[]=new int[n];
      
      a[5]=99;
      x=n/0;
    }
    catch(ArithmeticException b){
      System.err.println("Mathetical Error");
    }
    catch(ArrayIndexOutOfBoundsException b){
      System.err.println("Out Of Length");
    }
    catch (InputMismatchException b){
      System.err.println("Input is Incorrect");
    }
    catch(NegativeArraySizeException b){
      System.err.println("Array Length can cot be negative");
    }
    catch(Exception b){
      System.err.println("Something went Wrong");
    }
    finally{
      System.out.println("THE END");
    }
    sc.close();
  } 
}
