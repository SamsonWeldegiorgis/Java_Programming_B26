package Quizzes.InterviewQuestions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Put the number");
        int num = input.nextInt();
        // 371;

        int first = num / 100; // 371 / 100 = 3
        int second = (num / 10) % 10; // 371 / 10 = 37 % 10 = 7
        int third = num % 10; // 371 % 10 = 1;

        int checker = (first * first * first) + (second * second * second) + (third * third * third);
//                            3 * 3 * 3     +    7 * 7 * 7   + 1 * 1 *1 = 371

        System.out.println(first); // 3
        System.out.println(second); // 7
        System.out.println(third);   // 1
        System.out.println(checker);

        if (checker == num) {

            System.out.println("Armstrong");
        } else {
            System.out.println("NOT Armstrong");
        }

    }
    }

