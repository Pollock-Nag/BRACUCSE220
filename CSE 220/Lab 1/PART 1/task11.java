import java.util.Scanner;
public class task11{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input an Integer");
    int n=sc.nextInt();
    System.out.println(allDigitsOdd(n));
    sc.close();
  }
  public static boolean allDigitsOdd(int n){
    String str=""+n;
    boolean flag= true;
    for(int i=0;i<str.length();i++){
      if((str.charAt(i))%2==0){
        flag=false;
        break;
      }
    }
    return flag;
  }
}