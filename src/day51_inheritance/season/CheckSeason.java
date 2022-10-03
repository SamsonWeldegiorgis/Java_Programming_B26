package day51_inheritance.season;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

public class CheckSeason {
    public static void main(String[] args) {


        Summer person1 = new Summer("Tomas", 15.5, 60.2);
        System.out.println(person1);
        person1.activity();
        System.out.println();

        Spring person2= new Spring("James",55.04,15.95);
        System.out.println(person2);
        person2.activity();
        System.out.println();

        Winter person3 = new Winter("Roda",45.1,67.80);
        System.out.println(person3);
        person3.activity();
        System.out.println();

        Fall person4 = new Fall("Hagos",50.4,94.11);
        System.out.println(person4);
        person4.activity();



    }
}