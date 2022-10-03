package day38_arrayList;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(100);
        nums.add(800);
        nums.add(100);


        System.out.println(nums);
        // give 1st 100
        System.out.println("First 100 is: " +nums.indexOf(100)); // 0

        System.out.println(nums);
        //  middle 100*/
        nums.remove((Integer)100);
        System.out.println("Middle rmvd100,,100: " + nums.indexOf(100)); //

        System.out.println(nums);
        nums.set(nums.indexOf(100),0);
        System.out.println(nums);

        System.out.println("Middle 100 rplcd : " + nums.indexOf(100)); //

        System.out.println(nums);
        // give us the last 100
        System.out.println("Last 100# : " +nums .lastIndexOf(100));// 4

        System.out.println(nums.indexOf(700)); // -1 ,, defaut value -1

        int i = nums.indexOf(200);
        System.out.println(i);  // 1


    }
}
