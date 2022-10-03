package day23_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secretNumber = 80;
        int guess;
        int attempt =0;

        do {
            System.out.println("Guess a number from 1-100");
            guess = input.nextInt();  // 70


            if (guess > secretNumber) {
                System.out.println(guess + " is too big");
            } else if (guess < secretNumber) {
                System.out.println(guess + " is too low");
            }
            }while(guess !=secretNumber);
        System.out.println("You guessed corrrecly");

        }
        }


//        int guess = 0;
//        int secretNumber = 80;

//        do {
//            System.out.println("Enter the guess number : 1-100");
//            guess = input.nextInt();
//
//            if (guess > secretNumber) {
//                System.out.println("Too big");
//            }
//            if (guess < secretNumber) {
//                System.out.println("Too low");
//            }
//             }
//            while (guess != secretNumber) ;
//
//           System.out.println("Guessed correctly");



//
//    }}




