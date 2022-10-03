package Quizzes.InterviewQuestions;

import day20_string_examples3.SearchResult;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {




    int [] num1 = {1,3,5,7,9};
    int [] num2 = {2,4,6,8,10};
        System.out.println(Arrays.toString(concat(num1,num2)));



}
    public static int [] concat (int[] arr1 ,int[] arr2){

        int [] arr3 =new int[arr1.length + arr2.length];
            int j =0;

        for (int i = 0; i <arr3.length-1 ; i+=2) {
                arr3[i]= arr1[j];
                arr3[i+1]= arr2[j];
                j++;

        } return arr3;

        }}


