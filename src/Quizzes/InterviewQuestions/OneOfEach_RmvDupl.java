package Quizzes.InterviewQuestions;

public class OneOfEach_RmvDupl {
    public static void main(String[] args) {

        removeDupl("AAAAABBBCCCDEF");

    }
    public static void removeDupl(String str){
        String unique="";

        for (int i = 0; i < str.length(); i++) {
            if(!unique.contains(""+ str.charAt(i))){
                unique+=str.charAt(i);
            }
        }
        System.out.println(unique);



    }
}
