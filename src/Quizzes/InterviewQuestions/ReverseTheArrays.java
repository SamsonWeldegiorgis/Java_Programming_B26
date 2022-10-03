package Quizzes.InterviewQuestions;

import java.util.Arrays;

public class ReverseTheArrays {

    public static void main(String[] args) {

        int [] num = {1,2,3,5,8,1,3,519,15,15};

        int [] rev = new int[num.length];

        for (int i = num.length-1 , j =0 ; i >=0 ;  j++ , i--) {

            rev[j] = num[i];

        }
        System.out.println(Arrays.toString(rev));

    }
}
