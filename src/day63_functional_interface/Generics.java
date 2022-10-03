package day63_functional_interface;

import day51_inheritance.shapes.Shape;

import java.util.List;

public class Generics {

    public static <T> void printEach(T [] array){
        for (T each : array){
            System.out.println(each);
        }
    }


    public static <T> void printEach(List<T> list){
        for (T each : list){
            System.out.println(each);
        }
    }

    }

