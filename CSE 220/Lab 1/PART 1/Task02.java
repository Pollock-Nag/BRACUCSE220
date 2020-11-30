import java.util.Scanner;
public class Task02{
  
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
    }
    int big=a[0];
    int bigI=0;
    int small=a[0];
    int smallI=0;
    for(int i=0;i<a.length;i++){
      if(a[i]>big){
        big=a[i];
        bigI=i;
      }
      else if(a[i]<small){
      small=a[i];
      smallI=i;
      }
    }
    int temp = a[bigI];
    a[bigI]=a[smallI];
    a[smallI]=temp;
    for(int i=0;i<a.length-1;i++){
    System.out.print(a[i]+",");
    }
    System.out.println(a[a.length-1]);
  }
}