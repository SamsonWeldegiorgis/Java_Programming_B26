package day37_wrapper_arraylist;

import java.util.Arrays;

public class UpperCaseTask {
    public static void main(String[] args) {

        String str =  "JAVA java";

        int upper=0, lower=0;
        boolean isequal = true;

        String upperCase ="";
        String lowerCase ="";

        for (int i = 0; i <str.length() ; i++) {

            char letter = str.charAt(i);

            if (Character.isUpperCase(letter)){
                upper++;
                upperCase+=letter;

            }if (Character.isLowerCase(letter)){
                lower++;
                lowerCase+=letter;
            }

        } if (upper==lower){
            System.out.println(isequal);
        }else {
            System.out.println(!isequal);
        }
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(Arrays.toString(upperCase.toCharArray()));
        System.out.println(Arrays.toString(lowerCase.toCharArray()));
    }
}
