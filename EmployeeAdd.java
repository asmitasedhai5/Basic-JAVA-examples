//single Inheritance
class Employee{
  String firstname;
  String lastname;

  public void setEmpname(String fname,String lname){
    firstname=fname;
    lastname=lname;
  }
}
public class EmployeeAdd extends Employee{
  public void display(){
    System.out.print("Name of Employee is:"+firstname+" "+lastname);
  }
  public static void main(String args[]){
    EmployeeAdd emp=new EmployeeAdd();
    emp.setEmpname("Asmita","Sedhai");
    emp.display();
  }
}
