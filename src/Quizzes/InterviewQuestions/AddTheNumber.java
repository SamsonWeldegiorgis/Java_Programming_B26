package Quizzes.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTheNumber {
    public static void main(String[] args) {

        /*
        input = 45659
        output :
            4+5+6+5+9 =     29
                2+9    =     11
                1 + 1  =      2
         */

        int number = 45659 ;  // 45659   = 29   ; 2+ 9 = 11  ;   1 + 1 = 2;
        while(true){

            int sum = 0 ;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                sum += digit;

            }
            number = sum  ;
            System.out.println(sum);
            if(sum <9 ){
                break;
    }
}}}
