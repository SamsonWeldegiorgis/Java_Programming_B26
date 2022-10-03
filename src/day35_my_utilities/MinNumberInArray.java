package day35_my_utilities;

import java.util.Arrays;

public class MinNumberInArray {
    /*
    Min Number

create a method that will accept an int array and return the smallest number from the array
     */

    public static int minNumber(int[] nums) {

        int min = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;

            }
        }
        return min;
    }

//    public static
    // or
    public static int minNumberSorted(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }



    public static void main(String[] args) {

        int[] a = { 5,2, -1, 7, 9, 10};

        System.out.println("Min: " +minNumber(a));

    }}

