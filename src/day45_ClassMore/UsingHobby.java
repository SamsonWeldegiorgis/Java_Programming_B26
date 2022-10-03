package day45_ClassMore;

import com.sun.java.accessibility.util.AccessibilityListenerList;
import jdk.swing.interop.SwingInterOpUtils;

import java.awt.event.HierarchyBoundsAdapter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UsingHobby {
    /*
         - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies // get the false
      - create a copy ArrayList and remove all hobbies requiring other people  // get the false
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually//get <500
     */
    public static void main(String[] args) {

        Hobby play = new Hobby("Basket Ball", 400, true, true);
        ArrayList<Hobby> allHobby = new ArrayList<>();
        allHobby.add(play);

        System.out.println("\nFIRST : "  + allHobby);

       allHobby.add(new Hobby("Foot ball", 200,false, false));

        System.out.println("\nTogether : " + allHobby);

        Hobby [] newMore = {
                new Hobby("Volley ball" , 900, true, false),
                new Hobby("Cricket",700,false, true)};

       allHobby.addAll(Arrays.asList(newMore));
        System.out.println("\nALL  : " + allHobby);

        ArrayList<Hobby> outDoors = new ArrayList<>(allHobby);
        outDoors.removeIf(each-> each.isOutDoors !=true);
        System.out.println("\nOUTDOORS   : " + outDoors);

        ArrayList<Hobby> otherpeople = new ArrayList<>(allHobby);
        otherpeople.removeIf(each-> each.others !=true);
        System.out.println("\nOTHERPEOPLE  : " + otherpeople);

        ArrayList<Hobby> lessCost = new ArrayList<>(allHobby);
        lessCost.removeIf(each-> each.annualCost > 500);
        System.out.println("\nLESS COST  : " + lessCost);






    }







    }
