import java.util.*;

public class Lab09Task02 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter numbers for fibonacci serise");
  int n = sc.nextInt();
  System.out.println("fibonacci Answer is:" + fibonacci(n));
 }

 static int fibonacci(int n) {
  if (n == 0) {
   return 0;
  }
  if (n == 1) {
   return 1;
  }
  return fibonacci(n - 1) + fibonacci(n - 2);
 }
}