package Quizzes.InterviewQuestions;

public class Reverse2ndLetter {
    public static void main(String[] args) {

    String str = "I EVOL YOU";
        System.out.println(reverse2nd(str));

    }

    public static String reverse2nd (String str) {
        String [] word = str.split(" ");
        String reverse= "";

        for (int i =word[1].length()-1 ; i >=0 ; i--) {
            reverse += word[1].charAt(i);
        }

        word[1] = reverse;
        String result = "";

        for(String each : word){
            result += each +" ";


        }
        return result.trim();

        }}

