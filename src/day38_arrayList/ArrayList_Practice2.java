package day38_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice2 {

    public static void main(String[] args) {

            String[] input1 = {"java", "html", "css", "java", "javascript", "selenium"};

            int count = 0;
            for (String each : input1)

                if (each.equals("java")) {
                    count++;
                }
            System.out.println("Java# : " + count);


            System.out.println(" ---------another form--------------------");




            System.out.println(" -----------------------------");

            ArrayList<String> input = new ArrayList<>();
            input.add("java");
            input.add("html");
            input.add("css");
            input.add("java");
            input.add("javascript");
            input.add("selenium");

            int counter = 0;
            System.out.println(input);
            for (int i = 0; i < input.size(); i++) {

                if (input.get(i) == "java") {
                    counter++;
                }

            }
            System.out.println("Java# : " + counter);


            System.out.println(" -----------------------------");

            String[] fruits = {"apples", "tree", "loop", "cat", "animal", "shortcut"}; // tree , loop , cat

            ArrayList<String> fruit = new ArrayList<>();

            fruit.add("apples");
            fruit.add("tree");
            fruit.add("loop");
            fruit.add("cat");
            fruit.add("animal");
            fruit.add("shortcut");

            ArrayList<String> str6 = new ArrayList<>();

            for (int i = 0; i < fruit.size(); i++) {

                if (fruit.get(i).length() <= 4) {
                    str6.add(fruit.get(i));

                }
            }
            System.out.println(("Str6 : " +str6));

            System.out.println(" -----------------------------");

            String[] star = {"one", "hi", "hold"};

            ArrayList<String> strs = new ArrayList<>(); // ***, ** , ****
            strs.add("one");
            strs.add("hi");
            strs.add("hold");

            strs.set(0, "***");  // set = replace
            strs.set(1, "**");
            strs.set(2, "****");
            System.out.println(strs);

            System.out.println(" -----------------------------");

        ArrayList<String> str = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList<String> hide = new ArrayList<>();

        String s = "";
        for (int i = 0; i < str.size(); i++) {

            s = "";
            String a = str.get(i);
            for (int j = 0; j < a.length(); j++) {
                s += "*";
            }
            hide.add(s);
        }
        System.out.println("Hidden : " + hide);

        System.out.println(" -------------------------------------");


            ArrayList<String> password=new ArrayList<>(Arrays.asList("one", "hi", "hold"));

            for (int i = 0; i < password.size(); i++) {
                String list ="";
                list ="*".repeat(password.get(i).length());
                password.set(i, list);
            }
            System.out.println("Password : " + password);


        System.out.println(" -------------------------------------");

            String hello = "heLLoWoRlD";  //

            ArrayList<String> upper = new ArrayList<>();
            ArrayList<String> lowerr = new ArrayList<>();

            String countUpper = "";
            String countLower = "";
            String upper1 = "";
            String lower1 = "";

            for (int i = 0; i < hello.length(); i++) {

                char letter = hello.charAt(i);

                if (Character.isUpperCase(letter)) {
                    countUpper += letter;
                }
                if (Character.isLowerCase(letter)) {
                    countLower += letter;

                }
            }

            System.out.println("countUpper: " + Arrays.toString(countLower.toCharArray()));
            System.out.println("countUpper: " + Arrays.toString(countUpper.toCharArray()));


            System.out.println(" -------------another way------------------------------");


            String hello1 = "heLLoWoRlD";  //

            ArrayList<String> uppe = new ArrayList<>();
            ArrayList<String> lowe = new ArrayList<>();

            for (int i = 0; i < hello1.length(); i++) {

                if (Character.isUpperCase(hello1.charAt(i))) {
                    upper.add(hello1.charAt(i) + "");
                }
                if (Character.isLowerCase(hello1.charAt(i))) {
                    lowerr.add(hello1.charAt(i) + "");
                }
            }
            System.out.println("Upper: " + upper);
            System.out.println("Lower: " + lowerr);


            System.out.println(" -------------------------");
/*
    String  str = "ABCD123$%#@&456EFG!";
    list1: {$, %, #, @, &, !}
    list2: {A, B, C, D, E, F, G}
    list3: {1, 2, 3, 4, 5, 6}

*/
            String str8 = "ABCD123$%#@&456EFG!";

            ArrayList<Character> digit = new ArrayList<>();
            ArrayList<Character> upper4 = new ArrayList<>();
            ArrayList<Character> special = new ArrayList<>();

            for (int i = 0; i < str8.length(); i++) {
                if (Character.isDigit(str8.charAt(i))) {
                    digit.add(str8.charAt(i));
                } else if (Character.isUpperCase(str8.charAt(i))) {
                    upper4.add(str8.charAt(i));
                } else {
                    special.add(str8.charAt(i));
                }
            }
            System.out.println(digit);
            System.out.println(upper4);
            System.out.println(special);


            System.out.println("----------------------------------");

            ArrayList<String> str4 = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));
            ArrayList<String> newArr9 = new ArrayList<>();

            for (int i = 0; i < str4.size(); i = i + 2) {

                String a = str4.get(i);
                String b = str4.get(i + 1);
                newArr9.add(b);
                newArr9.add(a);

            }
            System.out.println(newArr9);

            System.out.println(" --------------------------------------");


            // ex = 45659 = 4+5+6+5+9 =29 = 2+9 =11= 1+1= 2*/

//     String n = "45659"; // = 4+5+6+5+9 =29 = 2+9 =11= 1+1= 2*/

        }


    }


























