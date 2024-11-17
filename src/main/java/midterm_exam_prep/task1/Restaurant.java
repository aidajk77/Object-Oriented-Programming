package midterm_exam_prep.task1;

import java.util.*;

public class Restaurant {
    private String name;
    private List<Customer> customers;
    private Map<String, MenuItem> menuItems;

    public Restaurant(String name, List<Customer> customers, Map<String, MenuItem> menuItems) {
        this.name = name;
        this.customers = customers;
        this.menuItems = menuItems;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Customer getCustomer(String customerId){
        for(Customer customer : customers){
            if(customer.getCustomerId().equals(customerId)){
                return customer;
            }
        }
        return null;
    }

    public void displayMenu() {
        for(String menu : menuItems.keySet()){
            System.out.println(menuItems.get(menu).getDescription());
        }
    }

    public double calculateTotalSales(){
        double totalSales = 0;
        for(Customer customer : customers){
            List<TableReservation<? extends MenuItem>> customerReservations = customer.getReservations();
            for(TableReservation<? extends MenuItem> tableReservation : customerReservations) {
                totalSales += tableReservation.calculateTotalAmount();
            }
        }
        return totalSales;
    }

}
