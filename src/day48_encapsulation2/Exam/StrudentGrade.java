package day48_encapsulation2.Exam;

import java.util.Scanner;

public class StrudentGrade {
    public static void main(String[] args) {

        // ask how # qns in the exam
        // ask how # qns missed
        // give final grade

        Scanner input = new Scanner(System.in);
        int totalQuestions;
        int missed;
        System.out.println("How many questions are there in the final exam?");
        totalQuestions=input.nextInt();

        System.out.println("How many questions did student missed?");
        missed=input.nextInt();

        FinalExam math = new FinalExam(totalQuestions, missed);
        System.out.println(math.getScore());
        System.out.println(math.getGrade());


    }
}
