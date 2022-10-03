package day47_encapsulation;

public class ComputerLab {
    public static void main(String[] args) {

        System.out.println("Hello World");
        Computer computer1 = new Computer("Dell", 1200,"Red");

        Computer.hasBattery =false;
        System.out.println(computer1);
        System.out.println("hasBattery : " + Computer.hasBattery);// you can access static members from
        // an object reference b/s the obj comes from the class, but in general you want
        // to access static members by the class name.

    //    System.out.println(Computer.brand); //this is impossible b/s brand is the instance variable and we're trying to access by the class name, but we need an object
        System.out.println("Computer brand : " + computer1.brand);


    }
}
