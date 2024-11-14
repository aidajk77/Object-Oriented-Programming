package lab7.task4;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Sale> sales = new ArrayList<Sale>();
        Sale s1 = new Sale(50.50, "c1", LocalDate.of(2024,10,23));
        Sale s2 = new Sale(30.55, "c2", LocalDate.of(2024,11,24));
        Sale s3 = new Sale(33.55, "c2", LocalDate.of(2024,9,25));
        sales.add(s1);
        sales.add(s2);
        sales.add(s3);
        SalesReport.generateReport(sales);
        System.out.println("_______________________");
        SalesReport.generateReport(sales,"c2");
        System.out.println("_______________________");
        SalesReport.generateReport(sales,LocalDate.of(2024,10,1),LocalDate.of(2024,12,1));
    }
}
