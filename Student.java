class Student{
  int roll;
  String stname;

  public setname(String stname){
    this.stname=stname;
  }

  public getname(stname){
    return stname;
  }

  public passByValue(int roll){
    System.out.println("Value is: "+x);
  }

}
public class Test{
  public static void main(String args[]){
    Student s=new Student();
    s.passByValue(5);
    s.stname="Asmita";
    System.out.println(s.stname);
  }
}
