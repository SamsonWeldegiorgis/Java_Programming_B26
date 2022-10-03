package day54_abstraction.animal;

import day54_abstraction.language.Language;

public final class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Parrot wobble to the seeds");

        // Parrot is a concrete class b/s it is non abstract class
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");

    }

    @Override
    public void hi() {
        System.out.println("Hello Hello");
    }

    @Override
    public void bye() {
        System.out.println("Bye Bye");

    }
}
