package day53_abstraction.Person;

public class Restaurant {
    public static void main(String[] args) {


        Chef chef1 = new Chef();
        System.out.println("\nHours worked : " + chef1.hoursWorked(15));
        chef1.hobby();
        chef1.work();
        System.out.println();

        Tester tester1 = new Tester();
        tester1.hobby();
        tester1.work();
        System.out.println();

        chef1.name = "Jacob";
        chef1.jobTitle = "Manager";
        chef1.salary = 100_000;
        System.out.println(chef1.name);
        System.out.println(chef1.jobTitle);
        System.out.println(chef1.salary);
        System.out.println();

        tester1.name = "James";
        tester1.jobTitle = "Inspector";
        tester1.salary = 1_200_000;
        System.out.println(tester1.name);
        System.out.println(tester1.jobTitle);
        System.out.println(tester1.salary);


//        Employee employee1 = new Employee();
    }
}




