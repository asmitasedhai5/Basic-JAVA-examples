//nested try bolck
class Nestedtry{
  public static void main(String args[]) throws {
    try{
      try{
        int a=25/0;
      }
      catch(ArithmeticException e){
          System.out.println("Its an Arithmetic error");
        }
      try{
        int x[]=new int[5];
        for(int i=0;i<=x.length;i++){
            x[i]=i;
          }
        }
        catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Its an error");
        }
      }
      catch(Exception e){
        System.out.println(e);
      }

}
}
