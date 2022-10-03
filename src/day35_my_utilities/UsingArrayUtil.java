package day35_my_utilities;

import day36_overlloadin_method.AddElement;

import java.util.Arrays;

public class UsingArrayUtil {

    public static void main(String[] args) {

        int [] a = {3,1,6,12,7,1,20};



        System.out.println("------------------------------");

        String[] c = {"mussa", "tommy"};
//        String[] d = addElement(c, "chewata");
//        System.out.println(Arrays.toString(d));

        System.out.println("------------------------------");

        int [] y ={5,23,6,21};
        int [] z ={3,23,6};
//        System.out.println(Arrays.toString(addElement(y,z)));

        System.out.println("Min: " + ArrayUtil.minNumber(a)); //

        System.out.println("Min: " +ArrayUtil.maxInNumber(a)); // 20

        System.out.println("Contain: " + ArrayUtil.contains(a,20)); // true

//        System.out.println("Add element: " + ArrayUtil.addElement(a1,4) // ????????????

        System.out.println("Add element String : " + ArrayUtil.addElement(c,"chewata")); // ????????????

        System.out.println("Add element int-int" + ArrayUtil.addElement(y,z));// ????????????


    }




}
