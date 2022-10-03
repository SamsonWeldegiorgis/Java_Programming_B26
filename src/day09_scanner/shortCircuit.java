package day09_scanner;

public class shortCircuit {
    public static void main(String[] args) {

        // get a discout if its a Friday and you are a teacher or police officer or firefighter

        boolean teacher = false ;
        boolean fireFighter =false;
        boolean policeOffcer = false ;

        boolean discoutGot = teacher = false && fireFighter && policeOffcer;

        System.out.println( "Discount : " + discoutGot);


        // System.out.println( 5/ 0 );

//        System.out.println(true || 5/0 == 0 ); // true
//
//        System.out.println(false | 5/0 == 0 ); // NO Print out -- Wrong type --
//
//        System.out.println(true | 5/0 == 0 ); // NO Print out -- Wrong type --
//
//        System.out.println(true && 5/0 == 0 ); // NO Print out -- Wrong type --
//
//        System.out.println(true & 5/0 == 0 ); // NO Print out -- Wrong type --




        int a = 0;
        System.out.println(false && a++ == 5 ); // NO Print out -- Wrong type --
        System.out.println("a:" + a); //  5


        int b = 0;
        System.out.println(false & b++ == 5 ); //  NO Print out -- Wrong type --
        System.out.println("b:" + b); //  5
    }
}
