package lab7.task4;

import java.time.LocalDate;

public class Sale {
    private double revenue;
    private String productCategory;
    private LocalDate date;

    public Sale(double revenue, String productCategory, LocalDate date) {
        this.revenue = revenue;
        this.productCategory = productCategory;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "revenue=" + revenue +
                ", productCategory='" + productCategory + '\'' +
                ", date=" + date +
                '}';
    }

    public double getRevenue() {
        return revenue;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
