//constructor
class Box{
  double length;
  double breadth;
  double height;
  double volume;

  public Box(){
    System.out.println("We are calculating volume of a box");
  }
  public Box(double length,double breadth,double height){
    this.length=length;
    this.breadth=breadth;
    this.height=height;
    volume=(length*breadth*height);
    System.out.println("Volume of Box is:"+volume);
  }
}
class BoxTest{
  public static void main(String args[]){
    Box b1=new Box();
    Box b2=new Box(5,6,7);
  }
}
