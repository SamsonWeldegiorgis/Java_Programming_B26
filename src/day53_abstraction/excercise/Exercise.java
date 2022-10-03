package day53_abstraction.excercise;

public abstract class Exercise {

    final String name;   // Final = can NOT change the value

    public Exercise (String name){
        this.name=name;   // constractor making name
    }

    public abstract void performExercise();

    public abstract int getCaloriesBurned(int minutes);

}
