package day49_inheritance.Employee;

import java.util.WeakHashMap;

public class ObjectClass {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Tomas";
        employee1.isFullTime=true;
        employee1.salary = 100_000;
        employee1.work();
        employee1.setFullTime();
        employee1.setSalary();
        System.out.println(" -----------------");

        Tester tester1 = new Tester();
        tester1.bugsFound="Jenkin";
        tester1.test();
        System.out.println(" -----------------");

        Developer developer1 = new Developer();
        developer1.featuresCreated="Master";
        developer1.develop();



    }
}
