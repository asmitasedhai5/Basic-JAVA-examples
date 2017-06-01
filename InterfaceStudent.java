//Interface Polymorphism
interface Student{
  String name="Asmita";
  int roll=5;
  int section=1;

  void show();
}

class InterfaceS implements Student{
  public void show(){
    System.out.println(name);
  //  System.out.println(roll);
  }
}
class interfaceStudent implements Student{
  public void show(){
  //  System.out.println(name);
  System.out.println(roll);
  }

  public static void main(String args[]){
    Student s=new InterfaceS();
    s.show();
    InterfaceStudent is=new InterfaceStudent();
    is.show();

  }
}
