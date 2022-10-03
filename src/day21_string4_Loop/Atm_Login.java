package day21_string4_Loop;

import java.util.Scanner;

public class Atm_Login {
    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
        System.out.println("welcome to ATM");

        int validPin = 1234;
        int userNumber = 0;
        int attempts= 0;

        do {
            System.out.println("Enter the pin");
            userNumber = input.nextInt();
            attempts++;

        } while (attempts <= 3 && userNumber != validPin) ;{

                if (userNumber == validPin) {
                    System.out.println("LOgged in");
                } else {
                    System.out.println("LOGed out");
                }
            }
        System.out.println(" ---------------------------------");

/////////////////////////////////////////////////////////////////

                System.out.println("Please enter PassWord");
                        String passWord = input.nextLine();
                        boolean corectPass = true;

                        for (int i = 0; i < 2; i++) {
        if(passWord.length() == 4 && passWord.startsWith("aa")){
        System.out.println("LOGGED IN");
        corectPass= true;
        break;
        }else {
        System.out.println("Please enter Pass");
        passWord = input.nextLine();
        corectPass=false;
        }

        }if(!corectPass){
        System.out.println("Try in 24 hours");
        }


        }
        }



