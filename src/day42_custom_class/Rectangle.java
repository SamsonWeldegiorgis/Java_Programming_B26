package day42_custom_class;

import java.awt.geom.Area;

public class Rectangle {
    double base;
    double height;
    double perimeter;
    double area;



    public String toString() {
        return "Base= " + base +
                "\nHeight= " + height +
                "\nPerimeter of " +height+" & "+base+" = " + (base+base+height+height) +
                "\nArea of "+height+" & "+base+" = " + (base*height);
    }

        public void calculatePerimeter(double base,double height ){
            System.out.println("Perimeter of " +height+" & "+base+ " = " + ((2*base) + (2*height)));


        }
        public void calculateArea (double base, double height){
            System.out.println("Area of "+height+" & "+base+" = " + (base*height));

    }
}
