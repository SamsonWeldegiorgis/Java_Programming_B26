package day41_arraysPractice5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};.......1,5,,,,3 4 9
 */

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(removeDuplicate(num));
    }

    public static ArrayList<Integer> removeDuplicate( ArrayList<Integer> numbers ){

        numbers.removeIf(num -> Collections.frequency(numbers,num) > 1 ); // num is every element, frequency,,qtty,

        return numbers;



    }
}
