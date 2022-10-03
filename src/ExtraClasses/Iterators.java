package ExtraClasses;

import java.beans.PropertyEditorManager;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterators {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(100,100,200,300,300,400,500));

        Iterator <Integer> it = num.iterator();
        while (it.hasNext()){
           if(it.next() <=300 ){
               it.remove();
           }
        }
        System.out.println(num);


        }
}