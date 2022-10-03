package day38_arrayList;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("screen");
        list.add("mouth");
        list.add("keyboard");
        System.out.println(list);


        String item = list.remove(0); // removes the 1st index(computer) of the Arraylist and it returns the element from the method. We store the return value to a String variable called item.

        System.out.println("Item:" + item);
        System.out.println("List:" + list);

        boolean bool = list.remove("mouth");
        System.out.println("Bool:" + bool);
        System.out.println("List:" + list);
        list.remove(0);
        System.out.println(list );

    }
}
