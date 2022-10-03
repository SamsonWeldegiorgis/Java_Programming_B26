package Quizzes.InterviewQuestions;

public class MaxMin {

    public static void main(String[] args) {

        int [] num = {1,2,3,5,8,1,3,519,15,15};
        int maxx = num[0];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minn = num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i] > max ) {
                max= num[i];
            } if ( num[i] < min){
                min = num[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
