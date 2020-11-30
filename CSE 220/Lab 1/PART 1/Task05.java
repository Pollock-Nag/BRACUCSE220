import java.util.Scanner;
public class Task05{
  
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int a[] = new int[15];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int n=0;n<=9;n++){
      int count=0;
      for(int i=0;i<a.length;i++){
        if(a[i]==n){
          count++;
        }
      }
      System.out.println(n+" was found "+count+" times");;
      
    }
  }
}