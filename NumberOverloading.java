//Polymorphism
//Method overloading
class Number{
  double firstnum;
  double secondnum;
  double sum;

  public void add(double firstnum,double secondnum){
    sum=firstnum+firstnum;
    System.out.println("Sum is:"+sum);
  }

}
class NumberOverloading extends Number{
  double thirdnum;
  public void add(double firstnum,double secondnum,double thirdnum){
    sum=firstnum+firstnum+thirdnum;
    System.out.println("Sum is:"+sum);
  }
public static void main(String args[]){
  NumberOverloading n=new NumberOverloading();
  n.add(2,3);
  n.add(5.4,9,3);
}
}
