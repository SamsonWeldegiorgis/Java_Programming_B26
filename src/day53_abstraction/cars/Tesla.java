package day53_abstraction.cars;

public class Tesla extends ElectricCar{
    @Override
    public void start() {
        System.out.println("Card in the car");
        System.out.println("Press button");

    }

    @Override
    public void charge() {
        System.out.println("Charging Tesla");

    }
}
/*
The Tesla class is a sub classes of the ElectricCar class

The ElectricCar class is abstract and the Tesla is NOT abstract(non-abstract)

Normal Class(non-abstract) can NOT have abstract methods

So, we have to override any/all abstract method that were inherited


 */