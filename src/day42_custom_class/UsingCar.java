package day42_custom_class;

import javax.swing.tree.VariableHeightLayoutCache;

public class UsingCar {
    public static void main(String[] args) {

        Car vehicle = new Car();
        vehicle.model= "Toyota Rav4";
        vehicle.year = 2022;
        vehicle.color = "Grey";
        vehicle.fuelLevel=80;
        System.out.println(vehicle);

        System.out.println();
        vehicle.drive();
        vehicle.drive();
        System.out.println();

        vehicle.fillTank();
        System.out.println();

       System.out.println(vehicle.fuelLevel);
       vehicle.fillTank();
       System.out.println("Fuel is < 25 : " + vehicle.isLow());



        }


    }

