package day55_polymorphism.Book;

public class JavaTextBook extends Ebook{

    /*
    Create a class JavaTextBook
    Inherit Ebook
    Decare fun variable
    oveeride all abstract methods;
     */

    boolean fun;   // or int

    @Override
    public void read() {
        System.out.println("Reading Java textbook");

    }

    @Override
    public void download() {
        System.out.println("Downloading Java textbook");

    }

    @Override
    public void open() {
        System.out.println("Opening Java textbook");

    }
}
