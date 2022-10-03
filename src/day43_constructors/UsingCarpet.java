package day43_constructors;

public class UsingCarpet {
    public static void main(String[] args) {


    Carpet carpo = new Carpet(true, 8.5,12,2.5);

        System.out.println(carpo);

        System.out.println();
        carpo.calculatePrice();
        System.out.println(carpo.totalPrice);

        System.out.println();
        carpo.isPersian=false;
        carpo.length=14;
        carpo.unitPrice=2.5;
        carpo.calculatePrice();
        System.out.println(carpo);
        System.out.println(carpo.totalPrice);

    }
}
