package day38_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {

    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("hello");
        listOne.add("bye");
        System.out.println("list One: " + listOne);


        ArrayList<String> listTwo = new ArrayList<>(listOne);
        System.out.println("list Two: " + listTwo);
        listTwo.add("Hola") ;
        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("one","two","three"));
        System.out.println(listThree);

  //    ArrayList<String> listFour = new ArrayList<>("four", "five" ,"six" ); // not valid syntax at all


    }
}
