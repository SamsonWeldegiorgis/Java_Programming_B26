package day52_inheritance.Parent;

public class Cydeo {
    public static void main(String[] args) {


        Student student = new Student("Mike", 'M', 25, 1, "Cydeo");
        System.out.println(student);
        System.out.println();

        Employee employee = new Employee("Teberih", 'F', 30, "Instructor", 58, 150_000);
        System.out.println(employee);
        System.out.println();

        Tester tester = new Tester("John", 'M', 35, "Tester", 007, 180_000);
        System.out.println(tester);
        System.out.println();

        // OVERRIDEN METHODS :
        tester.attendMeeting();
        tester.work();
        tester.drink("Coffee");
        tester.eat(" Pizza");
        tester.sleep();
        System.out.println(" --------------");
        student.attendClass();
        student.drink(" Juice");
        System.out.println(" --------------");

    }
}
