package day37_wrapper_arraylist;

public class WrapperExplanation {
    public static void main(String[] args) {


    /*



        /*
            Why do we need wrapper classes?

            - Collection allows only OBJECTS (non-primitive )
                    String, Integer,Double etc

            - Collection --> Arraylist etc
            - Wrapper classes has many useful methods

                - Character.isDigit()
                - Character.isUpperCase()
                - Character.isLowerCase ()
                - valueOf() vs parseInt()/parseDouble() etc

            - To convert primitives to OBJECTS

            - Autoboxing vs Unboxing

                Autoboxing --> Primitive to OBJECTS
                Unboxing   --> OBJECTS to primitive



     */
        System.out.println(" --------------------------");
        // Autoboxing : primitive to objects
        Integer a = new Integer(30);
        Integer b = 30;

        // these 2 are totally same...

        System.out.println(" --------------------------");
        // Unboxing   : objects to primitive
        Integer c = Integer.valueOf(30);
        Integer d = c;  // unboxing

        // valueof() vs parseInt()   / ParseDouble () etc...

        // valueOf ()    - > returns objects  (Wrapper class )

        // parseMethods ()    - > returns primitive

        int e = Integer.parseInt("123");

        Integer f = Integer.valueOf(123);

        // wrapper classes methods:

        System.out.println((Character.isDigit('a'))); // false
        System.out.println((Character.isUpperCase('a')));// false
        System.out.println((Character.isLowerCase('a')));// false


        System.out.println(" -----------------------------------------");

        // Casting : putting the bigger into smaller size

        Integer num= Integer.valueOf(123);

//        Double doub =(num); // Casting is NOT possible with wrapper classes
        Double doub1 =Double.valueOf(num);


    }

}
