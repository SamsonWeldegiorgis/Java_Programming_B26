package Quizzes.InterviewQuestions;

import javax.swing.plaf.PanelUI;

public class Remove2Letter {
    public static void main(String[] args) {

        System.out.println("Remover : " +remover("Nadir" , 2));
        System.out.println("Retro : " + retroMeeting("Nadir"));


}
   public static String remover (String str, int num){
        String remo = "" ;

       for (int i = 0; i < str.length(); i+=num) {
           remo += str.charAt(i);


       }
       return remo;



        }

        public static String retroMeeting (String str){
        String remo = "";

            for (int i = 0; i < str.length(); i+=2) {
                remo += str.charAt(i);

                }
                return remo;
            }
        }



