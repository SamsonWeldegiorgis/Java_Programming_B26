package day53_abstraction.excercise;

public class Running extends Exercise {

    public Running (){
        super("Running"); // calling my parent constructor ,,,child Run calling parent Exc cons.
    }

    @Override
    public void performExercise() {
        System.out.println("Running for fun, not sure who does this");

    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 5;


    }
}
