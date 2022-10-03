package day44_Constructor2;

import day43_constructors.Offer;

import javax.imageio.plugins.tiff.TIFFField;
import javax.naming.PartialResultException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UsingOffer {

    public static void main(String[] args) {
        Offer first = new Offer ("Google", "Texas",250_000,true, 15);// creating an offer obj
//        System.out.println(first);

        System.out.println();

        ArrayList<Offer> allOffers = new ArrayList<>();// creating an ArrayList that will hold offer obj
        allOffers.add(first); // added the first offer obj to the Arraylist

        allOffers.add(new Offer("Amazon","New York",180_000, true,15));
        System.out.println(allOffers);

        Offer [] moreOffers = {
                new Offer ("Apple", "Chicago", 230_000,false , 10),
                new Offer ("Tesla", "Texas" , 250_000, false, 20),
                new Offer ("Facebook", "Florida", 120_000, true, 10 )};

                allOffers.addAll(Arrays.asList(moreOffers));// added the array of offers into the Arraylist of offers
        System.out.println(allOffers);

        allOffers.addAll(Arrays.asList(
                new Offer( "Discord", "Chicago", 150_000, false,13),
                new Offer ("Netflix" , "Canada", 170_000, true, 12)
                // added offer obj using the var args of the asList method to add multiple offer obj at the same time



        ));
        System.out.println();
        System.out.println(allOffers);
        // create Arraylists to filter the Offers

        ArrayList<Offer> salaries = new ArrayList<>(allOffers);
//        salaries.removeIf(each-> each.salary<170_000);
        System.out.println();

        ArrayList<Offer> fullTime = new ArrayList<>(allOffers);
//        fullTime.removeIf(each -> each.fullTime);
    }
}
