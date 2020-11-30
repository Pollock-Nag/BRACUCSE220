import java.util.Scanner;
public class Tester{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    ParenthesesBalancing a = new ParenthesesBalancing();
    System.out.println("Please Chose One: \n1.Array\n2.List");
    int c = sc.nextInt();
    System.out.println("Please Enter The Equation:");
    String eqn= sc.nextline();
    System.out.println(a.check(eqn,c));
  }
}