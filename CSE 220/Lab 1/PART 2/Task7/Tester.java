public class Tester{
  public static void main(String[] args){
    BankAccount a  = new BankAccount();
    BankAccount b  = new BankAccount();
    BankAccount c  = new BankAccount();
    
    a.setName("Ratul");
    a.setAccountID("100001");
    a.setAddress("Dhaka");
    a.setBalance(5000.00);
    System.out.println("Name: "+a.getName());
    System.out.println("ID: "+a.getAccountID());
    System.out.println("Address: "+a.getAddress());
    System.out.println("Balance: "+a.getBalance());
    a.addInterest();
    System.out.println("*******************************");
    
    b.setName("Putul");
    b.setAccountID("100002");
    b.setAddress("Bogura");
    b.setBalance(3000.00);
    System.out.println("Name: "+b.getName());
    System.out.println("ID: "+b.getAccountID());
    System.out.println("Address: "+b.getAddress());
    System.out.println("Balance: "+b.getBalance());
    b.addInterest();
    System.out.println("*******************************");
    
    c.setName("Tutul");
    c.setAccountID("100003");
    c.setAddress("Munshigonj");
    c.setBalance(3500.00);
    System.out.println("Name: "+c.getName());
    System.out.println("ID: "+c.getAccountID());
    System.out.println("Address: "+c.getAddress());
    System.out.println("Balance: "+c.getBalance());
    c.addInterest();
    
  }
}