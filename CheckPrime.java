class CheckPrime{
  public static void main(String args[]){
    int number=8;
    boolean isprime=true;

    for(int i=2;i<number;i++){
      if(number%i==0){
        isprime=false;
        break;
      }
    }
    if(isprime){
      System.out.println(number+" is a prime number");
    }
    else{
      System.out.println(number+" is not a prime number");
    }
  }
}
