package day49_inheritance.Person;

public class Building {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.name= "James Bond";
        obj.age = 40;
        obj.favouriteHobby= "spy stuff";
        obj.talk();
        obj.getAge();
        obj.getHobby();
        //obj.study() : this was made in the child/student class

        Student obj2 = new Student();
        obj2.name= "George";
        obj2.age = 21;
        obj2.favouriteHobby="drawing";
        obj2.talk();
        obj2.getAge();
        obj2.getHobby();

        // those above variables were inherited from the Person class

        obj2.funLevel = 100;
        obj2.study();

       }
}
