package day55_polymorphism.Animal;

public class Reptile extends Animal{

    int numberOfClaws;

    @Override
    public void eat() {
        System.out.println("REPTILE is eating");
    }
}
