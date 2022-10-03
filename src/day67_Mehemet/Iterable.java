package day67_Mehemet;

import day65_streams.Item;

import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable {

    public static void main(String[] args) {

        /*
        Remove Name from list if
         */
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Mehemet", "Togrul","Olga","John" ,"Emre" ,"Daniel","Erjon", "Kamil"
        ));
        for (int i = 0; i <names.size(); i++) {
            if(names.get(i).length()<6 || names.get(i).startsWith("M")) {
                names.remove(i);

            }}
        System.out.println(names);



        System.out.println(" ======================================");



        Iterator <String > iterator = names.iterator();

        while (iterator.hasNext()){
//            iterator.next();

            if(iterator.next().length()<6 || iterator.next().startsWith("M")){
                iterator.remove();
            }
        }
        System.out.println(names);

        System.out.println(" ======================================");
        names.removeIf(each -> (each.length()<6 || each.startsWith("M")));
        System.out.println(names);
    }
}
