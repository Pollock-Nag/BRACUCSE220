import java.util.Scanner;
public class MyReader{
  int readInteger(){
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    int result=0;
    
    try{
      if(str.contains(".")){
        throw new EitaIntegerNoiException();
      }
      else{
        result= Integer.valueOf(str);
        System.out.println("You Give "+result);
      }
    }
    catch(EitaIntegerNoiException a){
      System.err.println("Ami DOSHOMIK number porte pari nah "+str);
    }
    return result;
  }
}