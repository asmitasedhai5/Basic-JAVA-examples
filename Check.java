import java.util.*;
public class Check{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter any number:");
    int num=s.nextInt();
    int r,sum=0,a;
    a=num;
    while(num>0){
      r=num%10;
      sum=(sum*10)+r;
      num=num/10;
    }
    if(a==sum){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }

  }
}
