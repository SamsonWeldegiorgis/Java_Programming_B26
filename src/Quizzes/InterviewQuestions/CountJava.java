package Quizzes.InterviewQuestions;

import java.util.Arrays;

public class CountJava {
    public static void main(String[] args) {

        String str = "java and java world in java city";

        int java = 0;

        for (int i = 0; i < str.length() - 3; i++) {

            if (str.substring(i, i + 4).equalsIgnoreCase("java")) {
                java++;
            }
        }
        System.out.println("java = " + java); //3

    }
}

//        String str = "java and java world in java city";
//
//        int java = 0;
//
//        while (str.contains("java")) {
//            str = str.replaceFirst("java", "");
//            java++;
//        }
//        System.out.println("java = " + java); // 3


//    }
//}


