package day48_encapsulation2.Pizza;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza first = new Pizza("large" ,3);
        System.out.println(first);
        // fist.numberOfToppings = 2;
        first.setNumberOfToppings(2);
        System.out.println(first);

        Pizza second = new Pizza("",-2);
//        second.setNumberOfToppings = -2;
        System.out.println(second);

        second.setSize("small");
        second.setNumberOfToppings(1);
        System.out.println(second);


    }
}
