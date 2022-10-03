package day48_encapsulation2.Book;

public class UsingBook {

    public static void main(String[] args) {
        Book b1 = new Book("The Great Gatsby" , "classics" , "Scott Fitzgerald");
        System.out.println(b1);

        Book b2 = new Book("Any Book","Fantasy", "Any Author");
        Book b3 = new Book("Crime and Punishment", "Classics", "Fyodor Dostoevsky");
        Book b4 = new Book("The Three Musketeers", "adventure", "Alexandre Dumas");
        Book b5 = new Book("Moby Dick", "adventure", "Herman Melville");
        Book b6 = new Book("Sandman", "comics", "Neil Gaiman");
        Book b7 = new Book("Europe: A History", "history", "Norman Davies");
        Book b8 = new Book("Game of Thrones", "fantasy", "George R. Martin");
        System.out.println();
        System.out.println(b2);
    }
}
