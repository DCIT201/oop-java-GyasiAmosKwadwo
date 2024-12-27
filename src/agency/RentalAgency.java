package agency;

import customer.Customer;
import rental.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Vehicle> fleet;
    private final List<RentalTransaction> transactions;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    // Add a vehicle to the fleet
    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    // Process a rental
    public boolean processRental(Customer customer, String vehicleId, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                double cost = vehicle.calculateRentalCost(days);
                vehicle.setAvailability(false);
                transactions.add(new RentalTransaction(customer, vehicle, days, cost));
                customer.addRental(vehicle);
                return true;
            }
        }
        return false; // Rental failed (vehicle not found or unavailable)
    }

    // Rent a vehicle
    public boolean rentVehicle(Vehicle vehicle, Customer customer, int days) {
        if (vehicle.isAvailableForRental() && customer.isEligibleForRental()) {
            double cost = vehicle.calculateRentalCost(days);
            vehicle.setAvailability(false);
            transactions.add(new RentalTransaction(customer, vehicle, days, cost));
            customer.addRental(vehicle);
            return true;
        }
        return false; // Rental failed
    }

    // Return a vehicle
    public void returnVehicle(Vehicle vehicle, Customer customer) {
        vehicle.setAvailability(true); // Mark the vehicle as available
        System.out.println("Vehicle " + vehicle.getVehicleId() + " returned by " + customer.getName());
    }

    // Generate a report
    public void generateReport() {
        System.out.println("\n--- Rental Agency Report ---");
        System.out.println("Total Vehicles in Fleet: " + fleet.size());
        System.out.println("Transactions:");
        for (RentalTransaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
