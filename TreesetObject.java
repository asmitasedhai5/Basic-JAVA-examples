//import java.util.Treeset;
import java.util.Set;
import java.util.TreeSet;
class Employee implements Comparable<Employee>{
  private int id;
  private String name;
  public int compareTo(Employee e)
  {
      if(this.id==e.id)
          return 0;
      else if(this.id>e.id)
          return 1;
      else
          return 0;
  }
  public void setid(int id){
    this.id=id;
  }
  public int getid(){
    return id;
  }
  public void setname(String name){

    this.name=name;
  }
  public String getname(){
    return name;

  }
}
public class TreesetObject{
  public static void main(String args[]){
    Employee p1=new Employee();
    p1.setid(1);
    p1.setname("Buck");
    Employee p2=new Employee();
    p2.setid(2);
    p2.setname("Sandy");
    Employee p3=new Employee();
    p3.setid(3);
    p3.setname("Alex");
    Employee p4=new Employee();
    p4.setid(4);
    p4.setname("Maggie");
    Employee p5=new Employee();
    p5.setid(4);
    p5.setname("Maggie");
    Set<Employee> nameofpersons=new TreeSet<>();
    nameofpersons.add(p1);
    nameofpersons.add(p2);
    nameofpersons.add(p3);
    nameofpersons.add(p4);
    nameofpersons.add(p5);
    System.out.println("ID"+"   "+"Name");
    for(Employee person:nameofpersons){
      System.out.println(person.getid()+"    "+person.getname());

  }
  }
}
