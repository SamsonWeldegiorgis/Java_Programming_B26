package day64_BiPredicteFuntionConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, Integer> printNTimes = (str, n) -> {

            for (int i = 0; i < n; i++) {
                System.out.print(str + " ");
            }
            System.out.println();

        };
        printNTimes.accept("java", 3);
        printNTimes.accept("Selenium", 5);

        System.out.println(" ==========================================");

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 10); //3 = 4
        map.put("Two", 2); // 3 = 5
        map.put("Three", 3); // 3 = 6

//       forEach() is a method defined in the map interface which allows you to define the Biconsumer implementation you want to execute with the keys and values. Internally it uses for each loop to iterate thru the entry set..
        map.forEach((key, value) -> {
            System.out.println(key + " " + value);  // print both....
        });

        map.forEach((key, value) -> {
            System.out.println(value + key.length()); //
        });

        System.out.println(" ==========================================");

        map.forEach((k, v) -> {
            if (v >= 3) {
                System.out.println(k); // give s value for 30 and above
            }
        });
    }}