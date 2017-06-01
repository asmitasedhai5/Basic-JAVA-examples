//Multilevel Inheritance
class Student{
  int roll;
  String studentname;
}
class Studentone{
  public void setStudentInfo(int roll,String studentname){
    this.roll=roll;
    this.studentname=studentname;
  }
}
class Studenttwo{
  public void displayInfo(){
    System.out.println("Name of student is:"+studentname);
    System.out.println("Roll No. is:"+roll);
  }
  public static void main(String args[]){
    Student2 student=new Student2();
    student.setStudentInfo(5,"Asmita Sedhai");
    student.displayInfo;
  }
}
