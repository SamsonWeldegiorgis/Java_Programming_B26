package my_utilities;

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

    public static String reverse (String words) {
        String reversed = "";
        for (int i = words.length() - 1; i >= 0; i--) {
            reversed += words.charAt(i);



        } return reversed;

    }
}
