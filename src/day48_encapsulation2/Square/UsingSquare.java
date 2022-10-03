package day48_encapsulation2.Square;

public class UsingSquare {
    public static void main(String[] args) {

        Square obj = new Square(5);  //  Perimeter = 4*5 = 20
        System.out.println(obj);     // Area = 5*5 = 25

//        obj.side = 11;  // can't change the value like this b'se it has private access

        obj.setSide(11);
        System.out.println(obj.getSide());

        System.out.println(obj);

    }
}
