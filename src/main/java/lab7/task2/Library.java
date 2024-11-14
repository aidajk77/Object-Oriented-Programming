package lab7.task2;
import java.util.*;


public class Library {
    private Collection<Book> books;
    public Library(Collection<Book> books) {
        this.books = books;
    }
    public Collection<Book> getBooks() {
        return books;
    }
    public Optional<Book> getBookByISBN(int isbn) {
        for(Book b : books) {
            if(b.getIsbn()==isbn){
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }
}
