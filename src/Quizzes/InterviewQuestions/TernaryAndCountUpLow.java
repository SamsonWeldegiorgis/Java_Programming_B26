package Quizzes.InterviewQuestions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class TernaryAndCountUpLow {
    public static void main(String[] args) {


        String str = "Wlcome To AutomatioN";

        ArrayList<String> upper = new ArrayList<>();
        ArrayList<String> lower = new ArrayList<>();

        int up = 0;
        int low = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upper.add("" + str.charAt(i));
                up++;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                lower.add("" + str.charAt(i));
                low++;



            }
        }
        System.out.println("Upper : " + upper);
        System.out.println("Lower : " + lower);
        System.out.println("Up : " + up);
        System.out.println("Low : " + low);

        char [] one = str.toCharArray();
        Arrays.sort(one);
        System.out.println(one);

        System.out.println("=========================================");


        int num = 10;
        int num1 = 50;
        int max = num > num1 ? num :num1 ;
        System.out.println("Max : "+ max);
    }





}

