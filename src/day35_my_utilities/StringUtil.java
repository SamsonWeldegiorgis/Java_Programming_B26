package day35_my_utilities;

public class StringUtil {

    /*
    reverse : create a method that will accept any string and return the reversed version
     */

    public static void main(String[] args) {

        System.out.println(reverse("Samson"));
        System.out.println(reverse("Thomas"));
        System.out.println(reverse("WorkPlS"));
        System.out.println(reverse("JaVa"));

    }

    public static String reverse(String words) {
        String reversed = "";
        for (int i = words.length() - 1; i >= 0; i--) {
            reversed += words.charAt(i);
        }
        return reversed;

    }

    // fix format  /
    /*
    Ex:  	Input:   jamES   	Output: 	James


*/

    public static String fixFormat(String str) {
        str = str.trim();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

/*
    Frequency of Character

create a method that will accept a word(String) and a letter (char)
 and return how many times that given letter is found in the given word

Ex:	Input: 		apple, p	Output:		2
Ex:	Input:		apple, z	Output:		0
Ex:	Input:		aabbaacca, a	Output:  5
     */

        public static int frequencyofCharacter (String str, char letter) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == letter) {
                    count++;
                }
            }return count;
}
/*
camel case :	Input:  	JAVA will ruLE tHe wORLd
              	Output:      javaWillRuleTheWorld
 */
    public static String camelCase(String str) {

        str = str.toLowerCase();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                str2 += (" " + str.charAt(i+1)).toUpperCase();
                i++;
            } else {
                str2 += str.charAt(i);
            }
        }
        return str2.replace(" ", "");
    }


    /*
  Ex:   Input:    aaaaabcccdeeff    Output:  bd
 */
    public static String uniqueCharacter( String str) {

        String unique = "";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            if (!checked.contains("" + str.charAt(i))) {
                int count = StringUtil.frequencyofCharacter(str, str.charAt(i));
                checked += str.charAt(i);

                if (count == 1) {
                    unique += str.charAt(i);
                }

            }
        }
        return unique;

    }
    }

