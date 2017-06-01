//Arithmetic Exception
class Number{
  int number;
  public void displaynum(){
    try{
    number=25/0;
    System.out.println(number);
  }catch(Exception e){
    System.out.println(e);
  }
  }
}
  class Arithexcep{
  public static void main(String args[]){
    Number num=new Number();
    num.displaynum();
  }
}
