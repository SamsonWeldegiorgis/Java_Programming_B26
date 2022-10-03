package day41_arraysPractice5;

import day35_my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

    /*
Ex:Input: "Anna", "Java", "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output: Anna, Racecar, Level, Eye
     */

    public static ArrayList<String> palindrome (ArrayList<String> words){
        ArrayList<String> bucket = new ArrayList<>();

        for (String each : words){

            if (each.equalsIgnoreCase(StringUtil.reverse(each))){
                bucket.add(each);
            }
        }
        return bucket;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(palindrome(words)); // --> [Anna, Racecar, Level, Eye]
    }

}
