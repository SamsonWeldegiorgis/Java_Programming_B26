package day65_streams;

import day55_polymorphism.Book.Library;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import day35_my_utilities.StringUtil;

import static java.util.stream.Collectors.toList;

public class StreamPractice {

    public static void main(String[] args) {


    /*
        1. Write a program that can remove the duplicated elements of an array of String
     */

        List<String> str = new ArrayList<>(Arrays.asList("Java", "Java", "Man", "Fan"));

        System.out.println("RemV Duplicate # :" + str.stream().distinct().collect(toList()));

        System.out.println("========================");

        /*
            2. Write a program that can remove the duplicated elements of a List of String
         */

        List<String> str2 = new ArrayList<>(Arrays.asList("man", "play", "play"));
        System.out.println(str2.stream().distinct().collect(toList()));

        System.out.println("========================");
        /*
            3. Write a program that can count how many "java" and "python" does the array has:
            ex: array = {"Java", "jAVa", "pythON"}
            output:
                countJava = 2
                countPython = 1
         */

        List<String> str3 = new ArrayList<>(Arrays.asList("jAVa", "python", "pythON", "Java", "Java", "Phython"));


        System.out.println("Java # :" + str3.stream().filter(p -> p.toLowerCase().equals("java")).count());
        System.out.println("Phyton # :" + str3.stream().filter(p -> p.toLowerCase().equals("python")).count());

        System.out.println("========================");
        /*
          4. Write a program that can count how many negative numbers does the array has
        ex: arr = {1,2,3,4,-4,5,-5}

        output:
            2

         */

        List<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -4, 5, -5, -8, -7));

        System.out.println("Count -Ve : " + num.stream().filter(p -> p < 0).count());

        System.out.println("========================");

        /*
          5. Write a program that can count how many Positive numbers does the List has
        ex: List = {1,2,3,4,-4,5,-5}

        output:
            5
         */

        List<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -4, 5, -5, 6));
        System.out.println("All Positives :" + num1.stream().filter(p -> p > 0).count());

        System.out.println("========================");

        /*
            6. Write a program that can return all the negative numbers of the array as a new array
        ex:
            arr = {1,2,3,4,-4,5,-5}

        output:
            {-4, -5}
         */

        List<Integer> num2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -4, 5, -5));
        System.out.println(num2.stream().filter(p -> p < 0).collect(toList()));

        System.out.println("========================");

        /*
            7. Write a program that can return all the positive numbers of List without the dupclaites
        ex:
            list = {1,2,3,4,-4,5,-5,1,2,3,4}

        output:
            {1,2,3,4,5}
         */

        List<Integer> num3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -4, 5, -5, 1, 2, 3, 4));
        System.out.println("Distinct >0 : " + num3.stream().filter(p -> p > 0).distinct().collect(toList()));

        System.out.println("========================");

        /*
            8. Write a program that can return the palindrome Strings from a list:
        Ex:
            list = {"Java", "level", "Anna", "Wooden Spoon"};
        output:
            {"level", "Anna"}
         */

        List<String> list5 = new ArrayList<>(Arrays.asList("Java", "Level", "Anna", "Wooden Spoon", "racecar"));
        System.out.println( list5.stream().filter(p ->
                new StringBuilder(p).reverse().toString().equalsIgnoreCase(p)).collect(Collectors.toList()));


//        for (String each : num4) {//
//            if (each.equalsIgnoreCase(StringUtil.reverse(each))) {
//                System.out.println("Palindromes : " + each);


//                System.out.println("Reversed : " + StringUtil.reverse(each));

        System.out.println("========================");

/*
    9. Write a program that can return the unique elements of an array as a new array:

        Ex: arr = {1,1,2,3,3,4,5,5,6};

        output:
            {2,4,6}
 */


        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5,6));
        System.out.println(list6.stream().filter(p -> Collections.frequency(list6, p) == 1).collect(Collectors.toList()));


        }



            }
















