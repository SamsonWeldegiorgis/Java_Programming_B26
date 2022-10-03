package Quizzes.InterviewQuestions;

public class ReverseNegativeNumbe {
    public static void main(String[] args) {


        System.out.println(reverseInteger(-11544556));


    }

    public static int reverseInteger(int number) {
        boolean isNegative = number < 0 ? true : false;
        if (isNegative) {
            number *= -1; // num = nu*-1
        }
        int reverse = 0;
        int lastDigit = 0;

        while (number >= 1) {

            lastDigit = number % 10; // 15 % 10 =5        // gives us the las
            reverse = reverse * 10 + lastDigit;    // 15 *10 +5 == 155
            number = number / 10;    //     15 /10 == 1    // get rid of las
        }
        return isNegative == true ? reverse * -1 : reverse;


        /////////////////////////////////////////////////////

//
    }}

