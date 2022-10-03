package Quizzes.InterviewQuestions;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {

        finra(20);


}



//        Scanner input = new Scanner(System.in);
//        System.out.println("Put the number");
//        int num = input.nextInt();

    public static void finra (int num) {

        for (int i = 1; i < num; i++) {

            if (i % 3 == 0) {
                System.out.println("Fin" + "- " + i);
            }
            if (i % 5 == 0) {
                System.out.println("Ra" + "- " + i);
            }
             if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fin-Ra" + "- " + i);


            } else {
                System.out.println(i);
            }

        }
    }}