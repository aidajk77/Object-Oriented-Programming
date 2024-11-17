package midterm_exam_prep.task1;

import java.util.*;

public class Customer {
    private String customerId;
    private String name;
    private String phoneNumber;
    private List<TableReservation<? extends MenuItem>> reservations;
    public Customer(String customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        reservations = new ArrayList<>();
    }
    public void addReservation(TableReservation<? extends MenuItem> reservation) {
        reservations.add(reservation);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<TableReservation<? extends MenuItem>> getReservations() {
        return reservations;
    }

    public void setReservations(List<TableReservation<? extends MenuItem>> reservations) {
        this.reservations = reservations;
    }
}
