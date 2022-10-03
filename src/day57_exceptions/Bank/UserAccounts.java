package day57_exceptions.Bank;

public class UserAccounts {
    public static void main(String[] args) {

        Bank accoutONe = new Bank();
        accoutONe.balance = 1000;
        accoutONe.withdraw(500);
        System.out.println(accoutONe.balance);//500

//        accoutONe.withdraw(2000);  // uncomment this to see the exception

        // Valid LOgin
        try {
            accoutONe.login("jamesbond", "007");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

        // invalid userName
        try {
            accoutONe.login("james", "007");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
        // invalid passWord
        try {
            accoutONe.login("jamesbond", "00700");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());

        }
    }
}
