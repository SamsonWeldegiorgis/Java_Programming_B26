package day57_exceptions.Fink;

import day57_exceptions.Bank.NotEnoughMoneyException;

public class Pen {


    int inklevel;
    String inkColor;
//    String color;

    /*
         ink should be more than or equal to 10
                if there is not enough ink throw the OutOfInkException

                if there is enough ink:

                    print: "Writing with pen, 10 ink used"
                    subtract 10 from the inkLevel variables
     */


    public void write() {


        if (inklevel < 10) {
            throw new OutOfInkException("Ink Below 10%");
        }
            System.out.println("Writing with pen, 10% ink used");
            inklevel -= 10;

    }
        public void changeColor(String color) throws InvalidcolorException {
            if(color.equals("black") || (color.equals("red") || (color.equals("blue")))) {
                this.inkColor= color;
            }else{
                throw new InvalidcolorException(color + " is not a valid color");
    }

        /*
          create an instance method changeColor(String color)

        check if the given parameter of color is either black, red, or blue

            if it is not any of the specified colors throw the InvalidColorException

            if the color is valid assign it to the inkColor variable

    Note: as the creator of this method you should not have a try catch in it
         */





        }

}

