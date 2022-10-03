package Quizzes.InterviewQuestions;

import day52_inheritance.hiding.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortWithoutSortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> bucket = new ArrayList<>(Arrays.asList(1, 2, 3, 0, 45, 15, 2, 4, 31, 31, 551));

        System.out.println((sortAscending(bucket)));
        System.out.println((sortDescending(bucket)));
    }

    public static List<Integer> sortAscending(List<Integer> arr) {
        int swapTimes = 1;

        while (swapTimes > 0) {
            swapTimes = 0;
            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i) > arr.get(i + 1)) {
                    int a = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, a);
                    swapTimes++;
                }
            }
        }
        return arr;
    }
    public static ArrayList<Integer> sortDescending (ArrayList<Integer> arr){
        int swapTimes = 1;

        while (swapTimes>0)  {
            swapTimes = 0;
            for (int i = 0; i < arr.size()-1; i++) {
                if (arr.get(i)<arr.get(i+1)) {
                    int a = arr.get(i);
                    arr.set(i, arr.get(i+1));
                    arr.set(i+1, a);
                    swapTimes++;
                }
            }
        }
        return arr;


    }
}
