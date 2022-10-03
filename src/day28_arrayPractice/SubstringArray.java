package day28_arrayPractice;

public class SubstringArray {


        public static void main(String[] args) {


            System.out.println(missingChar("kitten", 1));
            System.out.println(missingChar("kitten", 0));
            System.out.println(missingChar("kitten", 4));

            System.out.println(" -------------------------");
            System.out.println(notString("candy"));
            System.out.println(notString("\"x\""));
            System.out.println(notString("not bad"));

        }

        public static String missingChar(String str, int n) {
            String front = str.substring(0, n);

            // Start this substring at n+1 to omit the char.
            // Can also be shortened to just str.substring(n+1)
            // which goes through the end of the string.

            String back = str.substring(n+1, str.length());

            return front + back;
        }

    public static String notString(String str) {

        if (str.length() >=3 && str.substring(0,3).equals("not")){
            return str ;
        }
        return "not " + str;
    }

    }

