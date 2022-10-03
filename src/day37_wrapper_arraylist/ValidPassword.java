package day37_wrapper_arraylist;

import java.util.Arrays;

public class ValidPassword {
    public static void main(String[] args) {
        /*
        Valid Password
	Given a String password find out if it is a valid password
	Requirements:
		Must have at least 8 characters
		Must have at least 1 uppercase letter
		Must have at least 1 lowercase letter
		Must have at least 1 number
		Must have one of the follow special characters:
! @ # $ % ^ & *
         */
        String characters = "saMsOn45!#";
        int numbers=0, upper =0 , other=0, lower =0;
        String upperCase ="";
        String lowerCase = "";
        String othersChar ="";
        String numbersChar ="";

        for (int i = 0; i <characters.length() ; i++) {
                char letter = characters.charAt(i);
                if (Character.isUpperCase(letter)){
                    upper++;
                    upperCase+=letter;
              }else if (Character.isLowerCase(letter)){
                    lower++;
                    lowerCase+=letter;
             }else if (Character.isDigit(letter)){
                    numbers++;
                    numbersChar+=letter;
             }else{
                    other++;
                    othersChar+=letter;
            }
            }
        System.out.println("upper: "+upper);
        System.out.println("lower :"+lower);
        System.out.println("numbers :"+numbers);
        System.out.println("other :"+other);

        System.out.println("Uppercase#: " + Arrays.toString(upperCase.toCharArray()));
        System.out.println("Lowercase#: " + Arrays.toString(lowerCase.toCharArray()));
        System.out.println(("NumberCase#: " + Arrays.toString(numbersChar.toCharArray())));
        System.out.println("SpecialCases#: " + Arrays.toString(othersChar.toCharArray()));
    }
}
