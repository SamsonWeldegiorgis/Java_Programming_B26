package day55_polymorphism.cloths;

public class Store {
    public static void main(String[] args) {

        // All possible objects of Tshirt

        TShirt tShirt1 = new TShirt(); // reference of itself
        tShirt1.wear();

        Clothes tshirt2 = new TShirt(); // reference of parent
        tshirt2.wear();

        Object tshirt3 = new TShirt();
//        tshirt3.wear();   Object class does NOT have reference to the wear () method

//        HasHood tshirt4 = new TShirt(); NO relation b/n HasHood & Tshirt, Tshirt class does NOT implment HasHood interface...

        Jacket jacket1 = new Jacket();  // reference of itself
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket(); // reference of the super class
        jacket2.wear();
//        jacket2.putOnHood();  Clothes referen e does NOT have access to a putOnHood()


        Object jacket3 = new Jacket(); // reference of the super class
//        jacket3.wear();  Object class does not have reference to wear() methods
//        jacket2.putOnHood();  Clothes referen e does NOT have access to a putOnHood()

        HasHood jacket4 = new Jacket();
//        jacket4.wear();  // HasHood reference does NOT have visibility to wear() method
        jacket4.putOnHood();

        System.out.println();

        buy(tShirt1);
        buy(jacket1);
        buy (new TShirt());
        buy (new Jacket());


    }

    public static void buy(Clothes clothes) {  // we can use Jacket or Tshir, b's all are subclasses of Clothes
        if(clothes instanceof TShirt) {   // instance of object of class
            System.out.println("Bought Tshirt");

        }else if(clothes instanceof Jacket){
            System.out.println("Bought a cool Jacket");
        }

}
//    public static void buy(Jacket jacket){
//
//    }

//    public static void buy(TShirt tShirt){
//
//    }






}
