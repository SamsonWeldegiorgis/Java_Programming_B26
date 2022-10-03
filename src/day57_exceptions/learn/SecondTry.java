package day57_exceptions.learn;

public class SecondTry {

    public static void main(String[] args) {


        try {
            String s = null;
            System.out.println(s.length()); // null.length

        } catch (NullPointerException e) {
            System.out.println("Caught a null pointer exception");

        }

        System.out.println(" -------------------------------");


        try {
            String s = "Java";
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a null pointed exceptions");
        }

        System.out.println(" -------------------------------");


        try {
            String s = "Java";
            System.out.println(s.length());

            int[] a = {1, 4, 5, 2};
            System.out.println(a[10]);
        } catch (NullPointerException e) {
            System.out.println("Caught a null pointed exceptions");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught a null pointed exceptions");
        }
        System.out.println("DONE");
    }
}
