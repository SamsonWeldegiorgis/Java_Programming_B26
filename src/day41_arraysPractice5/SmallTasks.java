package day41_arraysPractice5;

import day30_arraysForEach.AnagramArray;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallTasks {
    public static void main(String[] args) {



    /*
     write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];
     */

        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(num);
        num.set(4, 4); // #5 or index 4 ..by 4
        System.out.println("Set:" + num);
        num.set(num.size() - 1, 0); // the last with 0
        System.out.println("Set:" + num);


        System.out.println(" -----------------------");

        /*
         write a program that can swap the first and last elements of an ArrayList
         */
        Collections.swap(num, 0, num.size() - 1);
        System.out.println("Swapped:" + num); // the 1st and the last


        System.out.println(" ----------------------------------");

        /*
        write a program that can multiply each odd number by 2
                        ex: list = [1,2,3,4,5];
                            output: [2,2,6,4,10]
         */

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 1) {  // it is ODD
                num.set(i, num.get(i) * 2);
            }
        }
        System.out.println("Multipliedby 2: " + num);

        System.out.println(" ---------String----------------------------");
        /*
        write a program that can combine two String arrays into one arrayList
                        ex:
                            arr1 = {"A", "B", "C"};
                            arr2 = {"D", "E", "F", "G"};
                            list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> result = new ArrayList<>();
        result.addAll(Arrays.asList(arr1));
        System.out.println(result);
        result.addAll(Arrays.asList(arr2));
        System.out.println(result);

        System.out.println(" -----------Characters----------------------------------");
        // need to do it one by one,,,,,autoboxing

        char[] carr1 = {'A', 'B', 'C'};
        char[] carr2 = {'D', 'E', 'F', 'G'};

        ArrayList<Character> charresult = new ArrayList<>(); //convert to wrapper class
        for (char eachChar : carr1)
            charresult.add(eachChar);
        System.out.println(charresult);
        for (char eachChar : carr2)
            charresult.add(eachChar);
        System.out.println(charresult);

        System.out.println(" -----------------------------------------------");
           /*
           write a program that can return the nth largest number from an arraylist
                    			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
                    			n = 5
                    			output:
                    				4
            */

        ArrayList<Integer> numb = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8));
        int n = 3; // 3rd largest,,,,
        System.out.println(NthMax(numb, n)); //  the 3rd largest is 6 after 8 & 7

        System.out.println(" =======================================");

        System.out.println(lovelyNumber(0));   // ---returns 1
        System.out.println(lovelyNumber(100));// ---returns 1
        System.out.println(lovelyNumber(111));// --returns 0
        System.out.println(lovelyNumber(1232));   // ---returns 1
        System.out.println(lovelyNumber(9922));// ---returns 1
        System.out.println(lovelyNumber(99911));// --returns 0

    }


    public static int NthMax(ArrayList<Integer> numbers, int n) {
        for (int i = 1; i < n; i++) {
            numbers.removeIf(each -> Collections.max(numbers) == each);

        }
        return Collections.max(numbers);

    }
    ////////////////////////////////////////////

        /*
                     We consider a number to be lovely if it contains fewer than
               three instances of any distinct digit (in decimal representation).

                    Examples of lovely numbers: 0, 100, 1232 and 9922;
                    Examples of numbers that are not lovely:
                               1000 (contains three copies of digit '0'),
                               33533 (contains four copies of digit '3').

                       Examples:
                       lovelyNumber(0)    ---returns 1
                       lovelyNumber(100)  ---returns 1
                       lovelyNumber(111)  ---returns 0
                       lovelyNumber(1232) ---returns 1
                       lovelyNumber(9922) ---returns 1
                       lovelyNumber(99922)---returns 0

                       In your solution, focus on correctness. The performance of your
                       solution will not be the focus of the assessment.
         */



    public static int lovelyNumber(int num){

//        String [] split = (num+"").split("");  this or the third one we can use...
        // we dont use chararray,,,,it returns primitive

        String [] split = String.valueOf(num).split("");// 100 will be 1 0 0 ,,,,splitted

        ArrayList<String> list = new ArrayList<>(Arrays.asList(split));
        for (String each : list){
            if (Collections.frequency(list, each) >=3){
                return 0;
            }

        }
            return 1;


    }




}

