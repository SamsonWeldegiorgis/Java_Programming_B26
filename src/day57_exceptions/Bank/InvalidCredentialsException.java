package day57_exceptions.Bank;

public class InvalidCredentialsException extends Exception {

  // this is a checked exception now b/se the parent is the Exception class

    public InvalidCredentialsException(String msg){
        super(msg);
    }

}
