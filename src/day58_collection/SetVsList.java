package day58_collection;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println("LIST : " + list);
        System.out.println("First Index :" + list.get(0));
        System.out.println("Last Index :" + list.get(list.size()-1));

        System.out.println("---------------------------------");

        Set<Integer> set = new HashSet<>(); // we use when we no need duplicates..
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);   // NO repitition, just it takes one......
        set.add(4);
        System.out.println("SET : " + set);
//        System.out.println("First Index :" + set.get(0));  // NO indexes with Set
//        System.out.println("Last Index :" + set.get(list.size()-1));

        for(int each : set){
            System.out.println(each);
            System.out.println("---------------------------------");
        }
        // sort my HashSet
        System.out.println(new TreeSet<>(set)); // Sorted....
        System.out.println("---------------------------------");

        // converting list to set
        System.out.println(new LinkedHashSet<>(list)); // No repeated,,,,
        System.out.println("---------------------------------");
        System.out.println(new HashSet<> (Arrays.asList(1,5,2,1,4,2,5,1))); // sorted & No repetition,,,,,asList method return List type, which can have the reference of the Collection inference, so we are able to make an object to HasSet with these initial values
        System.out.println("---------------------------------");
        String s = "aaaaaabbbbcccccdddddeeed";
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))
                .toString().replace(",",""));   // [abcde]
        System.out.println("---------------------------------");
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))
                .toString()
                .replace(", ","")
                .replace("[","")
                .replace("]",""));   // abcde

        /*
         above we convert the String s to an array that array is the argument of the Arrays.asList Method
         that array is converted to as List type which is allowed in the HashSet contstructor b/s List is
         a collection and collection is the parameter type convert the Hashset - which removed the duplicates
         to a String and did String manupulation
         */



    }
}
