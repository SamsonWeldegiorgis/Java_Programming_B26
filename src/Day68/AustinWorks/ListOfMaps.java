package Day68.AustinWorks;

import java.util.*;

public class ListOfMaps {
    public static void main(String[] args) {

        List<Map< String, String >> employees = new ArrayList<>();

        Map<String, String > empl1Data = new LinkedHashMap<>(); // keep insertion order
        empl1Data.put("EmpID", "123");
        empl1Data.put("EmpName", "Mike");
        empl1Data.put("JobTitle", "SDET");
        empl1Data.put("Salary", "120000");


        Map<String, String > empl2Data = new HashMap<>(); // no insertion order
        empl2Data.put("EmpID", "125");
        empl2Data.put("EmpName", "Jim");
        empl2Data.put("JobTitle", "QA");
        empl2Data.put("Salary", "110000");


        Map<String, String > empl3Data = new HashMap<>();// no insertion order
        empl3Data.put("EmpID", "124");
        empl3Data.put("EmpName", "John");
        empl3Data.put("JobTitle", "SM");
        empl3Data.put("Salary", "150000");

        employees.add(empl1Data);
        employees.add(empl2Data);
        employees.add(empl3Data);

        System.out.println("All Employees : " + employees); // print the list

        // print the first emp by using list method
        System.out.println("1st Employees : " + employees.get(0));

        // Count the employees
        System.out.println("Count all Employees : " + employees.size());

        // How many data types in the 3rd method
        System.out.println("Data types in all : " + employees.get(0).size());

        // Print 1st employees employee name
        System.out.println("1st Empl Name : " + employees.get(0).get("EmpName"));

        // Print last employees salary
        System.out.println("Last Empl Salary : " + employees.get(2).get("Salary"));
        System.out.println("Last Empl Salary : " + employees.get(employees.size()-1).get("Salary"));

        // Calculate total salary of all employees
        int totalSalary = 0;
        for(Map<String, String > each : employees){
            totalSalary += Integer.parseInt(each.get("Salary"));
        }
        System.out.println("Total Salary : "  + totalSalary);







    }
}
