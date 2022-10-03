package day54_abstraction.creating;

public class Runner {
    public static void main(String[] args) {

         // Create obj = new Create(); can NOT make objectes of interfaces

        Book obj = new Book(); // Book is a normal(non-abstract) class.....Book implemented the interface Create....
        obj.read();
        obj.write();

        }

    }

