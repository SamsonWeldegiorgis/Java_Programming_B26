package Quizzes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public static void anagaram (String str1, String str2 ){
        char [] one = str1.toCharArray();
        char [] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        if(one.equals(two)){
            System.out.println("Anagram");
        }else {
            System.out.println("NOt Anagram");
        }
    }

    public static void main(String[] args) {

        String str1 = "love";
        String str2 = "elov";
        anagaram(str1,str2);
    }
}
