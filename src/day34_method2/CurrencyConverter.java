package day34_method2;

import java.util.Scanner;
<<<<<<< HEAD
/*
create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type
Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro ,,    1 dollar = 121.03 yen   ,,,   1 dollar = 14.85 lira ,,,1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on method

Ex: Input: 		euro, 100  	Output: 	91
Ex:	Input:		yen, 50  	Output:  6051.5
 */

public class CurrencyConverter {



        public static void main(String[] args) {
            System.out.println(converter("lira", 250));

            Scanner input = new Scanner(System.in);
            System.out.println("Put the currency type");
            String type = input.nextLine();
            System.out.println("Put the amount");
            double amount = input.nextDouble();
            System.out.println(converter(type,amount));
        }

        public static double converter (String type, double amount){

            switch (type.toLowerCase()) {
                case "euro" :
                    return amount*0.91;
                case "yen" :
                    return amount*121.03;
                case "lira" :
                    return amount*12.85;
                case "won" :
                    return amount * 1_217.52;
                case "rupee" :
                    return amount * 181.45;
                default:
                    return 0;


            }
        }


public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the currency type");
        String currencyType = in.next();
        System.out.println("Enter the currency amount");
        double currencyAmountAs$ = in.nextDouble();
        currency(currencyType , currencyAmountAs$);

    }
    public static double currency(String currencyType ,double currencyAmountAs$){
        switch (currencyType) {
            case "Euro":
                return currencyAmountAs$ * 0.91;
            case "yen":
                return currencyAmountAs$ * 121.03;
            case "lira":
                return currencyAmountAs$ * 14.85;
            case "won":
                return currencyAmountAs$ * 1_217.52;
            case "rupee":
                return currencyAmountAs$ * 181.45;
            default:
                return 0;

        }}
>>>>>>> github/master
}
