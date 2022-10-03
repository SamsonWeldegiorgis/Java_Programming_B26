package day40_arrayList_more;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println(shoppingList.isEmpty() ? "shopping list Empty" : "You have some items");

        String keepAsking ;

        do {
            System.out.println("Enter the item");
            shoppingList.add(input.nextLine());
            System.out.println("DO you want to continue?y/n");
             keepAsking= input.nextLine().toLowerCase();

        }while (keepAsking.equals("yes") || keepAsking.equals("y"));
        System.out.println("Shopping List :" + shoppingList.size() + " items");
        for (String each : shoppingList){
            System.out.println("*\t" + each);
        }
        System.out.println("-----------------------------------------------");
        System.out.println(shoppingList.contains("water") ? "Water on List" : "No water on the list");
        System.out.println("Do you want to remove any items? : Yes/no");
        if(input.nextLine().equals("yes")){
            System.out.println("What item do you want to remove?:");

            String removeItem = input.nextLine(); // either be an item name or item number

            if(Character.isDigit(removeItem.charAt(0))){ // checks 1st character of remove item , by number
                int number = Integer.parseInt(removeItem);  // convert string into int
                shoppingList.remove(number-1); // converts the number into index,,,,,1 for 1st( remove index1-1=0 )

            } else {
                shoppingList.remove(removeItem);
            }
        }
        System.out.println("Final list: " + shoppingList);

    }
}
