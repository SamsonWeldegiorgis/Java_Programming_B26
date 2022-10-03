package day41_arraysPractice5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SwitchBadPairs {
    /*

     */

    public static void main(String[] args) {

    ArrayList<String> words = new ArrayList<>(Arrays.asList("cat","in","the","hat"));

        for (int i = 0; i <words.size(); i+=2) {
            System.out.println("Previously : " + words);
            String temp = words.get(i); // "Cat"  .. temp is used for swapping elements for arrays,, ,,,
            words.set (i,words.get(i+1)); // storing "in" to position i , 0 ,, from cat >to > "in"
            words.set (i+1 , temp);   // storing "in" to position i , 0   ,, from "in" >to > "cat"

        }
        System.out.println("Result : " + words);
    }



}
