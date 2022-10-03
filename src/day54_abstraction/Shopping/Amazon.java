package day54_abstraction.Shopping;

import java.lang.annotation.Target;

public final class Amazon extends OnLineShopping  {  //implement shipping
    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

        @Override
    public void payFoShipping(boolean b) {
        System.out.println(b ? "Pay for shipping " : "Free shipping");

    }

    @Override
    public void buyItem() {
            System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon drop location");

    }



        // Amazon is a concrete class
        // Amazon inherited from OnlineShopping class
        // Amazon is ONlineShopping
        // Amazon is a shopping
        // Amazon is a shipping


         // for any abstract we must implement
}


