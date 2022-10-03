package day64_BiPredicteFuntionConsumer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiConsumerInterfacePractice {

    public static void main(String[] args) {


   BiConsumer<String , Integer> printMultipleTimes = (s,n) -> {
       for (int i = 0; i <n; i++) {
           System.out.println(s);
       }
   };

  printMultipleTimes.accept("Wooden Spoon", 5);


        System.out.println(" ========================================");

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",50);
        map.put("F",60);

        map.forEach((k,v) -> {
            if(v >= 30){
                System.out.println(k); // give s value for 30 and above
            }

        });
    }
}


