package Quizzes.InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharMap {
    public static void main(String[] args) {

        System.out.println(unique("pppllllxeeenlu"));
    }
// Q32: Unique character from String

    public static Map<Character, Integer> unique(String str) {

        Map<Character, Integer> unique = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (count == 1) {
                unique.put(str.charAt(i), count);
            }
        }
        //System.out.println(unique);
        return unique;
    }
}
