package day41_arraysPractice5;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {
    /*  < seven length
    Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
    Output: "Japan", "Korea", "Turkey", "Canada"
     */

    public static void main(String[] args) {
        ArrayList<String > coutries = new ArrayList<>(Arrays.asList( "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
        System.out.println(removeCountries(coutries));
    }
    public static ArrayList<String> removeCountries(ArrayList<String> countries){
        countries.removeIf(country -> country.length() >=7 );
        return countries;

    }
}
