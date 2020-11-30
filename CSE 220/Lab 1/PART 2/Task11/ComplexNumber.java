public class ComplexNumber extends RealNumber{
  public double imaginaryValue=1.0;
  public ComplexNumber(){
    super(1.0);
    imaginaryValue=1.0;
  }
  public ComplexNumber(double x,double y){
    super(x);
    imaginaryValue=y;
  }
  public String toString(){
    System.out.println(super.toString());
    return "ImaginaryPart "+getComplexValue();
  }
  public double getComplexValue() {
    return imaginaryValue;
  }
  public void ping(){    
    System.out.println("I'm in ComplexNumber class");
    super.ping();
  }
  public void check(){
    ping();
    System.out.println("Checking ended");
  }
}