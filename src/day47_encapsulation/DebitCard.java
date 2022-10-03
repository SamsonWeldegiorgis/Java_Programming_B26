package day47_encapsulation;

public class DebitCard {
    /*
    Instance variables : card number(long), holder name (String ); card type (String), pin(int), balance(double)
     */

    long cardNumber;                    // instance variables
    String holderName;
    String cardType;
    int pin;
    double balances;


    static String accountType;            // static variables

    static {                              // static block
        System.out.println("STATIC BLOCK-------running");
        accountType = "checking";
    }

    public DebitCard(long cardNumber, String holderName, double balances) {     // constructor,,,,,
        this.holderName = holderName;              // "this" refers to the instance of DebitCard objects
        this.balances = balances;
        // Create a constructor that will create a debit card object
        if (String.valueOf(cardNumber).length() == 16) {  // ("" +  cardNumber).length()==16;
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid Card #"); // err makes the output RED
        }

    }

    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balances) {
        this(cardNumber, holderName, balances);                      // constructor with methods,,,,

        //The card type must be either MasterCard or Visa to be valid card type
        if (cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("mastercard")) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid card type= Must be visa or mastercard");
        }
        // pin must be only 4 characters long
        if (String.valueOf(pin).length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin : Must be 4 digits");

        }
    }
        // Add the toString method that will print
    public String toString () {
        String info = "Holder Name: " + holderName ;

        if(cardNumber !=0) {
            info += "\nCard Number: " +  cardNumber;
        }
        if (cardType !=null) {
            info += "\n Card Type: " +  cardType;
        }
        info += "\nBalance: " + balances;
        return info ;
    }


}
