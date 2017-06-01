import java.util.*;
class MenuOperator{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);

     do{
      System.out.println();
      System.out.println("--------MENU---------");
      System.out.println();
      System.out.println("Press + for Addition.");
      System.out.println("Press - for Subtraction.");
      System.out.println("Press * for Multiplication.");
      System.out.println("Press / for Division.");
      System.out.println();
      System.out.println("Enter your choice: ");
      String str=s.next();
      char ch=str.charAt(0);
      System.out.println();

      switch(ch)
      {
        case '+':
          System.out.println("Enter first number: ");
          int num1=s.nextInt();
          System.out.println("Enter second number: ");
          int num2=s.nextInt();
          int sum=num1+num2;
          System.out.println("Sum is : "+sum);
          System.out.println();
          break;
        case '-':
          System.out.println("Enter first number: ");
          int num3=s.nextInt();
          System.out.println("Enter second number: ");
          int num4=s.nextInt();
          int diff=num3-num4;
          System.out.println("Difference is : "+diff);
          System.out.println();
            break;
        case '*':
          System.out.println("Enter first number: ");
          int num5=s.nextInt();
          System.out.println("Enter second number: ");
          int num6=s.nextInt();
          int mul=num5*num6;
          System.out.println("Multiplication is : "+mul);
          System.out.println();
          break;
        case '/':
          System.out.println("Enter first number: ");
          int num7=s.nextInt();
          System.out.println("Enter second number: ");
          int num8=s.nextInt();
          int div=num7/num8;
          System.out.println("Division is : "+div);
          System.out.println();
          break;
        default:
          System.out.println("You have entered wrong option.");
          System.out.println();
      }
    }while(true);

  }
}
