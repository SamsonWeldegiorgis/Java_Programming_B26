package day28_arrayPractice;

import day09_scanner.WorkStatus;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {

        String[] words = {"java", "longerword", "civic", "apple", "racecar"};

        String longestword = "";

        for (String each : words) {

            boolean isPalind = true;
            for (int i = 0; i < each.length(); i++) {

                if (each.charAt(i) != each.charAt(each.length() - 1 - i)) {
                    isPalind = false;
                    break;
                }
            }
            if (isPalind && each.length() > longestword.length()) {
                longestword = each;
            }
        }
        System.out.println(longestword.isEmpty() ? "NO palindrome" : longestword);


        System.out.println(" --------------------------------------------------");

        String[] word = {"racecar","anna", "boss"};

        String longa = "";
        boolean isPalo = true;

        for (String each : word) {
            for (int i = 0; i < each.length(); i++) {

                if (each.charAt(i) != each.charAt(each.length() - 1 - i)) {
                    isPalo = false;
                    break;
                }
            }
            if (isPalo && each.length() > longa.length()) {
                longa=each;
            }}
            System.out.println(longa.isEmpty() ? "No palindrome" : longa);


        System.out.println(" --------------------------------------");

//        int num = 30;
        Scanner input = new Scanner(System.in);
        System.out.println("Put the number");
        int num = input.nextInt();

        for (int i = 0; i <num ; i++) {
            String str = "";

        if (num % 3 == 0){
          str+="Fin";
        }else if ( num % 5 ==0){
            str+="Ra";
//        }else if (num %3 ==0 && num % 5 ==0){
//            str+="FinRa";
        }
            System.out.println(str.isEmpty() ? "i" : str+"="+i);
        }
    }}


