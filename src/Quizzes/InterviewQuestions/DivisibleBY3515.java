package Quizzes.InterviewQuestions;

import day07_uniry_operators.SalaryCalculator;

public class DivisibleBY3515 {
    public static void main(String[] args) {


        int number = 100;
        result(number);
    }


    public static void result(int nu) {

        System.out.print("\nDivision of 3: ");
        for (int i = 1; i < nu; i++)
            // Short-circuit operator is used
            if (i % 3 == 0) {
                System.out.print(i+" ");

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

        System.out.println(" --------------------------------------------------");


        }
}
