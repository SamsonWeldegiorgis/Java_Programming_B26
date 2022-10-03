package day37_wrapper_arraylist;

import day30_arraysForEach.CharArray;

import java.util.Arrays;
import java.util.Locale;

public class CountCharacter {
    public static void main(String[] args) {


    /*
    given some string, count the number of uppercase letter, lower, numbers & other character
    aP3d572&*jd@jdJU
     */                   // for each loop is for arrays....

        String s = "aP3d572&*jd@jdJU";
        int upper =0, lower =0 , number =0, other=0;
        String uppercaseChars = "";
        String lowercaseChars = "";
        String numbersChars = "";
        String otherChars = "";

        for (int i = 0; i <s.length() ; i++) {

            char letter = s.charAt(i);
            if(Character.isUpperCase(letter)){
                upper++;
                uppercaseChars+=letter;
            }else if(Character.isLowerCase(letter)){
                lower++;
               lowercaseChars+=letter;

            }else if (Character.isDigit(letter)){
                number++;
                numbersChars+=letter;

            }else {
                other++;
                otherChars+=letter;
            }
        }
        System.out.println("Uppers : " + upper);
        System.out.println("UpperCase letters : " + Arrays.toString(uppercaseChars.toCharArray()));

        System.out.println("Lowers : " + lower);
        System.out.println("LowerCase letters : " + Arrays.toString(lowercaseChars.toCharArray()));

        System.out.println("Numbers : " + number);
        System.out.println("Numbers letters : " + Arrays.toString(numbersChars.toCharArray()));

        System.out.println("Other Chars : " + other);
        System.out.println("Others chars : " + Arrays.toString(otherChars.toCharArray()));

        System.out.println(" ---------------------------------");
        ///////////////another  question //////////////////////

        String st="jav45ai1000sgre1at82";
       //  result: 45+1000+1+82 ----> 1128
        int numbe = 0 ;
        String numbNum = "";

        for (int i = 0; i <st.length() ; i++) {

            char lett = st.charAt(i);

            if (Character.isDigit(lett)) {
                numbe++;
                numbNum+=lett;
            }
        }
        System.out.println(numbe);
        System.out.println("The numbers are: " + Arrays.toString(numbNum.toCharArray()));
        System.out.println(numbNum.toCharArray()[0]);

        String first = st.substring(3,5);
        Integer f = Integer.valueOf(first);

        String second = st.substring(7,11);
        Integer s1 = Integer.valueOf(second);

        String third = st.substring(15,16);
        Integer t = Integer.valueOf(third);

        String fourth = st.substring(st.length()-2,st.length());
        Integer f1 = Integer.valueOf(fourth);

        System.out.println("The total sum : " + (f+s1+t+f1));


}}

