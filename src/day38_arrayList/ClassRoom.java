package day38_arrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ClassRoom {
    public static void main(String[] args) {


        ArrayList<String> group = new ArrayList<>();
        System.out.println(group.size());
        group.add("Selo");
        group.add("Alex");
        group.add("Eda");
        group.add("Neli");

        System.out.println(group);
        System.out.println("The first student: " + group.get(0)); // neli
        System.out.println("The second student: " +group.get(1)); // neli
        System.out.println("The third student: " +group.get(2)); // neli
        System.out.println("The fourth student: " +group.get(3)); // neli
        System.out.println("Their size is : " +group.size()); // 4

        System.out.println();
        // traditionally...loop array...
        String repeat = "";
        boolean isEqual =false;
        for (int i = 0; i < group.size(); i++) {
            System.out.println("Student " + (i+1)+" " + group.get(i));
             }

        System.out.println();
        // traditionally...for each loop array...
        for(String student : group ){
            System.out.println("Student : " + student);
        }

        }

    }


