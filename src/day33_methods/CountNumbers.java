package day33_methods;


            /*
            count from 0 - till you give ,,,,method (5) = 0 1 2 3 4 5
                                             method (10)= 0 1 2 3 4 5 6 7 8 9 10
        */

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        counter(8);
        counter(10);
        counter(-100);
        System.out.println();
        Scanner input = new Scanner (System.in);
        System.out.println("Put the number you want");
        counter(input.nextInt());
    }


    public static void counter (int numbers){
        for (int i = 0; i <=numbers ; i++) {
            System.out.print(i+ " ");

        }
    }

}
