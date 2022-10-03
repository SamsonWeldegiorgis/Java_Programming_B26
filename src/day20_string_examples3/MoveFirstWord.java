package day20_string_examples3;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        /*
          Given a sentence. Display the sentence with the first word
          moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java

        Hint: Use indexOf and substring

         */

        Scanner in = new Scanner(System.in);
//        System.out.println("Put the sentence");
//        String sentence = in.nextLine().trim().toUpperCase();

        String result = "MyDreams";

        int spaceIndex = result.indexOf(' '); // we can use this for many chars(" ")
//        System.out.println(spaceIndex);     //    Input: Java is a fun language

        System.out.println(result);


         String firstWord= result.substring(0,result.length()-2 );

        System.out.println(result);
        System.out.println(firstWord);


        result = result.substring(spaceIndex+1) + " " + result+"?";  //  or use spaceIndex.Trim();

        System.out.println(result);

//        String javaTrim = sentence.substring(5,20);
//        System.out.println(javaTrim+sentence);




    }
}
