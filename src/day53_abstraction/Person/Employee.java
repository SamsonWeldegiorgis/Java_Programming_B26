package day53_abstraction.Person;

public abstract class Employee extends Person {

    String jobTitle;
    double salary;

    @Override
    public abstract void hobby();

    public abstract void work();


    public abstract int hoursWorked(int minutes);


    @Override
    public String toString() {
        return "jobTitle" + jobTitle +
                "Salary: " + salary;

    }
}