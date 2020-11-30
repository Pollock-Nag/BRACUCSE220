import java.util.*;
public class Tester{
  public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  String menu="Enter your Choice:\n1.Register patient\n2.Serve a patient\n3.Cancel all appointments\n4.Can doctor go home\n5.List of all patient\n6.Exit";
  System.out.println("Welcme to Nag's Hospital");
  System.out.println(menu);
  
   int select = 0;
    WRM w = new WRM();
    
    while(select!=6){
      try{
        select=sc.nextInt();
        if(select==1){
          w.RegisterPatient();
          System.out.println("---\n"+menu);
        }
        else if(select == 2){
          w.ServePatient();
          System.out.println("---\n"+menu);
          
        }
        else if(select == 3){
          w.CancelAll();
          System.out.println("---\n"+menu);
          
        }
        else if(select == 4){
          //w.CanDoctorGoHome();
          System.out.println(w.CanDoctorGoHome()+"\n---\n"+menu);
        }
        else if(select == 5){
          w.ShowAllPatient();
          System.out.println("---\n"+menu);
        }
        else if(select == 6){
          System.out.println("Thank You");
        }
        else{
          System.out.println(menu);
        }
      }
      
      catch(Exception e){
        System.err.println("Input Format Mismatch! Please, try Again.\n"+menu);
        sc.next();
      }
    }
  }
}
