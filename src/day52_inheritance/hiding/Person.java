package day52_inheritance.hiding;

public class Person {

    String name = "JAMES BOND";

}
 class SecretIdentity extends Person{

    String name = "DNOB SEMAJ";  // we created another name variable in the subclass, but it was already inherited so now wer are hidding the one from the parent.

 }

    class Runner{
        public static void main(String[] args) {
            Person person = new Person();
            System.out.println(person.name);

            SecretIdentity secretIdentity= new SecretIdentity();
            System.out.println(secretIdentity.name);

        }
    }