package day38_arrayList;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.add(0);

        nums.set(0, -100); // replaces position
        System.out.println(nums);

        nums.set(2,50000);
        System.out.println(nums );

        nums.set(4, 40000); // replaces position
        System.out.println(nums);

//        nums.set(10, 7000); // out of boudns


    }}
