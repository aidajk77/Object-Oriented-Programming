package lab7.task4;
import java.time.LocalDate;
import java.util.*;

public class SalesReport {
    public static void generateReport(List<Sale> sales) {
        for(Sale s : sales) {
            System.out.println(s);
        }
        System.out.println("Total revenue is "+totalRevenue.statistics(sales));
        System.out.println("Average revenue is "+avgRevenue.statistics(sales));
    }
    public static void generateReport(List<Sale> sales,String productCategory) {
        List<Sale> filteredSales = new ArrayList<>();
        for(Sale s : sales) {
            if(s.getProductCategory().equals(productCategory)) {
                filteredSales.add(s);
            }
        }
        for(Sale s : filteredSales) {
            System.out.println(s);
        }
        System.out.println("Total revenue of a specific productCategory is "+totalRevenue.statistics(filteredSales));
        System.out.println("Average revenue of a specific productCategory is "+avgRevenue.statistics(filteredSales));
    }
    public static void generateReport(List<Sale> sales, LocalDate startDate, LocalDate endDate){
        List<Sale> filteredSales = new ArrayList<>();
        for(Sale s : sales) {
            if(s.getDate().isAfter(startDate) && s.getDate().isBefore(endDate)) {
                filteredSales.add(s);
            }
        }
        for(Sale s : filteredSales) {
            System.out.println(s);
        }
        System.out.println("Total revenue between "+startDate+" and "+endDate+" is "+totalRevenue.statistics(filteredSales));
        System.out.println("Average revenue between "+startDate+" and "+endDate+" is "+avgRevenue.statistics(filteredSales));
    }

    private static Statistics avgRevenue = (List<Sale> sales) -> {
        double avgRevenue = 0;
        for(Sale sale:sales){
            avgRevenue=avgRevenue+sale.getRevenue();
        }
        return avgRevenue/sales.size();
    };
    private static Statistics totalRevenue = (List<Sale> sales)-> {
        double totalRevenue = 0;
        for(Sale sale : sales){
            totalRevenue=totalRevenue+sale.getRevenue();
        }
        return totalRevenue;
    };
}
