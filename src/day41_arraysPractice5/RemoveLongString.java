package day41_arraysPractice5;

import java.util.ArrayList;
import java.util.Arrays;
/*max number of characters
Ex: {“one,”, “two”, “three, “four”, “five”, “six”} // 6
Max number: 4
Output: {“three, “four”, “five”}
 */



public class RemoveLongString {

    public static ArrayList<String> removeLongString(ArrayList<String> list , int maxLength){

        list.removeIf(word -> word.length() < maxLength);

        return list;


    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("one","two", "three","four","five","six"));
        System.out.println(removeLongString(words,4));
    }
}
