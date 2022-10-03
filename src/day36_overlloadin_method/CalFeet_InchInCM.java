package day36_overlloadin_method;

public class CalFeet_InchInCM {


    /*
    Calculate feet and inch in centimeter
     */


    public static void main(String[] args) {
        System.out.println(calcFeetAndIncToCentmtr(5,10)); // 177.80

        System.out.println(calcFeetAndIncToCentmtr(70)); // 177.80
    }
    public static double calcFeetAndIncToCentmtr(double feet, double inches){

        if (feet < 0 || inches < 0 || inches >12){
            return -1;
        }
        double cm = ((feet * 12) + inches) * 2.54 ; //  return= ((feet * 12) + inches) * 2.54

        return cm;
    }
    public static double calcFeetAndIncToCentmtr(double inches){

        if (inches < 0){
            return -1;
        }
        double feet = (int) inches/12;  // 5
        double remainingInches = inches %12 ;  // 10

        double cm= calcFeetAndIncToCentmtr(feet , remainingInches);

        return cm;
    }

}
