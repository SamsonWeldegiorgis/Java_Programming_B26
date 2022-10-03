package Quizzes.InterviewQuestions;

public class Reverse {
    public static void main(String[] args) {


        reverser("TOMAS");
        reverser("DCBA");
    }

    public static void reverser (String str){
        String result ="";

        for (int i = str.length()-1; i >=0; i--) {
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
