package day1_04_04_2022;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P02_FreqOfChars {
    /*
    find the frequency ,,NOT USE nested loop

    input ;; AABCCDDEE .......>> "ABCDE" .......A2B1C2D2E2
     */

    public static void main(String[] args) {
        String str = "AABCCDDEE";

        // String + split()  > String array + as list() > String Arraylist

        String[] strArray = str.split("");
        System.out.println(Arrays.toString(strArray)); // [A, A, B, C, C, D, D, E, E]

        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArray));

        String result = "";
        for (String each : strList) {
            int freq = Collections.frequency(strList, each);
            if (result.contains(each)) // not to get repeated results
                continue;
            result += each + freq;

        }
        System.out.println(result);


        //////////////////////////with CharArray //////////////////////////////////

        System.out.println(" ---------------------------------------");
        // String + toCharArray () > char [].. for loop    > Arraylist <Character>

        String str2 = "AABCCDDEE";

        char[] chArray = str2.toCharArray();
        System.out.println(Arrays.toString(chArray)); // [A, A, B, C, C, D, D, E, E]

        ArrayList<Character> chList = new ArrayList<>();

        for (Character each : chArray) {
            chList.add(each);
        }
        System.out.println(chList);

        String result2 = "";
        for (Character each : chList) {

            int freq = Collections.frequency(chList, each);
            if (result.contains("" + each)) // not to get repeated results
                continue;
            result += each + freq;

        }
        System.out.println(result);


    }
}




