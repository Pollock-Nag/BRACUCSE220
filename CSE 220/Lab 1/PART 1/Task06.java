import java.util.Scanner;
public class Task06{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int a[] = new int[5];
    int count=0;
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<=a.length/2 ;i++){

      if(a[i]!=a[a.length-1-i]){
        count =1;
        break;
      }
    }    
    if(count==1){
      System.out.print("Not Palindrome");
    }
    else{
      System.out.print("Palindrome");
    }
  }
}