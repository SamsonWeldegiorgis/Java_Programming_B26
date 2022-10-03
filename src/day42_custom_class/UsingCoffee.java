package day42_custom_class;

public class UsingCoffee {
    public static void main(String[] args) {

        Coffee cofMed = new Coffee();
        cofMed.name = "Starbuck Coffee";
        cofMed.types = "Cappucino";
        cofMed.price = 5.77;
        cofMed.size = 16;
        System.out.println(cofMed);
        System.out.println();



        cofMed.drink();

        cofMed.refill(8);

        System.out.println(cofMed);


//        Coffee cofBig = new Coffee();
//        cofBig.name= "Starbuck Coffee";
//        cofBig.types = "Frappuccion";
//        cofBig.price = 10.77;
//        cofBig.size = 20;
//        System.out.println(cofBig);


    }
}
