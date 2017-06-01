import java.util.*;
class Member{
  private int id;
  private String name;
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
public class LinkedHashsetObject{
  public static void main(String args[]){
    Member p1=new Member();
    p1.setid(1);
    p1.setname("Buck");
    Member p2=new Member();
    p2.setid(2);
    p2.setname("Sandy");
    Member p3=new Member();
    p3.setid(3);
    p3.setname("Alex");
    Member p4=new Member();
    p4.setid(4);
    p4.setname("Maggie");
    Member p5=new Member();
    p5.setid(4);
    p5.setname("Maggie");
    Set<Member> nameofpersons=new LinkedHashSet<>();
    nameofpersons.add(p1);
    nameofpersons.add(p2);
    nameofpersons.add(p3);
    nameofpersons.add(p4);
    nameofpersons.add(p5);
    System.out.println("ID"+"   "+"Name");
    for(Member person:nameofpersons){
      System.out.println(person.getid()+"    "+person.getname());

  }
  }
}
