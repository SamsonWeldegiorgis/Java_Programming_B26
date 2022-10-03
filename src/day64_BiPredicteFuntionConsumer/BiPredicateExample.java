package day64_BiPredicteFuntionConsumer;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        BiPredicate<Integer [] , Integer > contains = (arr, num) -> {

            for(int each : arr){  // or Integer
                if(each == num ) {
                    return true; // if this statement is every true, then my array does contain the number that we were looking for, so we return true
                }
            }
            return false; // if the loop finishes and compares the num with every number in the array , the array does not contain the num, returning false..

        };  // end of our statement.....

        Integer [] arr = {4,5,12,10,24};
        System.out.println(contains.test(arr, 24)); // true
        System.out.println(contains.test(arr, 50)); // false
        System.out.println(contains.test(arr, 5)); // true

        System.out.println("===========================================");

        BiPredicate<String , String > anagram = (one, two) ->{
            char [] oneArr = one.toCharArray();
            char [] twoArr = two.toCharArray();

            Arrays.sort(oneArr);
            Arrays.sort(twoArr);

            System.out.println("OneArr : " + Arrays.toString(oneArr));
            System.out.println("TwoArr : " + Arrays.toString(twoArr));

            return Arrays.equals(oneArr,twoArr);
        };

        System.out.println(anagram.test("listen", "silent"));
    }
}
