package Quizzes.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveIterator {
    public static void main(String[] args) {

        ArrayList<String > str = new ArrayList<>(Arrays.asList("David", "Thomas", "John", "Eric", "David"));
        System.out.println(removeDavid1(str));


}
    public static ArrayList<String> removeDavid1 (ArrayList <String > str) {

        Iterator<String> it = str.iterator();

        while (it.hasNext()) {
            String remo = it.next();
            if (remo.equalsIgnoreCase("David")) {
                it.remove();
            }
        }
        return str;

    }}


