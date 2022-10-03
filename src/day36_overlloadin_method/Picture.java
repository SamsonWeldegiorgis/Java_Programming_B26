package day36_overlloadin_method;

public class Picture {

    public static void draw (){
        System.out.println("trying to draw");
    }
    public static void draw (String color){
        System.out.println("draw with: " + color);
    }
    public static void draw (String color1, String color2){
        System.out.println("drawing with color "+color1+ " and with "+color2);
    }
    public static void draw (int size){
        System.out.println("drawing with size: " + size);
    }public static void draw (int length, int length2) {
        System.out.println("drawing with size " + length + "and " + length2);// we can not make same draw with 1 parameter of int//

        // }public static void draw (int length){
//        System.out.println("drawing with size" + length);// we can not make same draw with 1 parameter of int
    }
    public static void draw(int size, String color){
        System.out.println("size first , then color"); }

    public static void draw (String man, int size) {
        System.out.println("color with size " );
    }




}
