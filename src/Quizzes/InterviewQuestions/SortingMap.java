package Quizzes.InterviewQuestions;

import day61_maps.QueueObjects;

import java.util.*;

public class SortingMap {

    public static void main(String[] args) {

        //Q30: Map -- Sort the map by values

        Map<String, Integer> map = new HashMap();
        map.put("Tomas", 3054);
        map.put("Robel", 1200);
        map.put("Selam", 2);
        map.put("Zafu", -112);
        map.put("Mossi", 108);
        map.put("Selomun", -11);

        System.out.println(sortMap(map));
        System.out.println(" -----------------------");
//        System.out.println(sortByValueUsingEntry(map));

//
//    }
//    public static Map<String, Integer> sortByValueUsingEntry(Map<String, Integer> map) {
//
//        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
//        System.out.println("entry list not sorted ..." + list);
//        list.sort(Map.Entry.comparingByValue());
//
//        System.out.println("entry list sorted" + list);
//
//        map = new LinkedHashMap();  //keeps insertion order which is already sorted by value
//
//        for (Map.Entry<String, Integer> each : list) {
//
//            map.put(each.getKey(), each.getValue());
//
//        }
//        return map;

    }

    public static Map sortMap(Map map) {
        List<Integer> arrayValues = new ArrayList<>(map.values());

        List<String> arrayKeys = new ArrayList<>(map.keySet());

        Collections.sort(arrayValues);
        System.out.println("sorted values -->" + arrayValues);

        LinkedHashMap<String, Integer> result1 = new LinkedHashMap<>();

        for (int i = 0; i < arrayValues.size(); i++) {
            for (String each : arrayKeys) {
                if (map.get(each) == arrayValues.get(i)) {
                    result1.put(each, arrayValues.get(i));
                }
            }
            //System.out.println(result1);
        }
        return result1;

    }}



