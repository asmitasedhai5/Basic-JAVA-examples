import java.util.*;
class Menu{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);

    do{
      System.out.println();
      System.out.println("--------MENU---------");
      System.out.println();
      System.out.println("Press 1 for Addition.");
      System.out.println("Press 2 for Subtraction.");
      System.out.println("Press 3 for Multiplication.");
      System.out.println("Press 4 for Division.");
      System.out.println();
      System.out.println("Enter your choice: ");
      int num=s.nextInt();
      System.out.println();

      switch(num)
      {
        case 1:
          System.out.println("Enter first number: ");
          int num1=s.nextInt();
          System.out.println("Enter second number: ");
          int num2=s.nextInt();
          int sum=num1+num2;
          System.out.println("Sum is : "+sum);
          System.out.println();
          break;
        case 2:
          System.out.println("Enter first number: ");
          int num3=s.nextInt();
          System.out.println("Enter second number: ");
          int num4=s.nextInt();
          int diff=num3-num4;
          System.out.println("Difference is : "+diff);
          System.out.println();
            break;
        case 3:
          System.out.println("Enter first number: ");
          int num5=s.nextInt();
          System.out.println("Enter second number: ");
          int num6=s.nextInt();
          int mul=num5*num6;
          System.out.println("Multiplication is : "+mul);
          System.out.println();
          break;
        case 4:
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
