package day58_collection;

import java.util.*;

public class HashsetLinkedHashsetTreeset {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>(); // random ordering & NO duplicate
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.add(null);
        System.out.println("Hashset : " + hashSet);


        Set<Integer> linkedHashSet = new LinkedHashSet<>();  // no change / the same order & NO duplicate
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.add(null);
        System.out.println("LinkedHashSet : " + linkedHashSet);


        Set<Integer> treeSet = new TreeSet<>();  // sorting & NO duplicate
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("TreeSet : " + treeSet);
//        treeSet.add(null);  // no accepting null,,, create exception

        System.out.println("---------------------------------------");
        System.out.println("HashSet : ");
        for(Integer each : hashSet){
            System.out.println(each);

            // but not
//            for (int i = 0; i < hashSet.size(); i++) {
//                System.out.println( hashSet.get(i));    // b/s we don't have indexes for all

        }
        System.out.println("---------------------------------------");
        System.out.println("LinkedHashSet : ");
        for(Integer each : linkedHashSet){
            System.out.println(each);

    }
        System.out.println("---------------------------------------");
        System.out.println("TreeSet : ");
        for(Integer each : treeSet){
            System.out.println(each);
}}}
