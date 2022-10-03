package day37_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {

    public static void main(String[] args) {

        String year = "2022";
        System.out.println("This year : "+ (year));
//        System.out.println("Next year will be: "+ (year + 1));// wrong 20221

        int numYear = Integer.parseInt(year);
        System.out.println("Next year will be: "+ (numYear + 1));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: I am x years old");
        String str = input.nextLine() ; // I am x years old
        // in 5 years you will be $ageIn5Years :

        String agePart = str.split(" ")[2];
        int age = Integer.parseInt(agePart);
        System.out.println("In five years, you will be " +(age+5));

/*
 I am x years old
 i am 10 years old
 str.split(" ") --- {"I", "am" , "10" , "years", "old" } --> arr[2] --> 10
 */
            //////////Parse and value of //////////////
           String str4 = "123";
              int man = Integer.parseInt(str4);
                 System.out.println("Value of : " + (man));
                System.out.println("Value of : " +                                       (man+10));

                String str2= "1.5";
                double e = Double.valueOf(str2);
                System.out.println("Value of : " + (e*30));

                }}