package midterm_exam_prep.task1;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish("123","dish1", 12.00, CuisineType.MEXICAN, "chilli");
        Drink drink = new Drink("321", "drink1", 3.50,330);
        Restaurant restaurant = new Restaurant("restaurant", new ArrayList<Customer>(), new HashMap<String, MenuItem>());
        restaurant.addMenuItem(dish);
        restaurant.addMenuItem(drink);
        TableReservation<Drink> tr1 = new TableReservation<>("1", LocalDate.of(2024,11,7),1);
        tr1.addItemToOrder(drink,100);
        TableReservation<Dish> tr2 = new TableReservation<>("2", LocalDate.of(2024,11,7),2);
        tr2.addItemToOrder(dish,50);
        Customer customer = new Customer("52158128","Customer1","061482713");
        customer.addReservation(tr1);
        customer.addReservation(tr2);
        restaurant.addCustomer(customer);
        customer.getReservations().forEach(System.out::println);
        System.out.println(restaurant.calculateTotalSales());

    }

}
