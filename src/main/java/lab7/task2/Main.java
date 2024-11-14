package lab7.task2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book a = new Book("a1", "t1", 123, Status.AVAILABLE);
        Book b = new Book("a2", "t2", 1234, Status.CHECKED_OUT);
        Book c = new Book("a3", "t3", 12345, Status.RESERVED);
        Collection<Book> books = Arrays.asList(a, b, c);
        Library library = new Library(books);
        System.out.println(library.getBookByISBN(123).get());
        System.out.println(library.getBookByISBN(1234).get());
        System.out.println(library.getBookByISBN(12345).get());
        System.out.println(library.getBookByISBN(12346).orElse(new Book("default", "//", 0)));
        System.out.println(library.getBookByISBN(12347).orElseGet(() -> new Book("default", "//", 0)));
        System.out.println(library.getBookByISBN(12348).orElseThrow(() -> new RuntimeException("Book not found")));


    }
}
