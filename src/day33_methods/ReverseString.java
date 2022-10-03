package day33_methods;

public class ReverseString {



    public static void reverse(String str) {
        String revers ="";
        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

        public static void main(String[] args) {

            reverse("samson");
            reverse("Hagos");
            reverse("Tomas");



    }
    }