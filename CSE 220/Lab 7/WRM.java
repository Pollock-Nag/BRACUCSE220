import java.util.*;
public class WRM{
  Scanner sc= new Scanner(System.in);
  Queue q;
  public static int id=10000;
  public WRM(){
    q= new ArrayQueue();
  }
  public void RegisterPatient(){
    id++;
    System.out.println("Please Enter Name");
    String n = sc.next();
    
    System.out.println("Please Enter Age");
    int a = sc.nextInt();
    
    System.out.println("Please Enter Blood Group");
    String b = sc.next();
    
    Patient p = new Patient (n, a, b,id);
      try{
      q.enqueue(p);
      System.out.println(p.name+" Added");
    }
    catch(QueueOverflowException e){
      System.err.println("Sorry! No space availavle to add new patient");
    }
  }
  
  
  public void ServePatient(){

    try{
      Patient p1 = (Patient)q.dequeue();
      System.out.println(p1.name+" Served");
    }
    catch(QueueUnderflowException e){
      System.err.println("Bingo! All patients are already being served");
    }
  }
  
  public void CancelAll(){
    if(q.size()>0){
      System.out.println("All appointment has been canceled");
    }
    
    for(int i=0;i<=q.size();i++){
      try{
        q.dequeue();
      }
      catch (QueueUnderflowException e){
        System.err.println(" No Appointment");
      }
    }
  }
  
  public boolean CanDoctorGoHome(){
    boolean flag= false;
    if(q.isEmpty()){
      flag=true;
    }
    return flag;
  }  
  
  public void ShowAllPatient(){
    Object[] temp = q.toArray();
    
       if(q.size()==0){
      System.err.println("No Appointment");
    }
    
    

 
    else{
      
          for(int i=0;i<q.size();i++){
      for(int j=i+1;j<q.size();j++){
        Patient p1 = (Patient) temp[i];
        Patient p2= (Patient) temp[j];
        if(p1.name.compareTo(p2.name)>0){
          Object swap= temp[i];
          temp[i]= temp[j];
          temp[j]=swap;
        }
      }
    }
      
      
      for(int k=0; k<temp.length;k++){
        System.out.println(temp[k]);
      }
    }
  }  
}


