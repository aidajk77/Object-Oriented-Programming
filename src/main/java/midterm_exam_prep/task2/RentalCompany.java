package midterm_exam_prep.task2;
import java.util.*;

public class RentalCompany {
    private String companyName;
    private List<Customer> customers;
    private Map<String,Vehicle> vehicleInventory;

    public RentalCompany(String companyName) {
        this.companyName = companyName;
        this.customers = new ArrayList<>();
        this.vehicleInventory = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleInventory.put(vehicle.getName(), vehicle);
    }

    public Customer getCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void displayInventory(){
        for (String vehicle : vehicleInventory.keySet()) {
            System.out.println(vehicleInventory.get(vehicle).getDescription());
        }
    }

    public double calculateTotalRevenue(double discount){
        double total = 0;
        for (Customer customer : customers) {
            for(RentalTransaction<? extends Vehicle> transaction : customer.getRentalHistory()){
                total = total + transaction.calculateTotalAmount(discount);
            }
        }
        return total;
    }

}
