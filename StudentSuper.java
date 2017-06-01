//super keyword
//variable
class Student{
  String name;

}
class Superst extends Student{
  String name;
  public void display(){
    System.out.println("Firstname:"+name);
    System.out.println("Secondname:"+super.name);
  }

  public static void main(String args[]){
    Superst s=new Superst();
    s.name="abc";
  }

}
