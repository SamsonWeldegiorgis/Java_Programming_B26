package day48_encapsulation2.Employee;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee = new Employee("Mike", 'M',24,150000);

        // since it is private, access using public

        // change name

        employee.setName("");
        System.out.println(employee);
        System.out.println(employee.getName());

        // change age
        employee.setAge(15);
        System.out.println(employee.getAge());

        // change salary
        employee.setSalary(100000);
        System.out.println(employee.getSalary());

        // increase the salary of emplyee +20k:
        employee.setSalary(employee.getSalary() +20000);
        System.out.println(employee.getSalary());

        // decrease the salary of emplyee +20k:
        employee.setSalary(employee.getSalary() -30000);
        System.out.println(employee.getSalary());




    }
}
