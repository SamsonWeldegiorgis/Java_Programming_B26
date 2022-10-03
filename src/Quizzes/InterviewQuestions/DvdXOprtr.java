package Quizzes.InterviewQuestions;

public class DvdXOprtr {
    public static void main(String[] args) {

        System.out.println(divided(100,50));
}

        public static int divided (int num1, int num2){
            boolean negative = false;

            if(num1 <0){
                num1 =-num1;
                if(num2 < 0){
                    num2=-num2;
                }else {
                    negative=true;
                }
            }else if(num2 <0){
                num2=-num2;
                negative=true;
            }

            int result =0;
            while (num1 >= num2){
                num1=-num2;
                result++;

            }
            if(negative) {
                return -result;
            }
            return result;
            }
        }
