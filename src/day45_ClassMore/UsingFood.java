package day45_ClassMore;

import java.util.Arrays;

public class UsingFood {
    public static void main(String[] args) {
        Food apples = new Food("Apples");
        System.out.println(apples);

        Food chips = new Food("Lays",2);
        System.out.println(chips);

        chips.unitPrice=1.99;
        chips.calculatePrice();
        System.out.println("Chips: " + chips);

        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);

        apples.quantity= 10;
        apples.unitPrice= 1.50;
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println("Apples Total Price: " + apples.totalPrice);
        System.out.println("----------------------");

        String [] str = { "one","two","three"};
        Food [] allFood = {apples, chips,chicken,null}; //=new Food[4]
        System.out.println("Mentioned food: " + allFood[2]);

        allFood[3]= new Food("Fish",4, 3.55);// making a new Food object assigning it into the array in index 3.

        System.out.println("All food : " + Arrays.toString(allFood));

        // calculate the total price of the shopping list
        System.out.println(" -----------");
        double totalPriceAll = 0;

        for (Food each : allFood){ // each == allFood[i]..each is every element of the obj
            System.out.println(each);
            totalPriceAll+=each.totalPrice;

        }
        System.out.println("Total price of all : " + totalPriceAll);

    }
}
