
package day53_abstraction.Person;

public class Chef extends Employee{

    @Override
    public void hobby() {

    }

    @Override
    public void work() {

    }

    @Override
    public int hoursWorked(int minutes) {
        return minutes * 5;
    }
}
