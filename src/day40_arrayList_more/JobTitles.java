package day40_arrayList_more;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {

        ArrayList<String> jobs = new ArrayList<>();  // addAll
        jobs.addAll(Arrays.asList("SDET","Developer","Deve op", "PO", "QA", "CEO", "BA","chef", "Doctor" , "Police officer", "PO"));
        System.out.println("jobs : " +  jobs);


        System.out.println(" ---------------------------------");// removeAll
        ArrayList<String > jobs1 = new ArrayList<>(jobs);
        jobs1.removeAll(Arrays.asList("PO", "QA", "BA", "CEO"));
        System.out.println("jobs1 : " +  jobs1);

//        jobs1.remove(Arrays.asList("CEO", "PO"));
        System.out.println("jobs1CEORmvd : " +  jobs1);



        System.out.println(" -------------------------------"); // retainAll
        ArrayList<String> jobs2 = new ArrayList<>(jobs);
        jobs2.retainAll(Arrays.asList("SDET", "Developer", "Dev op"));
        System.out.println("jobs2 : " +  jobs2);

        System.out.println("---------------------------------"); //containsAll
        ArrayList<String> jobs3 = new ArrayList<>(jobs);
        System.out.println(jobs3.containsAll(Arrays.asList("chef", "CEO")));// true
        System.out.println(jobs3.containsAll(Arrays.asList("Doctor", "Nurse"))); // false
        System.out.println(jobs3.contains(Arrays.asList("CEO"))); // false





    }
}
