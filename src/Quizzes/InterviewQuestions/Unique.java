package Quizzes.InterviewQuestions;

import java.util.ArrayList;

public class Unique {

    public static void main(String[] args) {

        System.out.println(frqcy("samson", 's'));
        System.out.println(unique("AAAABBBCCCDEF"));

    }

    public static int frqcy(String str, char letter) {

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;
    }

    ///////////////////////////////


    public static String unique(String str) {
        String check = "";
        String unique = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!check.contains("" + str.charAt(i))) {
                count = frqcy(str, str.charAt(i));
                check += str.charAt(i);

            }
            if (count == 1) {
                unique += str.charAt(i);
            }
        }
        return unique;

    }
}


