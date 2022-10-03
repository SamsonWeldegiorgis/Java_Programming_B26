package day38_arrayList;

import java.util.ArrayList;

public class ClassRoom2 {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("Ziba");
        System.out.println(group);

        group.add(0, "Victor"); // moving indexx
        System.out.println(group);

        group.add(0, "Moses"); // moving indexx
        System.out.println(group);
        System.out.println(group.get(2)); // Ziba

        group.add("Ozi"); // moving indexx
        System.out.println(group);

        group.add(1,"James");
        System.out.println(group);
        System.out.println(group.add("Emre"));
        System.out.println(group);
        System.out.println(group.contains("James"));
        System.out.println();

        System.out.println(group.get(5));

        }

    }

