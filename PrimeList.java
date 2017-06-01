class PrimeList{
  public  static void main(String args[]){
    int n=20;
  //  int i=1;
    for(int i=1;i<n;i++){
      if(n%i!=0 && n%1==0 && n%n==0){
        System.out.println(i);
      }
    }
  }
}
