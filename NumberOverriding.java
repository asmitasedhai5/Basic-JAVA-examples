//Polymorphism
//Method overriding
class Number{
  double firstnum;
  double secondnum;
  double sum;

  public void add(double firstnum,double secondnum){
    sum=firstnum+firstnum;
    System.out.println("Sum is:"+sum);
  }

}
class NumberOverriding extends Number{
  //double thirdnum;
  public void add(double firstnum,double secondnum){
    sum=firstnum+firstnum;
    System.out.println("Sum is:"+sum);
  }
public static void main(String args[]){
  NumberOverriding n=new NumberOverriding();
  n.add(2,3);
  n.add(5.4,9);
}
}
