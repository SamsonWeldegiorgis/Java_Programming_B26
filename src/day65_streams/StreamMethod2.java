package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod2 {
    public static void main(String[] args) {

        // map method : change every element from the stream, based on a lambda expression.........
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> byTwo = list.stream().map(e -> e * 2).collect(Collectors.toList());
        System.out.println("Orginal : " + list);
        System.out.println("Orgnl x2 : " + byTwo);  // multiplied by 2

        System.out.println(" ----------------------------");
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        List<String> abbrv1 = days.stream().map(p -> p.substring(0, 3)).collect(Collectors.toList());
        System.out.println("Orignal days : " + days);
        System.out.println("OriAbbrevted : " + abbrv1);


        System.out.println(" ----------------------------");
        // filter
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10,2,2,4));
        List<Integer> evens = list2.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        List<Integer> odds = list2.stream().filter(p -> p % 2 == 1).collect(Collectors.toList());
        System.out.println("Orignal # : " + list2);
        System.out.println("evens # : " + evens);
        System.out.println("Odds  #: " + odds);
        System.out.println("countOdds : " + list2.stream().filter(p -> p % 2 == 0).count());// counter
        System.out.println("countEvens # : " + list2.stream().filter(p -> p % 2 == 1).count());// counter
        System.out.println("UniqueofEvens # : " + list2.stream().filter(p -> p % 2 == 0).distinct().count()); // finding how many evens
        System.out.println("UniqueofEvens## # : " + list2.stream().filter(p -> p % 2 == 0).distinct().collect(Collectors.toList())); // finding how many evens

        System.out.println(" ----------------------------");
        List<String> strs = new ArrayList<>(Arrays.asList("Java", "Javascript", "selenium", "cypress", "java", "hello world", "JAVA"));


        long java = strs.stream().filter(p -> {
              p = p.toLowerCase();
              return p.contains("java");
        } ).count();
        System.out.println("Count java : "  + java);
        System.out.println("Count java : "  + strs.stream().filter(p -> p.toLowerCase().contains("java")).collect(Collectors.toList()));


        System.out.println(" ---------for Each-------------------");
        // forEach
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10,2,2,4));
        list3.stream().filter(p -> p % 2 ==0 ).forEach(e-> System.out.print(e)); // no return in this Consumer
        list3.stream().filter(p -> p % 2 ==0 ).forEach(System.out::println) ;

        /*
        .stream () creating a stream from my arrayList...........
        .filter () only keeping all the even numbers in stream....
        .forEach () do an action by on the lambda expression......

        lines 52 and 53 are the same
        */


        System.out.println(" ---------------------------------");
        // forEach
        List<Integer> list4 = new ArrayList<>(Arrays.asList(15,10,20,25,15, 8));
        System.out.println("Divisible by 5 : " + list4.stream().allMatch(p -> p % 5 ==0)) ;
        System.out.println("Even : " + list4.stream().allMatch(p -> p % 2 ==0)) ;
        System.out.println("More than 30 : " + list4.stream().allMatch(p -> p > 30));
        System.out.println("More than 20 : " + list4.stream().allMatch(p -> p > 20)); // all match

        System.out.println("More than 30 : " + list4.stream().noneMatch(p -> p > 30)); // none match




    }

}
