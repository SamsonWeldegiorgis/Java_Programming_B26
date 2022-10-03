package day52_inheritance.Parent;

public final class Tester extends Employee {


    public Tester(String name, char gender, int age, String jobTitle, int employeeID, double salary) {
        super(name, gender, age, jobTitle, employeeID, salary);


    }


    public void work() {
        System.out.println(getName() + " is working");
    }

    public void attendMeeting() {
        System.out.println(getJobTitle()+ " " + getName() + " is attending Meetting");


    }

    @Override
    public void drink (String beverage) {
        System.out.println(getJobTitle() +" "+ getName() + " is drinking " + beverage);

    }


}
