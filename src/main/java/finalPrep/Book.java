package finalPrep;

import java.util.*;

public class Book {
    @WriteConcerns
    private Date date;
    @WriteConcerns(caseFormatter = CaseFormatter.ORDINARY)
    private String quarter;
    private int qtr;
    private int year;
    @WriteConcerns(caseFormatter = CaseFormatter.UPPER_CASE)
    private String customerId;
    @WriteConcerns
    private double totalAmount;
    @WriteConcerns(numberFormater = NumberFormatter.PERCENTAGE)
    private double profitPercentage;
    private double profitInr;
    private double costPrice;
    public Book(BookBuilder builder) {
        this.costPrice = builder.costPrice;
        this.customerId = builder.customerId;
        this.date = builder.date;
        this.profitInr = builder.profitInr;
        this.profitPercentage = builder.profitPercentage;
        this.qtr = builder.qtr;
        this.quarter = builder.quarter;
        this.totalAmount = builder.totalAmount;
        this.year = builder.year;
    }

    public static class BookBuilder{
        private Date date;
        private String quarter;
        private int qtr;
        private int year;
        private String customerId;
        private double totalAmount;
        private double profitPercentage;
        private double profitInr;
        private double costPrice;
        public BookBuilder(){};

        public BookBuilder setDate(Date date) {
            this.date = date;
            return this;
        }

        public BookBuilder setQuarter(String quarter) {
            this.quarter = quarter;
            return this;
        }

        public BookBuilder setQtr(int qtr) {
            this.qtr = qtr;
            return this;
        }

        public BookBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public BookBuilder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public BookBuilder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public  BookBuilder setProfitPercentage(double profitPercentage) {
            this.profitPercentage = profitPercentage;
            return this;
        }

        public BookBuilder setProfitInr(double profitInr) {
            this.profitInr = profitInr;
            return this;
        }

        public BookBuilder setCostPrice(double costPrice) {
            this.costPrice = costPrice;
            return this;
        }
        public Book build(){
           return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "date=" + date +
                ", quarter='" + quarter + '\'' +
                ", qtr=" + qtr +
                ", year=" + year +
                ", customerId='" + customerId + '\'' +
                ", totalAmount=" + totalAmount +
                ", profitPercentage=" + profitPercentage +
                ", profitInr=" + profitInr +
                ", costPrice=" + costPrice +
                '}';
    }
}
