package day62_enum;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class UsingDay {

    public static void main(String[] args) {


        Day day = Day.MONDAY;
        System.out.println(day);

        Day [] days = Day.values();
        System.out.print(Arrays.toString(days));


        System.out.println(" -------------------------------------");

        switch (day){
            case MONDAY:
                System.out.println("Today is Monday");

            case TUESDAY:
                System.out.println("Today is Tuesday");

            case WEDNESDAY:
                System.out.println("Today is Wednesday");

            case THURSDAY:
                System.out.println("Today is Thurday");

            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Today is Sunday");
        }
    }
}
