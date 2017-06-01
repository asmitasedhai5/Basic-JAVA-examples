//Interface
interface Distance{
 int x=5;
int y=6;
  void show();


  }
  interface Area{
    int length=10;
    int breadth=10;
    void calculate();
  }
class Interfacedemo implements Distance,Area{

  public void show(){
    System.out.println("("+x+","+y+")");
  }
  public void calculate(){
    System.out.println("Area is:"+(length*breadth));
  }
public static void main(String args[]){
  Distance d=new Interfacedemo();

  d.show();
  Area a=new Interfacedemo();
  a.calculate();
}
}
