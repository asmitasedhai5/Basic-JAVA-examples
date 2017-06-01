//Abstact and Interface
interface Operation{
  int a=5;
  int b=5;
  void sum();
  void sub();
}

abstract class Operationmul implements Operation{
  abstract void mul();
  public void sum(){
    System.out.println("Sum of "+a+"+"+b+"is:"+(a+b));
  }
  public void sub(){
    System.out.println("Sum of "+a+"-"+b+"is:"+(a-b));
  }
}

class AIdemo extends Operationmul{

  public void mul(){
    System.out.println("Sum of "+a+"*"+b+"is:"+(a*b));
  }
  public static void main(String args[]){
    Operationmul o=new AIdemo();
    o.sum();
    o.sub();
    o.mul();
  }
}
