package day13_if_statements3;

import java.util.Scanner;

public class FIzzBuzz {
    public static void main(String[] args) {

        fizbuzz();
    }

    public static void fizbuzz() {

        Scanner input = new Scanner(System.in);
        System.out.println("Put a number");
        int num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println("FIZZ");
            }
            if (i % 5 == 0) {
                System.out.println("BUZZ");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBUZZ");
            } else
                System.out.println(i);


//        if ( number % 3==0 && number % 5 ==0 ) {   // n % 15 == 0
//            System.out.println("BuzzFizz");
//        }else if(number % 3==0) {      // 3 , 6 , 15 , 18
//            System.out.println("Fizz");
//        } else if (number % 5==0 ){   // 10 , 20, 25 ,55,
//            System.out.println("Buzz");
//        }else {                         // Non divisible
//            System.out.println(number+ " is not Divisible to 3 and 5");
//        }
//    }
//
//       int number2 =  (number % 3 == 0 && number % 5 == 0) ? "BuzzFizz" : (number % 3==0) ?  "Fizz"
//               : (number % 5==0 )? "Buzz" : "Is not";
        }
    }}
