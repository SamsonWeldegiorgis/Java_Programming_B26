package Quizzes.InterviewQuestions;

import java.util.*;
import java.util.Map.Entry;

public class MaxMinofMap1 {

    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> map = new HashMap();
        map.put("Tomas", 300);
        map.put("Robel", 10);
        map.put("Selam", 18);
        map.put("Selomun",18);
        map.put("Flue", -5);

        System.out.println(minValue(map));

    }

    //Q33: Min Value Map
    public static int minValue(Map<String, Integer> map) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());
        ArrayList<Integer> smList= new ArrayList<>(map.values());
//        System.out.println(smList.get(0));
        return sm.first();

    }
}



