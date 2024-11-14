package lab7.task2;

public class Book {
    private String author;
    private String title;
    private int isbn;
    private Status status;

    public Book(String author, String title, int isbn, Status status) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.status = status;
    }
    public  Book(String author, String title, int isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public Status getStatus() {
        return status;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public String toString() {
        return author + "\t" + title + "\t" + isbn + "\t" + status;
    }
}
