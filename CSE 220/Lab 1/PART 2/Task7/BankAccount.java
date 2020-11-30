public class BankAccount{
  String name="Default name";
  String add="Default Address";
  String aId=" Default AccountID";
  double blnc=0.0;
  
  public String getName(){
    return name;
  }
  public void setName(String n){
    name=n;
  }
  public String getAccountID(){
    return aId;
  }
  public void setAccountID(String i){
    aId=i;
  }
  public String getAddress(){
    return add;
  }
  public void setAddress(String a){
    add=a;
  }
  public double getBalance(){
    return blnc;
  }
  public void setBalance(double c){
    blnc=c;
  }
  public void addInterest(){
   System.out.println("Interest for "+this.getName()+" is = " +(blnc+((blnc*7)/100)));
  }
}
