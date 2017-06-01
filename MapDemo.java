import java.util.*;
class MapDemo{
 public static void main(String args[]){
  Map<Integer,String> map=new HashMap<Integer,String>();
  map.put(01,"Andrea");
  map.put(02,"Vicky");
  map.put(03,"Robin");
  for(Map.Entry m:map.entrySet()){
   System.out.println(m.getKey()+" "+m.getValue());
  }
 }
}
