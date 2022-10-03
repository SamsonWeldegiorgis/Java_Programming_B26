package day43_constructors;

public class Carpet {


    boolean isPersian;
    double width;
    double length;
    double unitPrice;
    double totalPrice;


    @Override
    public String toString() {
        return "\n" + (isPersian ? "The Persian Carpet" : "The carpet") +
                "\nhas dimenstions of : " + length + " x " + width +
                "\nThe Unit Price is : " + unitPrice +
                "\nThe Total Price is : $" + totalPrice;

    }


    public Carpet (boolean inputPersian, double inputWidth, double inputLength, double inputUnitPrice) {

        width = inputWidth;
        length = inputLength;
        isPersian = inputPersian;
        unitPrice = inputUnitPrice;
        calculatePrice();


    }


    public void calculatePrice() {
        totalPrice = width * length * unitPrice;

        if (isPersian) {
            totalPrice += 200;
        }
    }
}