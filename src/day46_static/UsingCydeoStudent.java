package day46_static;

import java.util.Arrays;

public class UsingCydeoStudent {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Samson",29);
        System.out.println(student1);

        System.out.println("\nGroup # : " + student1.groupNumber);
        System.out.println("School Name : " +CydeoStudent.schoolName);
        System.out.println("Instuctors # : " +Arrays.toString(CydeoStudent.instructors));
        System.out.println("Batch # : " +CydeoStudent.batchNumber);



    }
}
