package day42_custom_class;

import javax.swing.*;

public class Animal {
    String species;
    long population;

    public String toString() {
        String print = "Species: " + species;
        print+="\nPopulation: " + population;
        return print;
    }

}
/*
Animal bear = new Animal ();
bear.popul = 15_451;
 */