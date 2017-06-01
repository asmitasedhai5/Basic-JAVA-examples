class ThrowTest{
  static void doSomethings(){
    try{
      throw new NullPointerException("doSomthingTestings");
    }
    catch(NullPointerException e){
      System.out.println("Caught inside doSomethings!!!"+e.getMessage());
    }
  }
  public static void main(String args[]){
    doSomethings();
  }
}
