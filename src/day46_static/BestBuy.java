package day46_static;

public class BestBuy {

    String location ; // one instant variable & 3 static members,,,,
    static String headquarters = "Richfield , Minnesota, United States";
    static String day = "Wednesday";
    static int numberOfComputer = 100;

    public BestBuy (String location){
        this.location=location;
    }


    public static void restock (){
        numberOfComputer+=20; // from the class point

    }




}
