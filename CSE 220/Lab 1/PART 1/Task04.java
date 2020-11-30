import java.util.Scanner;
public class Task04{
  
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
      
      for(int j=0;j<i;j++){
        if(a[i]==a[j]){
        System.out.println(a[i]+" is already in among the entered numbers Please enter a new number.");
        i--;
        }
      }
    }
  }
}