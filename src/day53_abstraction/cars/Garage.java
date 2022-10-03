package day53_abstraction.cars;

public class Garage {
    public static void main(String[] args) {

//        Car obj1 = new Car(); // Car is abstract, so we can NOT make an object of this class

        Toyota obj2=new Toyota();
        obj2.start();

        System.out.println();

        Honda obj3 = new Honda();
        obj3.start();


        // Both Toyota & Honda were concrete classes, b/s they were NOT absract , so we had to implement the start method

//        ElectricCar obj4 = new ElectricCar();// ElectriCar is abstract, so we can NOt create an boject of this class
        System.out.println();

        Tesla obj5= new Tesla();
        obj5.start(); // defined in the Car Class
        obj5.charge(); // defined in the EldectriCar class

        // Tesla was a non-abstract class, so it was concrete, which mean it had to override all the abstract methods from the super classes


    }
}
