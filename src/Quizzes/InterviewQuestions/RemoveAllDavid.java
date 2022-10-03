package Quizzes.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllDavid {

    public static void main(String[] args) {


        ArrayList<String > str = new ArrayList<>(Arrays.asList("David", "Thomas", "John", "Eric", "David"));

        str.removeIf(each -> each.equalsIgnoreCase("David"));
        System.out.println(str);    ArrayList<String > bucket = new ArrayList<>(Arrays.asList("David", "Man", "David"));
        System.out.println(removeDavid1(bucket));
    }


    public static ArrayList<String> removeDavid1 (ArrayList <String > str1) {
        ArrayList<String> result = new ArrayList<>();

        for(String each : str1) {
            if (!each.equals("David")) {
                result.add(each);
            }}
        return result;

    }}

//    String [] str = {"Tewelde", "mana","Mana"};
//        System.out.println(avoidRepeated(str));
//
//                }
//public static String avoidRepeated (String [] str ) {
//
//        String rep = "";
//
//        for (int i = 0; i < str.length; i++) {
//        if(!str[i].equalsIgnoreCase("Mana")){
//        rep = str[i];
//        }
//
//        }
//        return rep;
//
//
//        }



