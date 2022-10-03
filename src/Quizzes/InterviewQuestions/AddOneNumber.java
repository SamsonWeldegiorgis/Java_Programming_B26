package Quizzes.InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class AddOneNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to have");

        int size = input.nextInt();
        int [] num = new int[size];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Put the numbers");
            num[i]= input.nextInt();

        }
        System.out.println("So far you have : " + Arrays.toString(num));
        int [] newNumber = Arrays.copyOf(num, num.length+1);
        System.out.println("Put the number you want to add");
        newNumber[newNumber.length-1] = input.nextInt();

        System.out.println("Now you have :  " + Arrays.toString(newNumber));



    }}