package day47_encapsulation;

import day48_encapsulation2.Book.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class LibraryUsingBook {

   /*
   -Create a class named Library

        -create Book objects
        -find the number off all books in the library with the help of "static" feature
        -create allBooks arrayList
        -create fantasyBooks arraylist by using allBooks collection
 */

    public static void main(String[] args) {
        Book b1 = new Book("The Great Gatsby" , "classics" , "Scott Fitzgerald");
        //b1.IDgenerator();
        System.out.println(b1);

        Book b2 = new Book("Any Book","Fantasy", "Any Author");
        Book b3 = new Book("Crime and Punishment", "Classics", "Fyodor Dostoevsky");
        Book b4 = new Book("The Three Musketeers", "adventure", "Alexandre Dumas");
        Book b5 = new Book("Moby Dick", "adventure", "Herman Melville");
        Book b6 = new Book("Sandman", "comics", "Neil Gaiman");
        Book b7 = new Book("Europe: A History", "history", "Norman Davies");
        Book b8 = new Book("Game of Thrones", "fantasy", "George R. Martin");

//        System.out.println(Book.bookCount);
//        System.out.println();

        //create all books arrayList

        ArrayList<Book> allBooks = new ArrayList<>(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8));
        System.out.println(allBooks);

    }}
