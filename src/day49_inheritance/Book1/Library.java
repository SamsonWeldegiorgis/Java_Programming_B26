package day49_inheritance.Book1;

public class Library {

    public static void main(String[] args) {

        // not doing any inheritance here, just a main method to create my objects

        Book1 obj1 = new Book1();
        // obj1 will have access to 6 instance variables

        AudioBook obj2 = new AudioBook();
        // obj2 has access to the 6 variables from the Book class and the 2 new variables in the AudioBook class:
        obj2.duration = 100;
        obj2.narrator = "Morgan Freeman";
        // obj2 has access to the instance method listen()
        obj2.title = "Java is fun";
        obj2.listen();

        EBook obj3 = new EBook();
        // obj3 has access to the 6 variables from the Book class and the 2 new variables in the EBook class:
        obj3.size = 20.4;
        obj3.pages = 1004;
        // obj3 has access to the instance method read()
        obj3.title = "Soft skills is important";
        obj3.read();

        // using the updated Author information

        Book1 obj4 = new Book1();
        obj4.author= new Author("JK Rowling", 40); // made an Author object it belongs to the Book obj4
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());

        // Author author = new Author(); here you are making an Author obj in the main method, it is local to the main methods

        // but on line 30 the object is made with the reference coming from the book object. The Author obj belongs to the Book project

    }
}

