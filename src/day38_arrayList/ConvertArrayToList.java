package day38_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertArrayToList {
    public static void main(String[] args) {

          Integer [] arr = {1,2,3,4,5,67}; // we made an integer array b/s arraylist doesnt accept primitive type.
        System.out.println(Arrays.toString(arr));

        Arrays.asList(arr); // converts the array to a collection type/Array list

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr)); // creating an Arraylist with values from a collecCtion type

        System.out.println(nums);

     // Creating an Arraylist with some initial value

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(4,5,6,7,8));
        System.out.println(other);
                /*
           Arrays.asList(4, 5, 6, 7)
            [4, 5, 6, 7] --> converts to ArrayList [ 4, 5, 6, 7]
         */
        Collections.reverse(other);
        System.out.println("Rev: " + other);

        ArrayList<String> str = new ArrayList<>(Arrays.asList("Java", "Boss" ,"Rome"));
        System.out.println(str);

        ArrayList<Character> letter = new ArrayList<>(Arrays.asList('s','a','m'));








    }
}
