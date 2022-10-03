package day44_Constructor2;

public class UsingEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Samson",15,"Manager",120_000);
        System.out.println(employee1);


        Employee employee2 = new Employee("James", "Secret Agent");
        System.out.println(employee2);

        Employee employee3 = new Employee("Eman", 25, "SDET", 50_000);
        System.out.println(employee3);


        Employee employee4= new Employee("Lucy",18,"Developer", 150_000);
        System.out.println(employee4);

        Employee employee5 = new Employee("Frank", 45, "QA", 90_000);
        System.out.println(employee5);

        Employee employee6 = new Employee("Ted", 6, "Auto Eng.", 105_000);
        System.out.println(employee6);
        System.out.println();






        employee1.goToMeeting();
        employee2.goToMeeting();
        employee3.goToMeeting();






    }
}
