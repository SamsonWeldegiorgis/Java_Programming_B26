package day08_relational_operators;

public class AllOperators {
    public static void main(String[] args) {

        System.out.println(5+2*3); // 11 ( first priortiy is multiplication )
                        //  5 + 2 * 3
                        // 5 + 6
                        // 11

        System.out.println( 5 * 2+ 4 /2);  // 12  .....go left to right
                        // 10 + 4 /2
                        // 10  + 2
                        // 12

        System.out.println( 5 + 2 > 4 - 3);  // left to right
                        // 7 > 4-3
                        // 7 > 1
             // boolean // true

        int a = 20; // 20 >  19 > 20 >  19 >  18
        int b =  -a-- + a++ + --a * a--;
        //
        //
        //           -1 + 361
        //              360

        System.out.println( a); // 18
        System.out.println( b);  // 360



        int a2 = 5;//  3
        int b2 =     -a2-- + a2++ + --a2 * a2--;
        //          -5 > 4 + 4 >5  + 4  * 4 > 3
        //          -5    +  4 +     4  * 4
        //           -5+4+16
        //             15

        System.out.println("a2: "+a2);
        System.out.println("b2 :"+b2);


        System.out.println( a2); // 3
        System.out.println( b2);  // 15

        for (int i=1; i<=100; i++ ) // 3
            System.out.println(i); // 19


        int start = 1;

        for (int i = start; i < start +100 ; i++) {
            System.out.println(i);



        }




    }
}
