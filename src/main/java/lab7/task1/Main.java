package lab7.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        DiscountStrategy percentageDiscount = (x) -> x.getPrice()*0.8;
        DiscountStrategy fixedDiscount2 = (x) -> x.getPrice()-2;
        DiscountStrategy bulkDiscount = (x) -> {
            if(x.getQuantity()>5)
                return x.getPrice()*0.9;
            return x.getPrice();
        };
        List<Product> products=new ArrayList<>();
        products.add(new Product("a",19.99, 4));
        products.add(new Product("b",9.99, 8));
        products.add(new Product("c",13.99, 6));
        discount(products, percentageDiscount);
        discount(products, fixedDiscount2);
        discount(products, bulkDiscount);
    }
    private static void discount(List<Product> products,DiscountStrategy d){
        for(Product p:products){
            System.out.println("Product "+p.getName()+"costs regularly "+p.getPrice()+" but it is discounted to "+ d.applyDiscount(p));
        }
    }

}
