package day34_method2;

import java.util.Arrays;

public class ArrayUtil2 {

    public static boolean contains( int[] arr, int num) {
        boolean containsNum = false;
        for (int each : arr) {
            if (each == num) {
                containsNum = true;
                break;
            }
        }
        return containsNum;
    }
// Min Number

    public static int min(int[] arr) {
        int smallest = arr[0];
        for (int each : arr) {
            if (each < smallest) {
                smallest = each;
            }
        }
        return smallest;
    }

    // Max Number

    public static int max(int[] arr) {
        int biggest = arr[0];
        for (int each : arr) {
            if (each > biggest) {
                biggest = each;
            }
        }
        return biggest;
    }}