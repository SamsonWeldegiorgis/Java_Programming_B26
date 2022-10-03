package day33_methods;

public class MethodIntro {
    public static void main(String[] args) {
        sum (20,50);
        int total = sum(20, 80) * 3;
        System.out.println(total);

        System.out.println(" --------------------");

        String s1= reverse("Wooden Spoon");
        System.out.println(s1);

        System.out.println(" --------------------");

//         ispalindrome("Java");
        System.out.println(ispalindrome("racecar"));//true
        System.out.println(ispalindrome("Anna")); // true
        System.out.println(ispalindrome("Java")); // false
    }

    public static int sum(int num1 , int num2){

        int result = num1 + num2;
//        System.out.println(result);
        return result;


    }

    public static String reverse(String name) {

        String result = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            result += name.charAt(i);

        }       return result;

        }

        public static boolean ispalindrome(String str){ // Java

        String reversed = reverse(str); //avaJ
        return reversed.equalsIgnoreCase(str);
        }


    }



