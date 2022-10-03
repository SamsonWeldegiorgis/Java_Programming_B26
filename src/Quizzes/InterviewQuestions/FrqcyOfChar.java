package Quizzes.InterviewQuestions;

import java.util.Arrays;

public class FrqcyOfChar {


    public static void main(String[] args) {

        frqcyOfChar("APPLE",0);
        System.out.println();
        frqcyOfChar("MUMU",0);

    }


    public static void frqcyOfChar(String str, int num) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char letter = str.charAt(i);
            if (result.contains("" + letter)) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                char letterAgain = str.charAt(j);

                if (letter == letterAgain) {
                    count++;
                }
            }
            System.out.print("" + letter+ " ~ " + count);
            result += letter;
        }

        System.out.println("====================");

        int numm = 123;

        num = Math.abs(numm);
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;

        }
        System.out.println(sum);

        try {
            String word = "java";

            System.out.println(word.charAt(100));


        } catch (Exception e) {
            System.out.println("Exception happened");


        }
    }}

