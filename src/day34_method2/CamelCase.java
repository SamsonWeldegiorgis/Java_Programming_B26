package day34_method2;

public class CamelCase {
    /*
    Camel Case

create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase

Ex:
	Input:
		JAVA will ruLE tHe wORLd

	Output:
		javaWillRuleTheWorld

     */
    public static String camelCase(String str) {

        str = str.toLowerCase();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
<<<<<<< HEAD
                str2 += ("" + str.charAt(i+1)).toUpperCase();
=======
                str2 += (" " + str.charAt(i+1)).toUpperCase();
>>>>>>> github/master
                i++;
            } else {
                str2 += str.charAt(i);
            }
        }
        return str2.replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(camelCase("JAVA will ruLE tHe wORLd"));
    }}