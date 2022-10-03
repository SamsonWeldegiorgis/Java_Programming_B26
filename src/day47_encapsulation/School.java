package day47_encapsulation;

import day46_static.CydeoStudent;
import jdk.swing.interop.SwingInterOpUtils;

public class School {
    public static void main(String[] args) {

        CydeoStudent emre = new CydeoStudent("Emre" ,5);
        System.out.println(emre);

        CydeoStudent.printInfo();
        emre.printInfo();

        System.out.println();
        System.out.println(CydeoStudent.instructors[0]);

        System.out.println();

        for(String each : CydeoStudent.instructors){
            System.out.println(each);
        }


    }
}
