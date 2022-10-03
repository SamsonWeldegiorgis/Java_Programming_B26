package Quizzes.InterviewQuestions;

public class SumOfStringDigit {

    public static void main(String[] args) {


        System.out.println(sumOfDigits("12jkkggf8"));

    }
    public static int sumOfDigits (String str){
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt("" + str.charAt(i));
            }
        }
        return sum;
    }
}

