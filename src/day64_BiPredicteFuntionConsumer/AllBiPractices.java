package day64_BiPredicteFuntionConsumer;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class AllBiPractices {

    public static void main(String[] args) {

        BiPredicate<int[], int[]> arrayIsEqual = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        int[] a = {3, 2, 5};
        int[] b = {2, 1, 3};
        System.out.println("ArraysEqual : " + arrayIsEqual.test(a, b)); // are they the same or NOT

        System.out.println(" ====================================");

        BiPredicate<int[], int[]> contains = (arr1, arr2) -> {
            int n = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        n++;
                    }}}
            return (n == arr2.length);
        };

        int[] arr4 = {1, 2, 3, 4, 5, 6};
        int[] arr5 = {1, 2};
        System.out.println("ContainTest : " + contains.test(arr4, arr5));// does the first in the second


        System.out.println(" ====================================");   // ORRRRRR we can use the below

        BiPredicate<int[], int[]> firstContain = (arr1, arr2) -> {

            for (int outer : arr1) {
                boolean checker = false;
                for (int inner : arr2) {
                    if (inner == outer) {
                        checker = true;
                        break;
                    }
                }
                if (!checker) {
                    return false; // because the number was NOT in the 1st array !
                }
            }return true;

        };

        int c[] = {1, 2, 3, 4, 5, 6, 7};
        int d[] = {1, 2, 3};
        System.out.println("FirstContain : " + firstContain.test(c, d));



        System.out.println(" ====================================");

        // merge 2 arrays into a list
        // first 2 generics are for the parameters and last generic for the return type..
        // 1,2,3.....
        // 4,5,6.....

        BiFunction<int [] , int [], List<Integer>> mergeToList = (array1, array2) -> {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i <array1.length; i++) {
                list.add(array1[i]);
                list.add(array2[i]);
            }
    return list;

        };
        int [] array5 = {1,2,3};
        int [] array6 = {5,6,7};
        System.out.println("Merged : " + mergeToList.apply(array5,array6));

        System.out.println(" ====================================");

        BiFunction<String, String, Set<String>> commonCharacters = (str1, str2) -> {
            Set<String> set = new HashSet<String>();
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        set.add(str1.charAt(i) + "");
                    }}}
            return set;
        };

        String str3 = "Phyton";
        String str4 = "Wooden Spoon";
        System.out.println("CommonCharcter : " + commonCharacters.apply(str3, str4));


    }}