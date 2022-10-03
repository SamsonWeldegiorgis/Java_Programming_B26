package day65_streams;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMethods {

    public static void main(String[] args) {

        // creating Streams
        int [] arr = {1,2,3,4,5,6};

        Arrays.stream(arr);
        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,2));
       list.stream();
        System.out.println("Streamed : " +list);

        System.out.println("======================================");

       // distinct() : remove duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,2,4,4,5,5,6,1,1,2,2,3));
        System.out.println("Stream/Distinct : " + list2.stream().distinct().collect(Collectors.toList()));
        /*
                .stream () converts the list to a stream
                . distinct () remove duplicate values
                . collect ((Collectors.toList()) converts the stream back to list

         */

        System.out.println("Orignial List : " + list2);

        int [] arr2 = {1,1,1,2,2,2,4,4,5,5,6,1,1,2,2,3};
        arr2= Arrays.stream(arr2).distinct().toArray();
        System.out.println("ArrayDistinct: " + Arrays.toString(arr2));


        System.out.println("======================================");

        // skip() : skips the defined number of elements
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Skipped 3 : " + list3.stream().skip(4).collect(Collectors.toList()));
        System.out.println("Skipped 7: " + list3.stream().skip(7).collect(Collectors.toList()));
        System.out.println(list3);
        System.out.println("Skipped 8: " + list3.stream().skip(7).collect(Collectors.toList()));
        System.out.println("Skipped 13: " + list3.stream().skip(13).collect(Collectors.toList()));

        System.out.println();
        // skip() for Strings
        String [] arr3= {"java", "hello", "world", "pen","computer"};
        System.out.println("String Skip : " + Arrays.toString(Arrays.stream(arr3).skip(3).toArray()));

        System.out.println("======================================");

        // limit : make some changes
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Limit to 6 : " + list4.stream().limit(6).collect(Collectors.toList()));
        System.out.println("Limit to 3 : "  + list4.stream().limit(3).collect(Collectors.toList()));
        System.out.println("Limit & Skip : " + list4.stream().limit(5).skip(3).collect(Collectors.toList()));//45
        System.out.println("Skip & Limit : " + list4.stream().skip(6).limit(3).collect(Collectors.toList()));//789


        System.out.println("======================================");

        // count
        List<Integer> list5= new ArrayList<>(Arrays.asList(1,1,1,2,2,3,5,6,3,5,7,8,9));
        System.out.println("Count : " + list5.stream().count() );
        System.out.println("Distinct & Count : "  + list5.stream().distinct().count() );

        System.out.println("======================================");

        // Task :
        String s = "aaaabbbbbccccddddeeefggg";
        System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.toList()));
        System.out.println(Arrays.stream(s.split("")).distinct().count());
















    }
}
