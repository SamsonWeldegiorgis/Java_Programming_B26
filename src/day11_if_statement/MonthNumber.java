package day11_if_statement;

import java.util.Scanner;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        /*
        create a int variable to represent the month number, where 1 is Janurary
        and 12 is Decemeber.
        use the month number input to determine how many days are in that month.
        use the following data to help you determine the number of days in each
            month:
        Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
        Months that has 30 days: 4, 6, 9, 11
        Month that has 28 days: 2
        ex:
            12
            31 days
                ex:
                    9
                    30 days
         */
//        int monthOfTheYear=50;

        Scanner scan = new Scanner(System.in);
        System.out.println("\nPut a number of the month :");
        int monthOfTheYear = scan.nextInt();

        if (monthOfTheYear ==1 || monthOfTheYear ==3 || monthOfTheYear ==5 ||
                monthOfTheYear ==7 || monthOfTheYear ==8 || monthOfTheYear ==10 ||
                monthOfTheYear ==12 ) {
            System.out.println("It has 31 days");
        }else if ( monthOfTheYear==2) {
            System.out.println("It has 28 days");
        }else if (monthOfTheYear ==4 || monthOfTheYear ==6 || monthOfTheYear ==9 ||
                monthOfTheYear ==11) {
            System.out.println("It has 30 days");
        }
        else {
            System.out.println("Not a number for month, put a Valid number !");
    }




        //////////////////CORRECTION OF SAIM ///////////////

//        int month = 11;   // scanner.nextInt();
//
//        boolean has30Days = month ==4 || month ==6 ||month ==9 ||
//                month ==11;
//        boolean has31Days = month ==1 || month ==3 ||month ==5 ||
//                            month ==7 ||month ==8 ||month ==10 ||month ==12;
//        boolean has28Days = month==2;
//
//        if (has31Days){
//            System.out.println("is 31 days");
//        }
//        if(has30Days) {
//            System.out.println("is 30 days");
//        }
//        if (has28Days) {
//            System.out.println("is 28 days");
        }
    }

