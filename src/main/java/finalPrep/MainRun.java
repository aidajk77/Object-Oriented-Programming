package finalPrep;

import java.util.List;

public class MainRun {
    public static void main(String[] args) {
        List<Book> books = FinalPrep.loadBooks("myBooks.csv");
        for (Book book : books) {
            System.out.println(book);
        }
        ReportWriter.writeReport("output.csv",books);
    }
}
