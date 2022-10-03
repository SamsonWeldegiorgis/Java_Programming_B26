package day46_static;

import java.util.Objects;

public class BestBuyStores {
    public static void main(String[] args) {

        // access the static members by the class name
        System.out.println("\nHead Quarters : " + BestBuy.headquarters);
        System.out.println("Day : " + BestBuy.day);
        System.out.println("Computers# : " + BestBuy.numberOfComputer);

        BestBuy store1 = new BestBuy("Oak Drive");

        System.out.println(store1.location);// accessing the location of instant varialbe

        store1.numberOfComputer--; // 100-1 == 99
        System.out.println("BestBuy#: " +BestBuy.numberOfComputer); // 99

        BestBuy store2 = new BestBuy("Main St");

        store2.numberOfComputer -=5;     // 99-5 = 94
        System.out.println("Loc S1#: " + store1.numberOfComputer); // 94
        System.out.println("BestBuy# : " +BestBuy.numberOfComputer);  // 94

        store2.location = "FairFax";
        System.out.println("Loc S1: " + store1.location);
        System.out.println("Loc S2: " +store2.location);

        BestBuy.restock(); // upgrade for all BestBuy stores,,,,by 20#
        System.out.println(BestBuy.numberOfComputer);
        System.out.println(store1.numberOfComputer);
        System.out.println(store2.numberOfComputer);
        store1.restock();
        System.out.println(BestBuy.numberOfComputer);
        store2.restock();
        System.out.println(BestBuy.numberOfComputer);




    }}