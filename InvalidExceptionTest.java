//InvalidAgeExcption--custom exception
import java.lang.Exception;
class InvalidAgeException extends Exception
{
  InvalidAgeException(String s)
  {
    super(s);
  }
}
class InvalidExceptionTest
{
  static void validate(int age)throws InvalidAgeException{
    if(age<18){
      throw new InvalidAgeException("Your age is not valid.");
    }
    else{
      System.out.println("You can Vote.");
    }
  }
  public static void main(String[] args) {
    try{
     validate(13);
     }
    catch(Exception m){
      System.out.println("Exception occured: "+m);
    }
 }
}
