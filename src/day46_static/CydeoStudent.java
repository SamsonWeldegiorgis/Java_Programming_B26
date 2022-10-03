package day46_static;

import day42_custom_class.Coffee;

import java.util.Arrays;

public class CydeoStudent {


    public String name;                // instance variables
    public int groupNumber;

    Coffee myCoffee;  // instance of CydeoStudent

    public static int batchNumber;                // public
    public static String[] instructors;
    public static String schoolName;



    static {                      // this is static block.. you can assign & declare at the same time
        // but it is NOT recommended, we will use static block to assign
        batchNumber = 26;
        instructors = new String[]{"Nadir", "Mehmet", "Austin", "Aysun", "Saim"};
        schoolName = "Cydeo";
        printInfo();
    }

    public CydeoStudent(String name, int groupNumber) {  // constructor
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public static void printInfo(){
        System.out.println("School Name: " + schoolName);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Instructors: " + Arrays.toString(instructors));


}

    public String toString() {      // toString print
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
