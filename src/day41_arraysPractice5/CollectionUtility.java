package day41_arraysPractice5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionUtility {
    public static void main(String[] args) {

    ArrayList <Integer> numbers = new ArrayList<>();
    numbers.addAll(Arrays.asList(10,10,-5,0,-1,30,7,8,20,20,20,10));

        numbers.removeIf(col -> Collections.max(numbers)==col);
        System.out.println("REMO: " + numbers);


        System.out.println("---------sort --------");
        Collections.sort(numbers);
        System.out.println("Sorted :"+ numbers);

        ///////////////////////////////////////////////////////
        System.out.println("---------Reverse --------");
        Collections.reverse(numbers);
        System.out.println("Reversed :"+ numbers);

        ///////////////////////////////////////////////////////
        System.out.println("---------Max --------");
        System.out.println("1st Max: "+  Collections.max(numbers));

        ///////////////////////////////////////////////////////
        System.out.println("---------Min --------");
        System.out.println("Min: "+  Collections.min(numbers));

        ///////////////////////////////////////////////////////
        System.out.println("---------RemoveIF --------");
        numbers.removeIf(each-> Collections.max(numbers)==each); // remove all 30s 1st biggest
        System.out.println("Remove it: "+  numbers);

        int secondMax = Collections.max(numbers);
        System.out.println("SecondMax : " + secondMax);

        numbers.removeIf(each-> Collections.max(numbers)==each); // remove all 20

        int thirdMax = Collections.max(numbers);
        System.out.println("ThirdMax : " + thirdMax);

        ///////////////////////////////////////////////////////
        System.out.println("---------Swap--------");
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println("Swap: " + numbers);

        ///////////////////////////////////////////////////////
        System.out.println("---------Swap--------");
        Collections.swap(numbers,0,numbers.size()-1);// replacing the 1st by the last,,and swap
        System.out.println("Swap: " + numbers);


        ///////////////////////////////////////////////////////
        System.out.println("---------frequency--------");
        System.out.println("Frqcy: " + Collections.frequency(numbers,10));


        } }
