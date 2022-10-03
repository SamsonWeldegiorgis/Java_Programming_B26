package day23_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
        Palindrome : its the same reading from the beginning to end
        ex:
            mom
            racecar
            anna
            madam
                Task: check if a word is palindrome
                flow : declare some initial String
                        how to reverse a String
                        check if the reverese version is the same as the original
         *
            //   arozaupalanalapuazora
         */

        String str = "rocar";   // reverse the string
        String reverse = "";  // we will use it to compare to the original

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));  // FOR REVERSING FANUS  > SUNAF
            reverse += str.charAt(i); // the same ,,,,FOR REVERSING FANUS  > SUNAF
        }
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println(str.equals(reverse) ? "Palindrome" : "Not Palindrome");


        String mass = "DANU";
        String rever = "";

        for (int i = mass.length() - 1; i >= 0; i--) {
            rever += mass.charAt(i);

        }
        System.out.print(rever);

    }}


    ///////////////////Another form////////////////////////


//    String str = "LEVEL";
//    boolean check = true;
//
//        for (int i = 0; i < str.length() / 2; i++) {
//        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//        check = false;
//        break;
//        }}
//        System.out.println(check ? "Palindrome" : "Not Palindrome");
//        }
//        }












//            String text = "FANUS";
//
//        System.out.println(text.substring(4,text.length()));
//        System.out.println(text.substring(3,text.length()-1));
//        System.out.println(text.substring(2,text.length()-2));
//        System.out.println(text.substring(1,text.length()-3));
//        System.out.println(text.substring(0,text.length()-4));
//
//        System.out.println("with loop");
//
//        String word = new Scanner(System.in).nextLine();
//        String reverseStr = "";
//
//        for (int i = word.length() - 1; i < 0; i++) {
//            reverseStr += word.charAt(i);
//        }
//
//
//        boolean isPalindrome = word.equalsIgnoreCase(reverseStr);
//
//        if (isPalindrome) {
//            System.out.println("Is the word Palindrome: " + isPalindrome);
//        } else {
//            System.out.println("Word is not Palindrome ");



