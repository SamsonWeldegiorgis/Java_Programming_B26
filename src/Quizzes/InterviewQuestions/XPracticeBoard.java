package Quizzes.InterviewQuestions;

import day55_polymorphism.DriverTask.JavaScriptExecuter;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class XPracticeBoard {
    private static Object Driver;

    public static void main(String[] args) {


     String str = "HellOWORJFKLJSFKDKJBNDB()$(*%&*(#nfofadjfkljq937948350-&*(@$*(";

        ArrayList<String> upper = new ArrayList<>();
        ArrayList<String> lower = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
        ArrayList<String> special = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            if(Character.isUpperCase(str.charAt(i))){
                upper.add(str.charAt(i)+"");

            }else if(Character.isLowerCase(str.charAt(i))){
                lower.add(str.charAt(i)+"");

        }else if(Character.isDigit(str.charAt(i))) {
                number.add(str.charAt(i)+"");

            }else {
                special.add(str.charAt(i)+"");
            }}

//        JavaScriptExecuter js = (JavaScriptExecuter) Driver;
//        js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1 , 5000);");

        System.out.println("Upper : "  + upper);
        System.out.println("Lower : "  + lower);
        System.out.println("Number : "  + number);
        System.out.println("Special : "  + special);

        }

    }


