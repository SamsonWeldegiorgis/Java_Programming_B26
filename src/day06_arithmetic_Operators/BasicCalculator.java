package day06_arithmetic_Operators;

public class BasicCalculator {

    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;


        double addition= num1 + num2;
        double subtraction = num1-num2;
        double multiplication =  num1 * num2;
        double division = num1/ num2   ;
        double remainder = num1 % num2;






            // 10 / 3   = 3.3333 the remander is 0.1111

        // 10 % 3 = 10- ( 3* 10/3)   = 10-9 = 1 ( Integer value )

        System.out.println("\n"+ num1 + " + " +  num2 + " = "+addition );
        System.out.println( num1 + " - " +  num2 + " = "+subtraction );
        System.out.println(num1 + " * " +  num2 + " = "+multiplication );
        System.out.println( num1 + " / " +  num2 + " = "+division );
        System.out.println( num1 + " % " +  num2 + " = "+remainder );


        System.out.println("---------------------------------------------");

        System.out.println("\n"+ num1 + " + " +  num2 + "="+ (num1+num2));


        System.out.println("---------------------------------------------");


        System.out.println("\nAddition :      " + addition);
        System.out.println("Subtraction :    " + subtraction);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division :        " + division);
        System.out.println("Remainder :        " + remainder);


        System.out.println("---------------------------------------------");

        String p1 = "James";
        String p2 = "Jill";
        String p3 = "Bob";
        String p4 = "Betty";
        String p5 = "Herb";

        System.out.println(p3+", "+p2+", "+p4+", "+p5+", "+p1);

        System.out.println("\""+p1+"\"");




        char text = 'A';
        System.out.println( "\n text: "+ text);

        String letter = "A";
        System.out.println( "\n letter: "+ letter );




    }
}
