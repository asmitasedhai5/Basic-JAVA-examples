//Multilevel Inheritance
class Student{
  int roll;
  String studentname;
}
class Studentone extends Student{
  public void setStudentInfo(int r,String stname){
    roll=r;
    studentname=stname;
  }
}
class Studenttwo extends Studentone{
  public void displayInfo(){
    System.out.println("Name of student is:"+studentname);
    System.out.println("Roll No. is:"+roll);
  }
  public static void main(String args[]){
    Studenttwo st=new Studenttwo();
    st.setStudentInfo(5,"Asmita Sedhai");
    st.displayInfo();
  }
}
