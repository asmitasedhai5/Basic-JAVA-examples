//Polymorphism
//Runtime polymorphism(overriding)
class Number{
  double firstnum;
  double secondnum;
  double sum;

  public void add(double firstnum,double secondnum){
    sum=firstnum+firstnum;
    System.out.println("Sum is:"+sum);
  }
}
class NumberRuntimea extends Number{
  //double thirdnum;
  public void add(double firstnum,double secondnum){
    sum=firstnum+firstnum;
    System.out.println("Sum of Runtimea is:"+sum);
  }
}
class NumberRuntime extends Number{
  //double thirdnum;
  public void add(double firstnum,double secondnum){
    sum=firstnum+firstnum;
    System.out.println("Sum of runtime is:"+sum);
  }
public static void main(String args[]){
  Number n=new NumberRuntime();
  n.add(2,3);
  Number na=new NumberRuntimea();
  na.add(7,5);
  //n.add(5.4,9);
}
}
