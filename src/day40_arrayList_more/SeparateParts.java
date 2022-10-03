package day40_arrayList_more;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {

        String s = "ABCD123$%#&4,!56EFG?*";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(list);

        ArrayList<String> numbers = new ArrayList<>(list);
        ArrayList<String> specialChars = new ArrayList<>(list);

        numbers.retainAll(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
        System.out.println("Numbers : " + numbers);

        specialChars.retainAll(Arrays.asList("~","!","#","$","%","^","&","*","(",")","-","+","/","?",","));
        System.out.println("Special : " +specialChars);

        ArrayList<String> letters = new ArrayList<>(list);
        letters.removeAll(numbers);
        letters.removeAll(specialChars);
        System.out.println("Letters: " + letters);



    }
}
