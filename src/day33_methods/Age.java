package day33_methods;

import java.util.Scanner;

public class Age {
      /*
    make a method that calculated the prints the age
    takes the birth year as an input
     */

    public static void main(String[] args) {
        yourAge(1981);
        int year = 1990;
        yourAge(year);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthday year");
        yourAge(input.nextInt());
    }
    public static void yourAge(int birthYear){
        System.out.println("Your age is : " +(2022- birthYear));
    }
}
