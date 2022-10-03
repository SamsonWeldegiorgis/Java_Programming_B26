package Quizzes.InterviewQuestions;

public class OddOrEven {
    public static void main(String[] args) {

    evenOrOdd(20);
}

        public static void evenOrOdd (int num){


            System.out.print("Even Numbers: ");
            for (int i = 0; i <= num; i++)
                if(i % 2 ==0){
                    System.out.print(i+" ");
                }
            System.out.print("\nOdd Numbers : ");
            for (int i = 0; i <= num; i++)
                if(i % 2 !=0){
                    System.out.print(i+" ");
            }


    }
}
