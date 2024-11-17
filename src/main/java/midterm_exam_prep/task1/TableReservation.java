package midterm_exam_prep.task1;

import java.util.*;
import java.time.*;

public class TableReservation <T extends MenuItem & Billable>{
    private String reservation_id;
    private LocalDate reservationDate;
    private HashMap<T,Integer> orderedItems;
    private int tableNumber;
    public TableReservation(String reservation_id, LocalDate reservationDate, int tableNumber) {
        this.reservation_id = reservation_id;
        this.reservationDate = reservationDate;
        this.tableNumber = tableNumber;
        this.orderedItems = new HashMap<>();
    }
    public void addItemToOrder(T item, int quantity){
        orderedItems.put(item, quantity);
    }

    public double calculateTotalAmount(){
        double total = 0;
        for(T item : orderedItems.keySet()){
            total = total + orderedItems.get(item)*item.getPrice();
        }
        return total;
    }

    public String getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(String reservation_id) {
        this.reservation_id = reservation_id;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public HashMap<T, Integer> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(HashMap<T, Integer> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public String toString() {
        return "TableReservation{" +
                "reservation_id='" + reservation_id + '\'' +
                ", reservationDate=" + reservationDate +
                ", orderedItems=" + orderedItems.keySet() +
                ", tableNumber=" + tableNumber +
                '}';
    }
}
