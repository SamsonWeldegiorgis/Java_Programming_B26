package day41_arraysPractice5;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {
    /* ADD
    Input: “123”, “34”, “513”
    Output: [ 6, 7, 9 ]
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123","34","513"));
        System.out.println(sumFromString(list));
    }

    public static ArrayList<Integer> sumFromString (ArrayList<String> list) {

        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : list) { // goes thru every element of the Arraylist from parameters

            int currentSum = getCurrentSum(each);
            sums.add(currentSum);
        }
        return sums;

    }

    private static int getCurrentSum(String each) {
        int currentSum = 0;
        for (String eachDigit : each.split("")) { // converting the string each to array by splitting with an empty space, it means that each string will be separated with each character as separate String elements // "123" ->> ["1" , "2" ,"3" and then you loop thru that array
            currentSum += Integer.parseInt(eachDigit);  // changes the String to integer type...
            // valueof - gives wrapper class type
            // parse - gives int value type

        }
        return currentSum;
    }


}
