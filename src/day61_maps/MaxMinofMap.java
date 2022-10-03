package day61_maps;

import java.util.*;
import java.util.Map.Entry;

public class MaxMinofMap {

    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> map = new HashMap();
        map.put("Tomas", 3);
        map.put("Robel", 100);
        map.put("Selam", 18);
        map.put("Selomun", 18);


//        map.forEach((k, v) -> System.out.println(k + "=" + v));
//        System.out.println("After Sorting by value\n");

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        System.out.println("SORTED : ");list.forEach(System.out::println);


        System.out.println(" =============================");

        Integer min = Collections.min(map.values());
        Integer max = Collections.max(map.values());
        String name = Collections.min(map.keySet());

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

        System.out.println(" ==========================");

        String nameofMin ="";
        String nameofMax ="";
        int maximum = 0;
        int minumum = Integer.MAX_VALUE;

        for(String key : map.keySet()) {

            int value = map.get(key);

            if (value > maximum) {
                maximum = value;
                nameofMax = key;

            }

            if(value < minumum){
                minumum = value;
                nameofMin = key  ;
            }}
        System.out.println("Minimum : "+ nameofMin +"==" + minumum);
        System.out.println("Maximum : "+ nameofMax +"==" + maximum);



    }}


