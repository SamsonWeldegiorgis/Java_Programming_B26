package day52_inheritance.hiding;

public class Soccer extends Sports {

    public static void cheer(){
        System.out.println("Cheering from the Child class");
    }

    /*
    // Note:
    It looks like we are overriding but we are not, b/s the method static

    we are hidding the cheer method from parent class

     */


}

