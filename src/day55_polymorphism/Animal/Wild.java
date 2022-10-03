package day55_polymorphism.Animal;

import day24_loopExample2.Anagram;

public class Wild {

    public static void main(String[] args) {

        // all possible reference/object of lizard
        // itself

        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name ="Lizard";
        lizard.numberOfClaws =10;
        lizard.skinColor="camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);

        // super class - reptile
        Reptile reptile = new Lizard();
        reptile.eat();

        // super class - animal
        Animal animal = new Lizard();
        animal.eat();
//        animal.numberOfClaws =10; // // Animal reference does NOT have access to number of claws variable
//        animal.skinColor="camo";   // Reptile reference does NOT have access to skincolor variable
        System.out.println(animal.name);
//        System.out.println(animal.numberOfClaws);  // Animal reference does NOT have access to number of claws variable
//        System.out.println(animal.skinColor);  // Animal reference does NOT have access to skincolor variable
        System.out.println();


        Reptile reptile1 = new Lizard();
        reptile1.eat();
        reptile1.name ="Lizard";
        reptile1.numberOfClaws =10;
//        reptile1.skinColor="camo";   // Reptile reference does NOT have access to skincolor variable
        System.out.println(reptile1.name);
        System.out.println(reptile1.numberOfClaws);
//        System.out.println(reptile1.skinColor);  // Reptile reference does NOT have access to skincolor variable
        System.out.println();

        /*

            We made 3 Lizard objects with 3 different references:
            Lizard (itself), Reptile (super class), Animal (super class)

            but when it comes to execution, the object implementation is run


         */






    }

}
