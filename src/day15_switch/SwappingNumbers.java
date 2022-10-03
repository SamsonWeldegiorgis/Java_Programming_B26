package day15_switch;

import java.util.ArrayList;

public class SwappingNumbers {

    public static void main(String[] args) {
        System.out.println(frqcy("SamsonSS",'s'));

        System.out.println(" ------------------");
        System.out.println(unique("aaabbbcccdef"));

    }

    public static int frqcy(String str, char letter) {

        int counter = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;

    }

    public static String unique (String str){
        String uniue ="";
        String checker ="";
        int counterrr =0;

        for (int i = 0; i < str.length(); i++) {
            if (!checker.contains("" +str.charAt(i))){
                counterrr=frqcy(str,str.charAt(i));
                checker+=str.charAt(i);

                if(counterrr==1){
                    uniue+=str.charAt(i);
                }
            }

        }return uniue;

    }}




