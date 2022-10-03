package Quizzes.InterviewQuestions;

public class PrimeNumbers {
    public static void main(String[] args) {


        primeNUmber(47);
        primeNUmber(20);
        primeNUmber(37);


    }
        public static void primeNUmber ( int num){

            boolean isPrime = true;
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrime = false;

                }
            }

            System.out.println(isPrime);

        }
    }
