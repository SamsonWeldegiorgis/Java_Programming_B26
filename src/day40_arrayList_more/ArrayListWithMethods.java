package day40_arrayList_more;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class ArrayListWithMethods {
    public static void main(String[] args) {


        System.out.println(daysOfWeek());
        ArrayList<String> days = daysOfWeek();
        System.out.println("1st index : " +days.get(0));
        System.out.println("Length : " +days.size());
        System.out.println("Each : " + days);

        System.out.println(printlist(daysOfWeek()));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(printlist(list));

    }
    public static String printlist(ArrayList<String> list){   // as a parameter

        String str = "LIST: ";
        for (String each : list){
            str+="\n~\t" + each;
        }
        return str;
    }

    public static ArrayList <String> daysOfWeek() {
        ArrayList<String> days = new ArrayList<>(Arrays.asList(  // as a return type
                "Mon",
                "Tue",
                "Wed",
                "Thu",
                "Fri",
                "Sat",
                "Sun"));
        return days;


       //////////////////////////////
//        String a = "abc";
//        a.toUpperCase()rep


    }}


