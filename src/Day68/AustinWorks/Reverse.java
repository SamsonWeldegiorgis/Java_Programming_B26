package Day68.AustinWorks;

import java.util.*;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(reverser("JavaJava"));
        System.out.println(reverser2("JavaJava"));
        System.out.println(reverser3("JavaJava"));
        System.out.println(reverser4("JavaJava"));

    }

    public static String reverser (String str){ // return String type with string manupulation or collection type
        String result = "";

        for (int i =str.length()-1; i>=0;  i--) {

            result+=str.charAt(i);

        }return result;
    }

    ////////////////////////////////////////////
    public static String reverser2 (String str ){

        List<String>list = new ArrayList<>(Arrays.asList(str.split("")));
        String reversed = "";
        Collections.reverse(list);
        reversed = list.toString();

        return reversed;


    }
    ////////////////////////////////////////////
    public static String reverser3 (String str ){

        List<String>list = new ArrayList<>(Arrays.asList(str.split("")));
        String reversed = "";
        Collections.reverse(list);
        reversed = list.toString().replace("[","").replace("]","").replace(", ","");

        return reversed;


    }
    public static String reverser4 (String str ){

        String reversed = "";

        Stack<String> stack = new Stack<>();
       stack.addAll(Arrays.asList(str.split("")));
       // pop() -> deletes the last elements  - and returns too

        for (int i = 0; i <str.length(); i++) {
            reversed += stack.pop();
        }

        return reversed;


    }
}
