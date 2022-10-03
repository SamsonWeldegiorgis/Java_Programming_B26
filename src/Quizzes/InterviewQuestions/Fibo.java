package Quizzes.InterviewQuestions;

import java.util.Arrays;

public class Fibo {

    public static void main(String[] args) {

                     fibo(10);


}

    public static  void fibo (int num ){
        int [] fibo = new int[num+ 1];

        fibo[0]=0;
        fibo[1]=1;

        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        System.out.println(Arrays.toString(fibo));



}
}