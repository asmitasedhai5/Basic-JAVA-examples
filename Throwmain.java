class Throwmain{
  public static void main(String args[])throws ArithmeticException,ArrayIndexOutOfBoundsException{
    int a=25/0;
    int x[]=new int[5];
    int i=0;
    if(a==5){
        System.out.println(a);
      }else{
        throw new ArithmeticException();
      }
      if(i==0){
        for(i=0;i<=x.length;i++){
          x[i]=i;
        }
      }
        else{
          throw new ArrayIndexOutOfBoundsException();
      }


  }

}
