package day30_arraysForEach;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AnagramArray {
    public static void main(String[] args) {

        // arozaupalanalapuazora   ... palindrome

        String str = "listen";
        String str1 = "silent";

        char [] one = str.toCharArray();
        char [] two = str.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println("One : " + Arrays.toString(one));
        System.out.println("One : " + Arrays.toString(two));

        if(Arrays.equals(one,two)){
            System.out.println("Anagram");
        }else {
            System.out.println("NOT Anagram");
        }


    }
}








