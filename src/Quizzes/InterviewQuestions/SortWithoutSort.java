package Quizzes.InterviewQuestions;

import day52_inheritance.hiding.A;

import java.util.ArrayList;
import java.util.Arrays;

public class SortWithoutSort {

    public static void main(String[] args) {

        int [] num = {8,4,1,68,1,5,335,121,50,-1,0};
        System.out.println(Arrays.toString(sortAscending(num)));

        System.out.println();

        int [] num1 = {8,4,1,68,1,5,335,121,50,-1,0};
        System.out.println(Arrays.toString(sortDescending(num)));
    }

    public static int[] sortAscending (int[] arr){
        int swapTimes = 1;

        while (swapTimes>0)  {
            swapTimes = 0;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]>arr[i+1]) {
                    int a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                    swapTimes++;
                }  }  }
        return arr;
    }
    public static int[] sortDescending (int[] arr){
        int swapTimes = 1;

        while (swapTimes>0)  {
            swapTimes = 0;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]<arr[i+1]) {
                    int a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                    swapTimes++;
                }  }  }
        return arr;

    }
}
