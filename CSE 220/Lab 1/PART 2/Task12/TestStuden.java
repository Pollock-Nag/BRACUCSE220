public class TestStuden{
  public static void printShout(Studen s){
    System.out.println("------------------");
    System.out.println(s.msg);
    System.out.println(s.shout());
  }
  public static void main(String [] args){
    Studen s = new Studen();
    CSEStuden cs = new CSEStuden();
    CSE111Studen cs111 = new CSE111Studen();
    System.out.println(s.msg);
    System.out.println(cs.msg);
    System.out.println(cs111.msg);
    printShout(s);
    printShout(cs);
    printShout(cs111);
  }
}
//  I love BU
//I want to transfer to CSE
//I love Java Programming
//------------------
//I love BU
//I love BU
//------------------
//I love BU
//I want to transfer to CSE
//------------------
//I love BU
//I love Java Programming