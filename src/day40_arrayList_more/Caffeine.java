package day40_arrayList_more;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drinks");
        drinks.add("soda");

        System.out.println("Drink : " +drinks);

        System.out.println(" -----------------------");

        ArrayList<String> drinks1 = new ArrayList<>(Arrays.asList("cofffe", "tea", "energy drinks", "soda"));
        System.out.println("Drinks1 : " +drinks1);


        System.out.println("-------------------------");

        ArrayList<String> drinks2 = new ArrayList<>(drinks);
        System.out.println("Drinks2 : " +drinks2);

        System.out.println(" --------------------------");

        String[] allDrinks = {"cofffe", "tea", "energy drinks", "soda"};
        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println("Drinks3 : " +drinks3);

        System.out.println("-----------------------------");

        ArrayList<String> drinks4 = new ArrayList<>();
        drinks4.addAll(Arrays.asList("cofffe", "tea", "energy drinks", "soda"));
        System.out.println("Drinks5 : " + drinks4);


        //or
        ArrayList<String> drink6 = new ArrayList<>();
        drink6.addAll(Arrays.asList(allDrinks));
        System.out.println("Drinks : " + drink6);

        drink6.removeAll(Arrays.asList(allDrinks));
        System.out.println("Drinks6 : " + drink6);
        System.out.println("Drinks3 : " + drinks3);



    }
}
