package day54_abstraction.Shopping;

public class UsingOnLine {
    public static void main(String[] args) {

        Target target = new Target();
        target.price=10;
        System.out.println("Target price: " + target.price);
        target.buyItem();
        target.returnItem();
//      target.payForShipping(true); // does NOT work, b/s Target class does NOT implement the Shipping Interface

        System.out.println();

        Amazon amazon= new Amazon();
        amazon.price=1000;
        System.out.println("Amazon price: " + amazon.price);
        amazon.buyItem();
        amazon.returnItem();
        amazon.payFoShipping(true);
        amazon.viewCart();
        System.out.println(amazon.country);
        System.out.println(Shipping.country); // proper way to access static information in the interface


//        Ebay ebay = new Ebay();
//        ebay.buyItem();
//        ebay.returnItem();
//        ebay.upLoadProduct();
//        ebay.payFoShipping(true);
//        ebay.viewCart();
//        System.out.println();






    }
}
