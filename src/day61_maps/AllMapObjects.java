package day61_maps;

import java.util.*;

public class AllMapObjects {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("saim", "java");
        map.put("hello", "world");
        map.put("james", "bond");
        map.put("aysun", "ui testing");
        map.put("soft skill", "Nadir");
        map.put("username", null);
        map.put(null, "nothing");
        System.out.println("HashMap Map: " + map);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(10, "java");
        map1.put(20, "world");
        map1.put(3, "bond");
        map1.put(40, "ui testing");
        map1.put(50, "Nadir");
        map1.put(null, "Isabela");
        map1.put(null, null);
        System.out.println("HashMap Map1: " +map1);

        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("saim", "java"); // maintains insertion order
        linked.put("hello", "world");
        linked.put("james", "bond");
        linked.put("aysun", "ui testing");
        linked.put("soft skill", "Nadir");
//        linked.put("username", "password");
        linked.put("username", null);
        linked.put(null, "nothing");
        System.out.println("LinkedHashMap: " + linked);

        Map<String, String> treemap = new TreeMap<>();
        treemap.put("saim", "java"); // sort and order
        treemap.put("hello", "world");
        treemap.put("james", "bond");
        treemap.put("aysun", "ui testing");
        treemap.put("soft skill", "Nadir");
        treemap.put("username", null);
  //    treemap.put(null, "nothing"); // doesn't take null key
        System.out.println("TreeMap: " + treemap);

        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("saim", "java"); // sort and order
        hashTable.put("hello", "world");
        hashTable.put("james", "bond");
        hashTable.put("aysun", "ui testing");
        hashTable.put("soft skill", "Nadir");
        hashTable.put("username", "password");
     // hashTable.put(null, "nothing"); // doesn't take null key or value
        System.out.println("HashTable: " + hashTable);

        Map<String, Integer> hashTable1 = new Hashtable<>();
        hashTable1.put("saim", 50); // sort and order
        hashTable1.put("hello", 90);
        hashTable1.put("james", 20);
        hashTable1.put("jame", 20);
        hashTable1.put("aysun", 200);

        // hashTable.put(null, "nothing"); // doesn't take null key or value
        System.out.println("Sorted HashTable1: " + hashTable1);

        Map<String, Integer> hashTable2 = new TreeMap<>();
        hashTable2.put("saim",  50); // sort and order
        hashTable2.put("hello", 90);
        hashTable2.put("james", 20);
        hashTable2.put("jame",  20);
        hashTable2.put("aysun", 200);

        System.out.println("TreeMap : " + hashTable2);
    }
}
