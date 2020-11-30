public class Square{
  double heigth = 0.0;
  double width=0.0;
  double area=0.0; 
  
  
  public double getHeight(){
    return heigth;
  }
  public  void setHeight(double h){
   heigth =h;
  }
  public  double getWidth (){
    return width;
  }
  public void setWidth (double w){
    width=w;
  }
  public double getArea (){
    area=heigth*width;
    return area;
  }
}