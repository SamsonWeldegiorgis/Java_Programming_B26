package day38_arrayList;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        System.out.println(nums);
        System.out.println("Is it empty: " + nums.isEmpty());//false

        if (nums.isEmpty() == true){
            System.out.println("");
        }else {
            System.out.println("b/s there are elements: " +"\n"+nums);
        }

        nums.clear();

        System.out.println(nums); // cleared and emptys !!
        System.out.println("Its size now is : " + nums.size()) ;// 0

        System.out.println("Is it empty: " + nums.isEmpty());//true



    }
}
