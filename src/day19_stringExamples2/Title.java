package day19_stringExamples2;

import java.util.Locale;
import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        /*
        ask the user to enter their name including titles
        use the following titles to determine how to refer to the person as handle case sensitivity.
        User could enter a title as ms, or MS, or Ms. All should result in a valid result
	titles:
		Mr or Mister     ,        		Ms or Miss or Madam          ,  		Dr
	and some titles can come after a name:

		Sr               ,  		Jr
Based on both starting and ending titles print the following messages:
		Mr or Mister: Hello Sir    ,   		Ms or Miss or Madam: Hello Ma'am    ,  		Dr: Hello Doctor

		Sr: Nice to meet you Senior    , 		Jr: Nice to meet you Junior
Note: It is possible to have both beginning and ending titles, one of them, or none of them
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name with titles");
        String name = input.nextLine().toLowerCase();   // we can NOT use switch for we are not comparing and like boolean


        if (name.startsWith("mr") || name.startsWith("mister")){
            System.out.println("Hello Sir");
        }else if (name.startsWith("ms") || name.startsWith("miss") || name.startsWith("madam")){
            System.out.println("Hello Ma'm");
        }else if ( name.startsWith("dr")) {
            System.out.println("Hello Doctor");
        }
        if(name.endsWith(" sr")){
            System.out.println("Nice to meet you Senior");
        } else if (name.endsWith(" jr")){
            System.out.println("Nice to meet you Junior");
        }

    }
}
