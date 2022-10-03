package day55_polymorphism.Animal;


public class Lizard extends Reptile{

    String skinColor;

    @Override
    public void eat() {
        System.out.println("\nLIZARD is eating");
    }
}
