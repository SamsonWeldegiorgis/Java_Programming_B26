package day54_abstraction.Shopping;

public abstract class OnLineShopping extends Shopping implements Shipping {


    public abstract void viewCart();

    /*
     We use abstract in this class because :
         *  we do NOT need for implementation ( hiding )
         *  Add new abstract method


         - Shopping is the parent of OnLineShopping class ( Inhertiting )
         - Interface Shipping is implementing/sharing to OnLineShopping (Interface )
     */




    }

