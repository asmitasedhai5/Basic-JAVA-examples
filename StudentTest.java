//Abstract using Polymorphism
abstract class Student{
  String name;
  int roll;
  int section;

  abstract void show(String name,int roll);
  abstract void show(String name,int roll,int section);
}

class StudentTest extends Student{
  public void show(String name,int roll){
    System.out.println(name);
    System.out.println(roll);
  }
  public void show(String name,int roll,int section){
    System.out.println(name);
    System.out.println(roll);
    System.out.println(section);
  }
  public static void main(String args[]){
    Student s=new StudentTest();
    s.show("Asmita",5);
    s.show("Asmita",5,1);
  }
}
