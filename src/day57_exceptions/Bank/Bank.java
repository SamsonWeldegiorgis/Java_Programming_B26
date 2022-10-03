package day57_exceptions.Bank;

public class Bank {


        double balance;


        public void withdraw(double amountToTakeOUt){
            if(amountToTakeOUt > balance){

//                NotEnoughMoneyException e = new NotEnoughMoneyException();
                throw new NotEnoughMoneyException("Balance only has " + balance);
        // the message will print 1st if NOT the default constructor will be printed in the console

        }
            balance-=amountToTakeOUt;
    }
    // in this method we throw checked exceptions , so they must be handled, but we created the clas so we don't want to handle it. We use throws to allow the program to compile so the user of the class handles the exceptions.

    // we use throw for exceptions ..............

    public void login(String userName, String passWord) throws InvalidCredentialsException{

            if(!userName.equals("jamesbond")){
                throw new InvalidCredentialsException("Invalid username");
            }
            if(!passWord.equals("007")){
                throw new InvalidCredentialsException("Invalid password");
            }
                System.out.println("LOGIN");

    }
}
