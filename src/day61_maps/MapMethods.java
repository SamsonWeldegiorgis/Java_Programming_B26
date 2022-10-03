package day61_maps;

import java.util.LinkedHashMap;

public class MapMethods {

    public static void main(String[] args) {
        // put() : inserts the key & value as a pair to the map
        LinkedHashMap <Integer, String> map = new LinkedHashMap<>();
        map.put(10,"Arthur");
        map.put(20,"George");
        map.put(3,"Jack");
        map.put(40,"Isabella");
        System.out.println("LinkedHashMap all: " + map);


        // equals(MapObject) : checks if the map is equal to the given map in the argument, returns boolean
        LinkedHashMap <Integer, String> map2 = new LinkedHashMap<>();
        map2.put(10,"Arthur");
        map2.put(20,"George");
        map2.put(3,"Jack");
        map2.put(40,"Isabella");
        System.out.println("Equals: " + map2.equals(map));  //  equal = true

        System.out.println(map2.equals(map)); // equal = true
        System.out.println(map2==map);   // false


        // size() : returns the size(total number of pairs) of the map
         System.out.println("Size :" + map.size());

        // get(key) : returns the value of the given key from the map
        System.out.println("Get :" + map.get(20));

        // get(value) : returns the key of the given key from the map
        System.out.println("Values :" + map.values());

        // replace(key, newValue) : replaces the value of the given key
        map.replace(10,"Muhtar");  // replacing to Arthur,, the 1st index
        System.out.println("Replaced :" + map);

        // remove(key) : removes the given key and its value from the map
        map.remove(10);
        System.out.println("Remove :" + map); // removing Muhthar
        System.out.println("Size :" + map.size()); // reduced to 3 size b/s of removed

        // containsKey(key) : checks if the given key is contained in the map, returns boolean
        System.out.println("ContainsKey :" + map.containsKey(25));  // we don't have 25  - false
        System.out.println("ContainsKey :" + map.containsKey(40));  // we have of Isabla - true

        // containsValue(value) : checks if the given value is contained in the map, returns boolean
        System.out.println("ContainsKey :" + map.containsValue("James"));  // we don't have James-False
        System.out.println("ContainsKey :" + map.containsValue("Isabella")); // We have Isabella -True

        // isEmpty() : checks if the map is empty , returns boolean
        System.out.println("Empty :" + map.isEmpty()); // It is not empty = false


        // equals(MapObject) : checks if the map is equal to the given map in the argument, returns boolean
        LinkedHashMap <Integer, String> map3 = new LinkedHashMap<>();
        map3.put(10,"Arthur");
        map3.put(20,"George");
        map3.put(3,"Jack");
        map3.put(40,"Isabella");
        System.out.println("Equals: " + map3.equals(map));  // not equal = false

        System.out.println(map2.equals(map)); // not equal = false
        System.out.println(map2==map);   // false

        // clear() : removes all the keys & values from the map, size will be set to 0
        map.clear();
        System.out.println("Clear :" + map);


    }
}
