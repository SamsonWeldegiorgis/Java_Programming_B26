package day63_functional_interface;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {



    /*
    Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
     */

        Map<String, Double> map = new HashMap<>();  // we use HashMap for implementation
        map.put("James", 70000.0);
        map.put("Jane", 124000.0);
        map.put("Anna", 144000.15);
        map.put("George", 422512.23);
        map.put("Elza", 1231214.1);
        map.put("Peter", 231234.0);


        String nameofLargest = "";
        double maxSalary = 0.0;  // double.MIN_VALUE ........b/s we don't have -ve values we don't use it ,,

        String nameOfLowest = "";
        double minSalary = Double.MAX_VALUE; // the biggest possible double value is a good starting value

        for(String key : map.keySet()) { // making each element...

            double value = map.get(key);

            if (value > maxSalary) {
                nameofLargest = key;
                maxSalary = value;
            }

            if(value < minSalary){
                nameOfLowest =key;
                minSalary = value;
            }
        }


        System.out.println("Name of Largest : " +nameofLargest+ " - $ "+maxSalary);
        System.out.println("Name of Lowest : " +nameOfLowest+ " - $ "+minSalary);

        System.out.println(" ---------------------------------------------");

        int counter = 0;
        String names = "";
        for(double value : map.values()){
            if(value >=120_000 && value <=150_000){
                counter++;



            }
        }
        System.out.println("Number over 120K & less than150K : " + counter);
        System.out.println("Number over 120K & less than150K : " + names);// ???????
        System.out.println();

        int counteerr=0;

          for(String name : map.keySet()){

            if(map.get(name) <=118_000){
                 counteerr++;
                System.out.println("Name getting 118k : " + name);
                System.out.println("Name getting 118k : " + counteerr);
            }
        }
        System.out.println(" -----------------------------------------");

        for(String key : map.keySet()){
            map.put(key,map.get(key) + 10_000);

        }
        System.out.println("10k added to each : " + map);
    }
}