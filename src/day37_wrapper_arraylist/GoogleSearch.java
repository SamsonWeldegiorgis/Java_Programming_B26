package day37_wrapper_arraylist;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 2,550,000,000 results (1.00 seconds)";
        String[] arr = result.split(" ");
        System.out.println(Arrays.toString(arr));
        String resultStr4 = arr [1];
        System.out.println(resultStr4); // 2,550,000,000

        String resultStr = arr[1].replace(",", "");
        System.out.println(resultStr); // 2550000000
        String timeStr1 = arr[3];
        System.out.println(timeStr1); // (1.0

        String timeStr = arr[3].substring(1);
        System.out.println(timeStr); // 1.0


        System.out.println(resultStr);
        System.out.println(timeStr);


        long resultNumber = Long.parseLong(resultStr);
        double timeNumber = Double.parseDouble(timeStr);

        if (resultNumber >= 0) {
            System.out.println("TEST CASE PASSED - POSITIVE NUMBER");
        }

        if (timeNumber <= 2 && timeNumber >= 0) {
            System.out.println("TEST CASE PASSED - Under 2 seconds");




        System.out.println(" -----------------------------------");

        System.out.println(Byte.MAX_VALUE);// 127
        System.out.println(Byte.MIN_VALUE);// -128

        System.out.println(Integer.MAX_VALUE);// 2147483647
        System.out.println(Integer.MIN_VALUE);// -2147483648

        System.out.println(Long.MAX_VALUE);// 9223372036854775807
        System.out.println(Long.MIN_VALUE);// -9223372036854775808

}}}




