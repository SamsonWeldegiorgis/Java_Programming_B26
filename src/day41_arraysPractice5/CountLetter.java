package day41_arraysPractice5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CountLetter {

    /*
:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
letter: ‘a’
Output:
6
     */
    public static void main(String[] args) {

        String []  st = {"java", "html", "css", "java", "javascript", "selenium"};
        System.out.println(counter(st));
    }

    //    public static Integer  counter(ArrayList<String> word){
    public static int  counter(String []  word) {
        ArrayList<Integer> bucket = new ArrayList<>();

        int count = 0;

        for (String each : word) {

            if (each.equals("java")) {
                count++;

            }
        }
        return count;

    }
}


//    ArrayList<String> str = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
//        System.out.println(newList(str));
//
//                }
//
//public static Integer newList(ArrayList<String> chars){
//        int count = 0;
//        for (int i = 0; i < chars.size() ; i++) {
//        if(chars.get(i).equals('a'));
//        count++;
//
//        }
//        return count;