package Quizzes.InterviewQuestions;

public class Codility_Test_Coders {
    public static void main(String[] args) {


        /* any number divisible by 2 ,3 or 5  should be replaced by the word Codility, Test or Coders respectively.

         */
        /* any number divisible by 2 ,3 or 5  should be replaced by the word CodilityTestCoders,
        /* any number divisible by 2 ,3 should be replaced by the word CodilityTest.
        /* any number divisible by 2 ,5  should be replaced by the word CodilityCoders .
        /* any number divisible by 2 by Codility .
        /* any number divisible by 3 by Test .
        /* any number divisible by 5 by Coders .

         */

        printConsecutive(100);
    }


        public static void printConsecutive(int n){

            for (int i = 1; i <= n; i++) {
                if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                    System.out.println("CodilityTestCoders");
                }else if(i % 2 == 0 && i % 3 == 0){
                    System.out.println("CodilityTest");
                }else if(i % 2 == 0 && i % 5 == 0){
                    System.out.println("CodilityCoders");
                }else if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("TestCoders");
                }else if(i % 2 == 0){
                    System.out.println("Codility");
                }else if(i % 3 == 0){
                    System.out.println("Test");
                }else if(i % 5 == 0){
                    System.out.println("Coders");
                }else{
                    System.out.println(i);
                }
            }
        }





//
//
//        int num1 = 40;
//
//        for (int i = 1; i < num1; i++) {
//            if(i % 2 ==0){
//                System.out.println(i+"-"+"Codility");
//            }else if( i % 3==0){
//                System.out.println(i+"-"+"Test");
//            }else if (i % 5 ==0){
//                System.out.println(i+"-"+"Coders");
//            }else {
//                System.out.println(i);
            }

