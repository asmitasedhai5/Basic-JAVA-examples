//Super keyword
//constructor
class Student{
  String name;

  Student(String name){
    this.name=name;
      System.out.println("Parent class"+name);
  }

  /*public void display(){
    System.out.println(name);
  }*/
}
class SuperConstructor extends Student{
  String name;

  SuperConstructor(String name){
      super(name);
    this.name=name;

  }
  public void display(){
    System.out.println(name);
    //super.display();
  }
  public static void main(String args[]){
    SuperConstructor s=new SuperConstructor("abc");
    //s.name="aba";
    //s.setname("xyz");
    s.display();
  }
}
