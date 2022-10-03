package day21_string4_Loop;

import java.util.Scanner;

public class Divisibleby3_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("put 3 numbers");



        int number = 100;
        result(number);
    }


    public static void result(int nu) {

        System.out.print("\nDivision of 3: ");
        for (int num = 1; num < nu; num++)
            // Short-circuit operator is used
            if (num % 3 == 0) {
                System.out.print(num+" ");


        }       System.out.print("\n\nDivision of 5: ");
        for (int num = 1; num < nu; num++)
            if (num % 5 == 0) {
                System.out.print(num+" ");


            }
        System.out.print("\n\nDivision of 15: ");
        for (int num = 1; num < nu; num++)
            if (num % 15 == 0) {
                System.out.print(num+" ");

        }  System.out.println();




}}

