//Abstact Interface
interface Operation{
 int a=5;
 int b=5;
  void sum();
  void mul();
  //void sub();
}
class Demo implements Operation{
  public void sum(){
    System.out.println(a+b);
  }

  public void mul(){
    System.out.println(a-b);
  }

  public static void main(String args[]){
    Operation o=new Demo();
    o.sum();
    o.mul();
    //o.sum();
  }
}
