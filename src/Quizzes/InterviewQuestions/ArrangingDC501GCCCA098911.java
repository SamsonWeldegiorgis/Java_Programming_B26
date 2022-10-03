package Quizzes.InterviewQuestions;

import java.util.Arrays;

public class ArrangingDC501GCCCA098911 {

    public static void main(String[] args) {

        // Q15 DC501GCCCA098911 -> CD015ACCCG011899

        SortLettersAndNumbersFromString("DC501GCCCA098911");


    }

    //Sort Letters And Numbers From String
    public static void SortLettersAndNumbersFromString(String str) {

        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            str2 += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
        }
        System.out.println(str2);
        String[] arr = str2.split(",");
        str = "";
        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }
        System.out.println(str);
    }
}



////////////////////////////////////////////////

//    // Q15 DC501GCCCA098911 -> CD015ACCCG011899
//    public static void main(String[] args) {
//        System.out.println(sortAlphanumeric("DC501GCCCA098911"));
//
//    }
//
//    public static String sort (String s){
//        char arr[] = s.toCharArray();
//        Arrays.sort(arr);
//        return new String(arr);
//    }
//
//    public static String sortAlphanumeric (String s){
//        String sorted = "";
//        String numPart = "";
//        String charPart = "";
//        for (int i = 0; i < s.length(); i++) {
//
//            if (Character.isDigit(s.charAt(i))) {
//                sorted += sort(charPart);
//                charPart = "";
//                numPart += "" + s.charAt(i);
//            } else {
//                sorted += sort(numPart);
//                numPart = "";
//                charPart += "" + s.charAt(i);
//            }
//
//        }
//        sorted += sort(charPart) + sort(numPart);
//
//        return sorted;
//    }
//}
