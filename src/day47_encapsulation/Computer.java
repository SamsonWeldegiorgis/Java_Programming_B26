package day47_encapsulation;

import day43_constructors.Marker;

public class Computer {
    /*
      Computer - static        class name : computer    instance variables : price , brand, color.....
      static variables : hasScreen, hasBattery, hasMemory
      Make obj of the class in a main method and access both instance and static members from proper preference
     */

    String brand;                                                    // instance variables
    double price;
    String color;

    static boolean hasScreen;                                        // static variables
    static boolean hasBattery;
    static boolean hasMemory;

    static {                                                         // static block
        System.out.println("STATIC BLOCK -----Run");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;


    }

    public Computer(String brand, double price, String color) {      // constructor ,,,,,generated from intelliJ
        System.out.println("CONSTRUCTOR -----Run");
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
