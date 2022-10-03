package day57_exceptions.learn;

import java.util.ArrayList;
import java.util.Locale;

public class RecapTry {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");
        try {

              System.out.println(list.get(5));

              String s=null;
              s.toLowerCase();

        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounds catch block");
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("No object");
            e.printStackTrace();
        }
        System.out.println(list );
        System.out.println();

        try{
            Thread.sleep(-3000);   //  3 sec
        }catch (InterruptedException | IllegalArgumentException e){
            System.out.println("Wrong Numbers");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Last line for the sleep try");
        }

    }
}
