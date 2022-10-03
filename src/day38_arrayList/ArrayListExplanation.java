package day38_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExplanation {
    public static void main(String[] args) {
        /*
        ,,,,Difference b/n Arraylist and Arrays

        Arraylist :  does not have fixed size ,
                    : stares only objects,
                    : allows duplicates values,
                    : Maintains insertion order


        Arrays : have fixed length,
               : stores objects and primitives
                : Array is an object which contains elements of a similar data type.

        */


        ArrayList<String> cities = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();


        // add(Object):  adds the elements to the indexes of the arraylist
            cities.add("London");
            cities.add("Chicago");
            cities.add("Baku");
            cities.add("Istanbul");

            // one shot
        ArrayList<String> cities2 = new ArrayList<>(Arrays.asList("london", "Chicago", "Baku","Istanbul"));

        // other way
        ArrayList<String> cities03 = new ArrayList<>();
        cities03.addAll((Arrays.asList("Chicago", "Baku","Istanbul")));

        // equals


        // add(index, Object): adds the element to the given index (index must be exist)
        System.out.println("add(index , object--");
        cities.add(0,"Lynnwood");
        System.out.println(cities);

        // get(index): returns the element at given index
        System.out.println("--get (index)--");
        System.out.println(cities.get(0));

        // set(index, Object): replaces the old element at given index with new element
        System.out.println("--set (index)--");
        cities.set (0,"Tokyo");
        System.out.println(cities);


        // indexOf(Object): returns the first matching object' index number
        System.out.println("--indexOf (index)--");
        System.out.println(cities.indexOf("Dushambre"));
        System.out.println(cities);

        // size(): returns the total number of elements
        System.out.println("--size of--");
        System.out.println(cities.size());

        // remove(index): removes the object at the given index
        System.out.println("--remove (index)--");
        System.out.println(cities.remove(0)); // by index,,,or element
        System.out.println(cities);

        // remove(object): removes the first matching object
        System.out.println("--remove (index)--");
        System.out.println(cities.remove("Baku")); // by object
        System.out.println(cities);

        //  Bulk Op.

        // removeAll() : to remove multiple elements
        cities.removeAll(Arrays.asList("Chicago","Baku"));
        System.out.println(cities);

        // retainAll() : to retain multiple elements
        cities.retainAll(Arrays.asList("London"));
        System.out.println(cities);

        // add all
        cities.addAll(Arrays.asList("Mexico", "Renton","Izmir", "Baku","Mon"));
        System.out.println(cities);

        // removeIf()  : removes element according to condition
        cities.removeIf(rem-> rem.length()>5);
        System.out.println(cities);


        // containsAll(): checks if all elemnts are contained in the list
       boolean c4=  cities.containsAll(Arrays.asList("Izmir","Baku","Renton"));  // true or false
        System.out.println("ContainsAll : " + c4);

        // contains(): checks if elemnts are contained in the list
        boolean c2=  cities.contains("Renton");  // true or false
        System.out.println("Contains : " + c2);



        // addAll()  :  adds collection of elements to the list
        cities.addAll(Arrays.asList("Renton","Izmir", "Baku","Mon"));
        System.out.println(cities);

        // clear(): removes all the objects from the List
        System.out.println("Clear........");
        cities.clear();
        System.out.println(cities);

        // isEmpty(): returns true if the list contains no element
        System.out.println(cities.isEmpty());
    }
}









