class Student{
  String name=null;

  public void show(){
    try{
    System.out.println(name.length());
  }catch(Exception e){
    System.out.println(e);
  }
}
}
class RuntimeExcep{
  public static void main(String args[]){
    Student s=new Student();
    //s.name;
    s.show();
  }
}
