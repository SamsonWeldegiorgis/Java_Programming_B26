package day57_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws_Example {

    public static void main(String[] args) throws InterruptedException {


        Thread.sleep(5000);
        System.out.println("HEllo");
//        throw new ArithmeticException("Wrong calculations !");

//        throw  new InterruptedException();

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 130) {
            throw new InputMismatchException("Invalid age :" + age);
        }

        System.out.println("age =" + age);

    }
}
