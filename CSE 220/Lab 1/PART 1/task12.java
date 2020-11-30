import java.util.Scanner;
public class task12{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input Month 1");
    int m1=sc.nextInt();
    System.out.println("Please input Day 1");
    int d1=sc.nextInt();
    System.out.println("Please input Month 2");
    int m2=sc.nextInt();
    System.out.println("Please input Day 2");
    int d2=sc.nextInt();
    System.out.println(met(m1,d1,m2,d2));
    sc.close();
  }
  public static boolean met(int m1,int d1,int m2, int d2){
    
    if(m1<m2){
      return true;
    }
    else if(m1==m2){
      if(d1<d2){
        return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }
}