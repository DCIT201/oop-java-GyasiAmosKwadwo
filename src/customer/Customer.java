package customer;

import rental.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Vehicle> rentalHistory;

    public Customer(String customerId, String name) {
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public <Vehicle extends rental.Vehicle> void addRental(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    public boolean isEligibleForRental() {
        return rentalHistory.size() < 5; // Example condition
    }
}
