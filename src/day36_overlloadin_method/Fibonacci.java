package day36_overlloadin_method;

import java.util.Arrays;

/*
input = 8 .....output = 0,1,1,2,3,5,8,13,21 ,,,,,,,,it adds the privious 2 numbers

        index         values
        0               0
        1               1
        2               1   index 0+ index 1
        3               2   index 1+ index 2
        4               3   index 2+ index 3
        5               5   index 3+ index 4
        6               8   index 4+ index 5
        7               13  index 5+ index 6
        8               21  index 6+ index 7

 */
public class Fibonacci {
//    public static void main(String[] args) {
//        System.out.println((fibonaci(8)));
//
//
//    }
//
//    public static String fibonaci(int f) {
//    int [] result = new int [f+1];
//    result[0] = 0;
//    result[1] = 1;
//
//        for (int j = 0; j <result.length -2 ; j++) {
//            result [j+2]= result[j]+result[j+1];
//
//        }
//        String [] fib = new String [f+1];
//        for (int i=0 ; i< result.length; i++){
//            fib[i] =" " + result[i];
//        }
//        String fibon = String.join(",",fib);
//             return fibon;




             ///////////////////another form///////////////////////////////////


            public static void main(String[] args) {

                fibo(8);
            }
            public static void fibo(int number){

                // Array solution
                int[] fibo=new int[number+1];

                //System.out.println(fibo[8]);

                fibo[0]=0;
                fibo[1]=1;

                for (int i = 2; i < fibo.length; i++) {
                    fibo[i]=fibo[i-1]+fibo[i-2];
                }
                System.out.println(Arrays.toString(fibo));
            }
        }






