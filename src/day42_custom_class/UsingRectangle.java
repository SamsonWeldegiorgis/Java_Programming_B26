package day42_custom_class;

public class UsingRectangle {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        rect.base = 4;
        rect.height=2.5;


        System.out.println(rect);

        rect.calculatePerimeter(5,4.5);

        rect.calculateArea(3.5,7);

//        System.out.println(rect);



    }
}
