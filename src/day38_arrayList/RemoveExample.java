package day38_arrayList;

import java.util.ArrayList;

public class RemoveExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list); // [water, sun, wind,wood]
        list.remove(0);
        System.out.println(list.remove(list.size()-1));
        System.out.println(list);  // [sun, wind]
        // list.size() - 1 == last index
        // remove(last index ) = remove element : wood
        // print the removed element : wood

        list.remove("sun");
        System.out.println(list);

        System.out.println(list.remove("apple"));//false -not available
        System.out.println(list);

        list.add("light");
        list.add("light");
        System.out.println(list);

        list.remove("light");
        list.remove(list.remove("light"));
        System.out.println(list);


//        list.clear();
//        System.out.println(list); //cleared



    }
}
