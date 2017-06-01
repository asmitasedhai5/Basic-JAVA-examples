//Hierarchical Inheritance
class Area{
  public static final double PI=3.14;
  double radius;
  double length;
  double breadth;
  double area;
  public void displayArea(){
    System.out.println(area);
  }

}
class CircleArea extends Area{
  public void calculateCircleArea(double radius){
    area=PI*radius;

  }
}
class RectangleArea extends Area{
  public void calculatRectangleArea(double l,double b){
    area=l*b;
  }
}
public class TestArea{
  public static void main(String args[]){
    CircleArea ca=new CircleArea();
    ca.calculateCircleArea(5);
    System.out.print("Area of circle is:");
    ca.displayArea();
    RectangleArea ra=new RectangleArea();
    ra.calculatRectangleArea(5,4);
    System.out.print("Area of rectangle is:");
    ra.displayArea();
    }
}
