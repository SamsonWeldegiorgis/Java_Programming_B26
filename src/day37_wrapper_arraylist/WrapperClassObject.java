package day37_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {

        int a = 5;
       // what can we do with this : assign/reassign, math, casting
        // what can't we do : a.method();

        Integer a2 = new Integer(10);
        Integer a3 = 20; // autoboxing = primitive > object
        int a4 = a3; // unboxing = object - primitive

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        System.out.println(" -----------------");

        byte b = 2; // byte/primitive type..
        Byte b2 = 20; // wrapper class
        byte b3 = b;

        System.out.println(b);
        System.out.println(b2);
        System.out.println(b3);

    }
}
