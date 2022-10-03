package day57_exceptions.Bank;

public class NotEnoughMoneyException extends RuntimeException {

    public NotEnoughMoneyException(){
        super("Not enough money in the account"); // constructor
    }
    public NotEnoughMoneyException(String msg){
        super(msg);
    }

}

