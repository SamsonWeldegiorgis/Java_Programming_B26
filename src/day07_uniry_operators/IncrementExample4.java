package day07_uniry_operators;



public class IncrementExample4 {

    public static void main ( String [] args){


        int b = 10;
        b++;
        System.out.println(b); // 10 > 11

        System.out.println("---------------------");

        b--;
        System.out.println(b);   //10 > 10
        System.out.println(b++); //10 >11
        System.out.println(b++); //11

        System.out.println("---------------------");

        int a = 40;
        System.out.println(--a); //39
        System.out.println(--a); //38
        System.out.println(a--); //38>37
        System.out.println(--a); //36
        System.out.println(--a); //35
        System.out.println(a--); //35>34

        System.out.println("---------------------");

        int c = 40;
        System.out.println(--c); // 3
        System.out.println(--c); // 3
        System.out.println(c--); // 3
        System.out.println(--c); // 3
        System.out.println(--c); // 3
        System.out.println(c--); // 3

        System.out.println("---------------------");

        String FIRST_NAME = "Noah ";
        String LAST_NAME = "Smith";
        String COMPANY_NAME = "Apple";

        String start_day = "10";
        String start_month = "1";
        String start_year = "2022";

        String FULL_NAME = FIRST_NAME+ "" + LAST_NAME;
        String DATE = start_month + "/" + start_day + "/" + start_year;

        System.out.println( FIRST_NAME + "" + LAST_NAME );
        System.out.println(start_month + "/"+ start_day + "/" + start_year );



        System.out.println(start_day+start_month+start_year);

        System.out.println("---------------------");

            int students =50, teachers;
                students =100; // students = 400 , studetnts = 1000;

        System.out.println(students);

        System.out.println("---------------------");

        int num1 =50;
        int num2 = 200;  // students = 400 , studetnts = 1000;

        num2=num1;
        System.out.println("Numb1: "+ num1); // 200
        System.out.println("Num2 :"+ num2); // 200

        System.out.println("---------------------");

        long d = 30l;
        short s = (short)d;

        System.out.println("b1:" + s);

        System.out.println("---------------------");

        float a5 = 100.459_524f;
        byte b5= (byte)a5;
        double c5 = b5;

        System.out.println(c5);



        System.out.println("---------------------");

        int i= 100;
        double d6 = 123;
        float f6= 300;

//
//        i=f6;
//        f6=i6;
//        d6=f6;
//        f6=d6;
//        d6=i;
//        i=d6;


        System.out.println("---------------------");

        System.out.println("Result A" + 0+1);
        System.out.println( "Result B"+(1)+2);


    }
}
