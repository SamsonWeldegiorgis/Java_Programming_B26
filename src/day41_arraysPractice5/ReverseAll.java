package day41_arraysPractice5;

import day35_my_utilities.StringUtil;
import day40_arrayList_more.ArrayListWithMethods;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {

    /*  REVERSAL
    Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ted", "Talk", "Learn"));
        System.out.println("ReversedEach: " + reverseAll(list));
        System.out.println(" -----Another way of printing -to reverse day of week -");
        System.out.println(reverseAll(ArrayListWithMethods.daysOfWeek()));
    }

    public static ArrayList<String> reverseAll(ArrayList<String> list) {

        ArrayList<String> reverseWords = new ArrayList<>();
        for (String each : list) {

            reverseWords.add(StringUtil.reverse(each)); // we called the reverse method in StringUtil class to reverse each word, each element, then we are adding the reversed word into the 'reversedWord' Arraylist

        }
        return reverseWords;



    }
}









