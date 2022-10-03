package day40_arrayList_more;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {
    public static void main(String[] args) {
        /*
        Input: {"ted", "talk", "learn"}
        Output: {"det", "klat", "nrael"}
         */

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Ted","Talk", "learn"));
        System.out.println("PW: "+words);

        for (int i = 0; i <words.size() ; i++) {
            String reverser = "";

            for (int j =words.get(i).length()-1 ; j>=0 ; j--) {
                reverser+=words.get(i).charAt(j);

            }
            words.set(i,reverser);
        }
        System.out.println(words);

        System.out.println("-------other ways----------------------------");

        ArrayList<String> wor  = new ArrayList<>(Arrays.asList("Ted", "Talk", "learn"));
        ArrayList<String> wor2  = new ArrayList<>(Arrays.asList());

        for (int i = 0; i <wor.size() ; i++) {
            String reve = "";
            for (int j = wor.get(i).length() - 1; j >= 0; j--) {
                reve += wor.get(i).charAt(j);
            }
            wor2.add(reve);

        }
        System.out.println(wor2);

        System.out.println(" -----------------------------------------------------------");

    }}


