//Abstract using Polymorphism
abstract class Student{
  String name;
  int roll;

  abstract void showname();
  abstract void showroll();
  void display(){
    System.out.println("Name is:"+name+" "+"Roll is:"+roll);
  }

class StudentTest extends Student{
  public void showname(){
    System.out.println("Name:"+name);
  }
  public void showroll(){
    System.out.println(":"+name);
  }
  public static void main(String args[]){
    Student s=new StudentTest();
    s.name="abc";
    s.roll=5;
    s.showname();
    s.showroll();

  }
}
