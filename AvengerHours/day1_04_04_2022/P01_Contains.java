package day1_04_04_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class P01_Contains {
    /*
    int [] x = { 2,5,4,6,8,9 }; ...true
     */
    public static void main(String[] args) {
        int[] x = {2, 5, 4, 6, 8, 9};// ...true
        int[] y = {4, 3, 0, 100, 55};// ...true
        int[] z = {4, 5, 1, 5, 6};// ...false
        System.out.println(contains(x));
        System.out.println(contains(y));
        System.out.println(contains(z));
    }


    public static boolean contains(int[] array) {

        for (int each : array) {
            if (each == 2 || each == 3) {
                return true; // stops the execution
            }
        }
        return false;
    }

    public static boolean contains(ArrayList<Integer> array) {
        if (array.contains(2) || array.contains(3)) { // autoboxing
            return true;
        }
        return false;

    }

}

//        public static boolean contains (ArrayList<Integer>num){
//
//            for (int i = 0; i <num.size() ; i++) {
//                if(num.get(i)== 2 || num.get(i) == 3){
//                    return true;
//                }
//            }return false;
//        }


