package day55_polymorphism.Book;

import day52_inheritance.hiding.B;

public class Library {
    public static void main(String[] args) {


        JavaTextBook java = new JavaTextBook();

        java.name= "Jesus Always";
        java.size = 20.5;
        java.fun= true;
        java.read();
        java.open();
        java.download();
        System.out.println();

        Ebook ebook = new JavaTextBook();
        ebook.name= "Holy Spirit Always";
        ebook.size= 30.8;
//        ebook.fun = false;Ebook refernce does NOT hava access to the fun variable
        ((JavaTextBook)ebook).fun = true;  // downcasted,,,,cast the reference from the parenet Ebook to the child refence of JavaTextBook and that ref available
        ebook.read();
        ebook.download();
        ebook.open();
        System.out.println();


        Book book = new JavaTextBook();  // Parent,,,

        book.name= "God is good Always";
//        book.size=30.5;
//        book.fun= true;
        book.read();
//        book.open();               // Book refernce only access to the name variable and the read variable
        ((JavaTextBook)book).open();   // downcasting
//        book.download();
        ((JavaTextBook)book).download();  // downcasting
        System.out.println(book);
        System.out.println();

        Downloadable book4 = new JavaTextBook();
//        book4.name= "Jesus Always";
        ((JavaTextBook)book4).name= "Jesus"; // downcasting
//        book4.size = 20.5;
//        book4.fun= true;
//        book4.read();       // The only thing accessible by the Downloadable interface is the download method
//        book4.open();

          JavaTextBook book5 = ((JavaTextBook)book4);
        // book4 was the interface refernce., We cast the reference to be a JavaTextBook and assigned it to the book5 reference
        book5.read();
        book5.open();
        book5.download();
        book5.fun = false;

















    }
}
