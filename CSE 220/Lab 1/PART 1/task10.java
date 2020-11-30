import java.util.Scanner;
public class task10{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input month");
    int month=sc.nextInt();
    System.out.println("Please input day");
    int day=sc.nextInt();
    sc.close();
    System.out.println(season(month,day));
  }
  public static String season(int m,int d){
    String str="";
    switch(m){
      case 1:{
        str = "winter";
        break;
      }
      case 2:{
        str ="Winter";
        break;
      }
      case 3:{
        if(d<=15){
          str="Winter";
        }
        else{
          str="Spring";
        }
        break;
      }
      
      case 4 :{
        str = "Spring";
        break;
      }
      case 5:{
        str ="Spring";
        break;
      }
      case 6:{
        if(d<=15){
          str="Spring";
        }
        else{
          str="Summer";
        }
        break;
      }
      
      case 7:{
        str = "Summer";
        break;
      }
      case 8:{
        str ="Summer";
        break;
      }
      case 9:{
        if(d<=15){
          str="Summer";
        }
        else{
          str="Fall";
        }
        break;
      }
      
      case 10:{
        str = "Fall";
        break;
      }
      case 11:{
        str ="Fall";
        break;
      }
      case 12:{
        if(d<=15){
          str="Fall";
        }
        else{
          str="Winter";
        }
        break;
      }
    }
    return str;   
  }
}