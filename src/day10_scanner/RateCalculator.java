package day10_scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        /*
        write a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your yearly salary");
        double salary = input.nextDouble();
        System.out.println("How many hours do you work in week ?");
        int hours = input.nextInt();

//        double oneYearSalary = salary * hours;
        double hourlyRate = salary/ ( hours * 52);

//        System.out.println("Your one year salary is : $" +oneYearSalary);
        System.out.println("Your hoursly rate of the year is : $" + hourlyRate);

    }
}
