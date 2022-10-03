package day10_scanner;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        /*
        Ask the user to enter a number.
        Check if that number is evenly divisible by 2, 3, and 5.
        Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
         */

        Scanner in= new Scanner(System.in);

        System.out.println("Enter a number");

        int num1 = in.nextInt();
//        int num3 = in.nextInt();
//        int num5= in.nextInt();

        boolean by2= num1 % 2 == 0;
        boolean by3= num1 % 3 == 0;
        boolean by5= num1 % 5 == 0;

        System.out.println("DivisibleByTwo is :"+(num1%2)+" =" +by2);
        System.out.println("DivisibleByThree is :" +(num1%3)+" =" +by3);
        System.out.println("DivisibleByFive is:" +(num1%5)+" =" +by5);


        boolean bb = num1 % 2==0;
        boolean cc = num1 % 3 ==0;
        boolean dd = num1 % 5==0;

        System.out.println(num1+"bb%2:" +(num1%2)+" :" +bb);
        System.out.println(num1+"cc%3:"+(num1%3)+" :" +cc);
        System.out.println(num1+"dd%5:"+(num1%5)+" :" +dd);



    }
}
