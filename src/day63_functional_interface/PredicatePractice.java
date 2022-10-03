package day63_functional_interface;

import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {

        Predicate<Integer> isEven = (a) ->

             a % 2 ==0 ;

        boolean r1= isEven.test(300);
        System.out.println(r1);

        System.out.println(" ------------------------------------");
        Predicate<String> isPalindrome = (str) ->{
            String reversed = "";
            for (int i = str.length()-1; i >=0; i--) {
                reversed+=str.charAt(i);
            }
            boolean result = str.equalsIgnoreCase(reversed);
            return result;

        };
            boolean r2 = isPalindrome.test("Wooden Spoon");
            boolean r3 = isPalindrome.test("racecar");
        System.out.println(r2);
        System.out.println(r3);

        };



}
