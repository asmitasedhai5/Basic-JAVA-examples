//Abstract class
abstract class Distance{
  int x;
  int y;
  abstract void show();
  public void set(int x,int y){
    this.x=x;
    this.y=y;

  }
}
class Abstractdemo extends Distance{
  public void show(){
    System.out.println("("+x+","+y+")");
  }
public static void main(String args[]){
  Distance d=new Abstractdemo();
  d.set(5,5);
  d.show();
}
}
