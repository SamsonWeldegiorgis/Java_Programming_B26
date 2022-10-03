package day55_polymorphism.Book;

public abstract class Ebook extends Book implements Downloadable {
    /*
    Create an abstact class Ebook
    INherits BOok and implements Downloadable
    Declare a size variable
    Declare an abstrac method : open();
     */

    double size;

    public abstract void open();

}
