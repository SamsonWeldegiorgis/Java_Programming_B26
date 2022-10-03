package day57_exceptions.learn;

import java.security.spec.ECField;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
//        System.out.println(num);

        try {
            System.out.println("Enter a number");
            int num = input.nextInt();  // Handled

            System.out.println("Enter a number 2");
            int num1 = input.nextInt();  // Handled

            System.out.println(num/num1);

        }catch (InputMismatchException obj){
            obj.printStackTrace();// shows the exception message in the console

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            input.close();
        }
        System.out.println("Done");



    }
}
