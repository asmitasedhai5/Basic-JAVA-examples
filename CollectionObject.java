import java.util.*;
class Person{
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
class CollectionObject{
  public static void main(String args[]){
    Person p1=new Person();
    p1.setid(1);
    p1.setname("Buck");
    Person p2=new Person();
    p2.setid(2);
    p2.setname("Sandy");
    Person p3=new Person();
    p3.setid(3);
    p3.setname("Alex");
    Person p4=new Person();
    p4.setid(4);
    p4.setname("Maggie");
    Person p5=new Person();
    p5.setid(5);
    p5.setname("John");
    List<Person> nameofpersons=new ArrayList<>();
    nameofpersons.add(p1);
    nameofpersons.add(p2);
    nameofpersons.add(p3);
    nameofpersons.add(p4);
    nameofpersons.add(p5);
    System.out.println("ID"+"   "+"Name");
    for(Person person:nameofpersons){
      System.out.println(person.getid()+"    "+person.getname());

  }
  }
}
