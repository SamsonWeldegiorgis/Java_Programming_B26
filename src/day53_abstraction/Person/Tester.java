package day53_abstraction.Person;

public class Tester extends Employee{


    @Override
    public int hoursWorked(int minutes) {
        return 0;
    }

    @Override
    public void hobby() {
        System.out.println("Your own hobbies");


    }
    @Override
    public void work(){
        System.out.println("Running test cases ");
    }


}
