package day28_arrayPractice;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        /*
        ex : [10,0,5,0,1,0] ..................[10,5,1,0,0,0]
         */

        int[] nums = {10, 0, 50, 90, 7, 8, 154, 0, 0, 0, 1, 0};
        int[] fixed = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                fixed[index++] = nums[i];//reading the element at position i of the nums array and storing it into the fixed array and position index. After storing the value index variable is incremented by 1.
            }
        }
        System.out.println(Arrays.toString(fixed));

        ////////////we can use this also

//
//        for (int each : nums) {
//            if (each != 0) {
//                fixed[index] = each;
//                index++;
//            }
//
        }}
