import java.util.Scanner;
public class Task03{
  
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        if(a[j]<a[i]){
          int temp=a[j];
          a[j]=a[i];
          a[i]=temp;
        }
      }
    }
    for(int j=0;j<a.length;j++){
      System.out.print(a[j]+", ");
    }
    for(int j=0;j<a.length-1;j++){
      if(a[j]%2==0){
        System.out.print(a[j]+", ");
      }
    }
    System.out.println(a[a.length-1]+". ");
  }
}
