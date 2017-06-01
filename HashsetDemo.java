//Hashset
import java.util.*;
class HashsetDemo{
  public static void main(String[] args) {
    Set<Integer> values=new HashSet<Integer>();
    values.add(1);
    values.add(2);
    values.add(3);
    values.add(4);
    values.add(5);
    values.add(1);

    //values.remove(1);
   for(Integer numbers:values){
    System.out.println(numbers);
  }
  }
}
