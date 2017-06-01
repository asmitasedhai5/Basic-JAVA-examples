//Multi catch
class Multicatch{
  public static void main(String args[]){
    try{
    int a=25/0;
    int x[]=new int[5];
    for(int i=0;i<=x.length;i++){
      x[i]=i;
    }
  }
catch(ArithmeticException e){
    System.out.println("Its an Arithmetic error");
  }
  catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Its an error");
  }
 catch(Exception e){System.out.println(e);}

}
}
