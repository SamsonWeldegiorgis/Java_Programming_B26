package Quizzes.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class AllZerosToBack {

    public static void main(String[] args) {

        int num =0;
        ArrayList<Integer> bucket = new ArrayList<>(Arrays.asList(1,0,5,8,0,6,45,0,8,11,0,51,0,1,0,51,0,94));
        System.out.println(moveAllZeros(bucket, num));
    }
    public static ArrayList<Integer> moveAllZeros (ArrayList<Integer> list, int num){
        int orgZero = list.size();

        list.removeIf(zero -> zero==num);
        int newZero = list.size();

        int allRemoved = orgZero-newZero;

        for (int i = 0; i <allRemoved; i++) {
            list.add(num);
        }
        return list;


    }
}

