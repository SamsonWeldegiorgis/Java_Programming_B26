package day42_custom_class;

public class AllPeople {
    public static void main(String[] args) {  // form obj, inst var, print

        // These are NOT valid ways to access the instance variables
//        System.out.println(Person.name);
//        System.out.println(Person.age);
//        System.out.println(Person.height);
//        System.out.println(Person.isMarried);

        Person personOne = new Person(); // creates an object of the Person(as data type) class
        Person personTwo = new Person();


        personOne.name="Samson";
        personOne.age =26;
        personOne.height=6.7;
        personOne.isMarried= true;

//        personTwo.name="Tomas";
//        personTwo.age =45;
//        personTwo.height=4.1;
//        personTwo.isMarried=false;

        System.out.println("Name: "+ personOne.name);
        System.out.println("Age: "+ personOne.age);
        System.out.println("Height: "+ personOne.height);
        System.out.println("IsMarried: "+ personOne.isMarried);




       // Printing the instance variable for PersonTwo);

        System.out.println("\nName: "+ personTwo.name);
        System.out.println("Age: "+ personTwo.age);
        System.out.println("Height: "+ personTwo.height);
        System.out.println("IsMarried: "+ personTwo.isMarried);



    }
}
