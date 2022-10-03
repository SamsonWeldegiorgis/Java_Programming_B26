package day63_functional_interface;

import day51_inheritance.shapes.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class UsingGeneric {
    public static void main(String[] args) {

        Integer [] numbers = {1,2,3,4,5,6};
        Double [] decimals  = {1.5,2.5,3.5,4.5,5.5,6.5};
        String [] names = {"Java", "Selenium", "SQL", "API"};
        Shape [] shape ={null, null};

        Generics.printEach(numbers);
        Generics.printEach(decimals);
        Generics.printEach(names);
        Generics.printEach(shape);

        System.out.println(" ----------------------------");

        ArrayList<Integer> scores= new ArrayList<>(Arrays.asList(15,20,30,40,50));
        ArrayList<Double> scores1= new ArrayList<>(Arrays.asList(15.5,20.5,30.5,40.2,50.6));
        Generics.printEach(scores);
        Generics.printEach(scores1);
    }
}
