//super keyword
//method
class Student{
  String name;

  public void setname(String name){
    this.name=name;
  }

  public void display(){
    System.out.println(name);
  }
}
class SuperMethod extends Student{
  String name;

  public void display(){
    System.out.println(name);
    super.display();
  }
  public static void main(String args[]){
    SuperMethod s=new SuperMethod();
    s.name="aba";
    s.setname("xyz");
    s.display();
  }
}
