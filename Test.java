class Student{
  int roll;
  String stname;

  public void setname(String stname){
    this.stname=stname;
  }

  public String getname(){
    return stname;
  }
}

class Pass{
  public void passByValue(int roll){
    System.out.println("Value is: "+roll);
  }
  public void passByRef(Student s){
    System.out.println("Name is:"+s.getname());
  }

}
public class Test{
  public static void main(String args[]){
    Student s1=new Student();
    s1.setname("asmita");
    Pass p=new Pass();
    p.passByValue(5);
    p.passByRef(s1);
 //System.out.println( s1.getname(s1.stname));
  //  System.out.println(s1.stname);
  }
}
