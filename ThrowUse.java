//Throw and Throws keyword
//import java.lang.Exception;
class ThrowUse{
  static int number=25/0;
  static void displaynum()throws ArithmeticException{
      //number=25/0;
      //if(number>0){
      //System.out.println(number);
    //}
    //else{
      throw new ArithmeticException("Caught Error");
   //}
    }
  public static void main(String args[]){
    try{
      displaynum();
    }
    catch(ArithmeticException e){
      System.out.println("It is an Arithmetic Error:"+e.getMessage());

  }
  }
}
