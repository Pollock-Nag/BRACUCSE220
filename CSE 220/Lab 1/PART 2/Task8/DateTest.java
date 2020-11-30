public class DateTest extends Date{
  public static void main (String[]args){
    
    Date date = new Date();
    
    date.setMonth(9);
    date.setDay(22);
    date.setYear(2019);
    
    System.out.println("Month: "+date.getMonth());
    System.out.println("Day: "+date.getDay());
    System.out.println("Year: "+date.getYear());
    
    System.out.println("Date: "+date.displayDate());
    
    
  }
}