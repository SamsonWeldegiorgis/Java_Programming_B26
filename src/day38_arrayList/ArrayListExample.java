package day38_arrayList;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        numbers.add (100);
        System.out.print(numbers);

        numbers.add(-100);
        System.out.println(numbers);

        numbers.add(50);
        numbers.add(23);
        System.out.println("All: " + numbers);

        System.out.println(numbers);
        numbers.get(0); // to get each index,,,,to access each element:arr[index]
        System.out.println(numbers.get(0)); // 100
        System.out.println(numbers.get(1)); // -100
        System.out.println(numbers.get(2)); // 50
        System.out.println(numbers.get(3)); // 23
        System.out.println(numbers);
        System.out.println("Add 50 :" + numbers.add(50)); //
//        System.out.println(numbers.get(30)); // outbonds

        // how do you know how many elements are in the array: arr.length
        // is length a method== NO
        System.out.println(numbers.size()); // 4
        System.out.println(numbers.get(2)); //23

//////////////array String

        ArrayList fruitlist = new ArrayList();
        fruitlist.add("mango");
        fruitlist.add ("banana");
        fruitlist.add("guava");
        fruitlist.add("strawberry");
        fruitlist.add("papaya");

        //////////////arrayList

        System.out.println(fruitlist);
//        fruitlist.remove("guava");
        System.out.println(fruitlist);
//        fruitlist.clear();
        System.out.println(fruitlist);
        fruitlist.contains("tomato");
        System.out.println(fruitlist.contains("banana"));




    }

}
