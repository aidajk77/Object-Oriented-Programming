package lab5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Audi",10000,80));
        vehicles.add(new Truck("MAN", 30000, 90));
        vehicles.add(new Motorcycle("Yamaha", 2000, 90));
        for(Vehicle vehicle : vehicles){
            vehicle.setExpectedLifespan(vehicle.expectedLifespan());
            System.out.println(vehicle.service());
            vehicle.simulateYear();
            if(vehicle instanceof Car){
                Car car = (Car) vehicle;
                car.drive(20);
            }
            if(vehicle instanceof Truck){
                Truck truck = (Truck) vehicle;
                truck.haul(2000);
            }
            if(vehicle instanceof Motorcycle){
                Motorcycle motorcycle = (Motorcycle) vehicle;
                motorcycle.race(10);
            }
        }
        System.out.println("Choose one vehicle: ");
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Motorcycle");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice == 1){
            for(Vehicle vehicle : vehicles){
                if(vehicle instanceof Car){
                    vehicle.performMaintenance((Car) vehicle);
                }
            }
        }
        if(choice == 2){
            for(Vehicle vehicle : vehicles){
                if(vehicle instanceof Truck){
                    vehicle.performMaintenance((Truck) vehicle);
                }
            }
        }
        if(choice == 3){
            for(Vehicle vehicle : vehicles){
                if(vehicle instanceof Motorcycle){
                    vehicle.performMaintenance((Motorcycle) vehicle);
                }
            }
        }
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.getModelName());
            System.out.println(vehicle.getMileage());
            System.out.println(vehicle.getHealth());
        }
    }

}
