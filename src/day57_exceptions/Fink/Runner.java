package day57_exceptions.Fink;

public class Runner {
    public static void main(String[] args) {
        /*


    create an object of the Pen and try to call both methods.
     Handle any Exceptions you need to

OutOfInkException
         */


        // First case is valid case :

        Pen pen1 = new Pen();
        pen1.inklevel = 100;
        pen1.inkColor = "red";

        pen1.write();// unchecked exception out occur

        try {
            pen1.changeColor("blue");// checked exception is thrown,so it must be handled, even if a valid value is given
        } catch (InvalidcolorException e) {

            System.out.println(e.getMessage());

            // second case is the invalid cases, comment the different methods to see both results

            Pen pen2 = new Pen();
            pen2.inklevel = 0;
            pen2.inkColor = "red";

            try {
                pen2.changeColor("green"); //checked exception is thrown , so it must be handled , even if a valid value is given
            } catch (InvalidcolorException g) {
                System.out.println(g.getMessage());
            }


        }
    }}
