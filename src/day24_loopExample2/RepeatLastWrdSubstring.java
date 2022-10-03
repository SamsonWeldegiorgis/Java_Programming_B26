package day24_loopExample2;

public class RepeatLastWrdSubstring {
    public static void main(String[] args) {
                /*
Multiply End [String, Loops]
Given a String and a number return a String that has the ending character
duplicated and attached by the number amount of times

Input:   Hello?  3 		Output: 	Hello????
		 java   5 		Output:     javaaaaaa
         */

        int n = 0;
        String str = "java"; // Hello?
        int counter = 0;

        for (int index = 0; index < str.length(); index++) {

            if (str.length() == 3) {
                System.out.print((str.charAt(index)));
                counter = str.length();
            }
        }
        System.out.print((str.substring(counter,str.length()).repeat(2)));}

//        str+=str.substring(5,str.length());   //or
//        System.out.println(str);
    }


