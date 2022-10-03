package day61_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingTheMap {
    public static void main(String[] args) {


        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(10,"Arthur");
        map.put(20,"George");
        map.put(3,"Jack");
        map.put(40,"Emma");
        map.put(5,"Isabella");
        System.out.println("LinkedHashMap all: " + map);

        //  Iterating by keys
        //  keySet() : returns all the keys of map (Set)
        System.out.println("EachKey: ");
        for (Integer eachKey: map.keySet()){
            System.out.println( eachKey);
        }

        System.out.println(" --------------------");

        // Iterating by values
        // values() : returns all the values of map (Collexn)
        System.out.println("EachValue: ");
        for (String eachValue: map.values()){
            System.out.println(eachValue);
        }

        System.out.println(" --------------------");

        // Iterating by entries
        // entrySet() : returns all the entries of map (Set)
        System.out.println("EachEntry: ");
        for (Map.Entry<Integer , String > eachEntry: map.entrySet()){
            System.out.println(eachEntry);
        }

        System.out.println(" --------------------");

        // Getting the keys and values separately
             System.out.println("Key & Values separately: ");
        for (Map.Entry<Integer , String > eachEntry: map.entrySet()){
            System.out.println(eachEntry.getKey()+" : " + eachEntry.getValue());
        }
    }
}
