package day49_inheritance.Employee;

public class Employee {
    /*
    - create variables:
        name, is full time, salary
    - create method:
        work()
            Example output: prints $name is working
     */
    String name;
    boolean isFullTime;
    double salary;

    public void work() {
        System.out.println(name + " is working.");

    }
    public void setFullTime () {

        System.out.println("IsFullTime : " + isFullTime);
    }
    public void setSalary(){

        System.out.println("Salary :" +  salary );

    }

}
