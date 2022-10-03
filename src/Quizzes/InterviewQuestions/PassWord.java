package Quizzes.InterviewQuestions;

public class PassWord {

    public static void main(String[] args) {

        String password = "a?G6jdsaja";


        boolean length = password.length() >= 8 ;
        boolean upper = password.matches(".*[A-Z].*");
        boolean lower = password.matches(".*[a-z].*");
        boolean number = password.matches(".*[1-9].*");
        boolean special  = password.matches(".*[!@.,#$?].*");

        boolean valid = length && upper && lower && number && special;

        if(valid) {
            System.out.println("Password is Valid");
        }else {
            System.out.println("Password is NOT Valid");

        }}}