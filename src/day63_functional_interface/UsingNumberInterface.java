package day63_functional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface <Integer> everOrOdd = (n) -> {
            if (n % 2 == 0)
                System.out.println(n + " is even");
            else
                System.out.println(n + " is odd");



        };

        everOrOdd.apply(20);
        everOrOdd.apply(25);
        System.out.println(" -------------------------------");

        NumberInterface <Integer > maxOrmin = (n) -> {
            if( n >100)
                System.out.println(n + " is max");
            else
                System.out.println(n + " is min");

        };

        maxOrmin.apply(150);
        maxOrmin.apply(90);
        System.out.println(" -------------------------------");

        NumberInterface <Integer> cube = (number) -> {
            System.out.println("Cube of "+ number +" : "+ (number*number*number));
        };
        cube.apply(3);
        cube.apply(10);


        NumberInterface<String> reverse= (str) -> {

            for (int i =str.length()-1; i>=0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
         };
                reverse.apply("Wooden Spoon");


    }}

