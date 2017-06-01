//LinkedHashset
import java.util.*;
class LinkedHashsetDemo{
  public static void main(String[] args) {
    Set<String> values=new LinkedHashSet<String>();
    values.add("a");
    values.add("b");
    values.add("d");
    values.add("c");
    values.add("g");
    //values.add(1);
    //values.remove(1);
    //for(Integer numbers:values){
    System.out.println(values);
//  }
  }
}
