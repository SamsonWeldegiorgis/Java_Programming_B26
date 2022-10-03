package day49_inheritance.Employee;

public class Tester extends Employee {
    /*

    - Tester class inherits Employee class

    - create additional variables:
        bugs found

    - create method:
        test()
            Example output: prints Running the regression
     */

    String bugsFound;

    public void test(){
        System.out.println(bugsFound + " is runnig the regression");
    }

}
