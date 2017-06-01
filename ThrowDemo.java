//Throw and Throws keyword
import java.lang.Exception;
class Number{
  int number;
  public void displaynum()throws ArithmeticException{

    number=25/0;
    if(number>0){
    System.out.println(number);
  }
  else{
    throw new ArithmeticException("Error");
  }
  }
}
  class ThrowDemo{
  public static void main(String args[]){
    Number num=new Number();
    try{
    num.displaynum();
    }
    catch(ArithmeticException e){
      System.out.println("It is an Arithmetic Error");
      //System.out.println(e.getMessage());
  }
  }
}
