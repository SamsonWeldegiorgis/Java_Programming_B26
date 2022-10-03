package day34_method2;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
//        numberAsWord(22);
        System.out.println(numberAsWord(5));
        System.out.println(numberAsWord(10));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(input.nextInt()));
    }

    public static String numberAsWord(int num) {

                 if (num<1 || num>10){
                     return num + " is an invalid number";
                 }


        String[] words = {"One", "Two", "Three", "Four", "FIVE", "Six", "Seven", "Eight", "Nine", "Ten"};

        return words[num - 1]; // -1 will convert the number to index
    }
}