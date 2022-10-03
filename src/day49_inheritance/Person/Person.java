package day49_inheritance.Person;

public class Person {
    /*
    Person is the Super class
            Variables : name, age, favourite hobby,
            Method : talk ()
    Student class is the sub class of Person
            Variabes : funLevel
            Method : study () ...int
     */

    String name;
    int age;
    String favouriteHobby;

    public void talk(){
        System.out.println(name + " is talking");

    }
    public void getAge(){
        System.out.println(name + " is " + age +" years old");
    }
    public void getHobby(){
        System.out.println(name + " likes cricket");
    }
}
