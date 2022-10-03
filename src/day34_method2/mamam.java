package day34_method2;

import java.util.Arrays;

public class mamam {
    public static int[] addElement(int[] arr, int num) {
        int[] bigger = Arrays.copyOf(arr, arr.length+1);
        bigger[bigger.length-1] = num;
        return bigger;
    }}
