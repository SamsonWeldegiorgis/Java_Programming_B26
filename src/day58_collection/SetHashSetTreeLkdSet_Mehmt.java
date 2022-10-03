package day58_collection;

import java.util.*;

public class SetHashSetTreeLkdSet_Mehmt {

    public static void main(String[] args) {

        String[] browsers={"Chrome","Firefox","Chrome","Edge","IE","Edge","Safari","Remote-Chrome"};

        System.out.println("\n-----  HASHSET ----- ");
        Set<String> hashSet = new HashSet<>(Arrays.asList(browsers));
        System.out.println("HashSet:" +hashSet);
        hashSet.add(null);
        System.out.println("HashSet:" +hashSet);


        System.out.println("\n-----  LINKEDHASHSET ----- ");
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(browsers));
        System.out.println("LinkHashSet:" +linkedHashSet);
        linkedHashSet.add(null);
        System.out.println("LinkHashSet:" +linkedHashSet);


        System.out.println("\n-----  TREESET ----- ");
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(browsers));
        System.out.println("Treeset:" +treeSet);
        // treeSet.add(null);   it does not accepts null values
        System.out.println("Treeset:" +treeSet);



        // Exercises

        Integer[] a={1,2,3,44,3,67,43,2,78,9,8};

        List<Integer> list = Arrays.asList(a);
        System.out.println("List:" + list);
        System.out.println("\n===================");

        // Remove duplicates from all cases

        // Keep insertion order
        System.out.println(new LinkedHashSet<>(list));

        // Return fifth element after remove    67
        System.out.println(new ArrayList<>(new LinkedHashSet<>(list)).get(4));

        // sort in ascending order
        System.out.println(new TreeSet<>(list));

        // sort in desc order
        ArrayList<Integer> sortedList = new ArrayList<>(new TreeSet<>(list));
        Collections.reverse(sortedList);
        System.out.println("SortedList:" +sortedList);


    }
}

