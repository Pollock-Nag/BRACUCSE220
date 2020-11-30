public class Patient{
  public int id=0;
  public String name="Default Name";
  public int age= -1;
  public String bloodGroup="Default Blood Group";

  public Patient(String n, int a, String bG,int id){
  name=n;
  age=a;
  bloodGroup=bG;
  this.id=id;
  }
  public String toString(){
   return "ID: "+id+"\nName: "+name+"\nAge: "+age+"\nBlood Group: "+bloodGroup;
  }
}