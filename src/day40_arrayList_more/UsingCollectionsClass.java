package day40_arrayList_more;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(1,3,20,222,64,8,60));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("Min: " + Collections.min(list));

        System.out.println("Max: " +Collections.max(list));

        Collections.reverse(list);
        System.out.println("Reverse: " +list);

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A','B','C','D'));
        Collections.reverse(letters);
        System.out.println(letters);

        ArrayList<String> word = new ArrayList<>(Arrays.asList("jeep", "man","jeep"));
        Collections.replaceAll(word,"man","woman");
        System.out.println("Replacer:  " +word );
        System.out.println("Jeep# : " + Collections.frequency(word,"jeep"));


        Collections.replaceAll(letters,'B','*');
        System.out.println("Replaced : " + letters);

        Collections.swap(letters,0,3);
        System.out.println("Swapped: " + letters);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11,11,20,11,20,30));
        System.out.println("Frequency:  " + Collections.frequency(numbers,11)); // how many times

        System.out.println("Binary Search:  " +Collections.binarySearch(numbers,12));

//        System.out.println(Collections.copy(numbers ,11,30);








    }
}
