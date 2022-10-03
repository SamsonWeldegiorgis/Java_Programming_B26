package Quizzes.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        String str = "Silent";
        String str2 = "ilentS";

        anagram(str,str2);
    }

    public static void anagram (String str, String str2 ){
         str = "Silent";
         str2 = "iSletn";

        char [] one = str.toCharArray();
        char [] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort( two);

        System.out.println("One :" + Arrays.toString(one));
        System.out.println("Two :" + Arrays.toString(two));


            if(Arrays.equals(one, two)){

            System.out.println("It is Anagram ");
        }else
        {
            System.out.println("It is NOT Anagram ");



        }}


    }

