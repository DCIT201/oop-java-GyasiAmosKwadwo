import agency.RentalAgency;
import rental.Vehicle;
import rental.Car;
import rental.Motorcycle;
import rental.Truck;
import customer.Customer;

public class Main {
    public static void main(String[] args) {
        //  Initializing the Rental Agency
        RentalAgency rentalAgency = new RentalAgency();

        // Adding vehicles to the fleet
        Vehicle car1 = new Car("D001", "Toyota Corolla", 50.0, true);
        Vehicle motorcycle1 = new Motorcycle("M001", "Yamaha MT-07", 30.0, true);
        Vehicle truck1 = new Truck("T001", "Ford Ranger", 80.0, 500.76);

        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(motorcycle1);
        rentalAgency.addVehicle(truck1);

        //  Creating a customer
        Customer customer = new Customer("Gyasi Amoss", "gyasi.amos.@gmail.com");

        //  Renting a car
        System.out.println("\n--- Renting a Car ---");
        boolean rentSuccess = rentalAgency.rentVehicle(car1, customer, 5); // Rent for 5 days
        if (rentSuccess) {
            System.out.println("Car rented successfully!");
        } else {
            System.out.println("Car rental failed.");
        }

        //  Showing rental cost
        double rentalCost = car1.calculateRentalCost(5);
        System.out.println("Rental cost for 5 days: $" + rentalCost);

        //  Returning the car
        System.out.println("\n--- Returning the Car ---");
        rentalAgency.returnVehicle(car1, customer);
        System.out.println("Car returned successfully.");

        //  Renting a motorcycle
        System.out.println("\n--- Renting a Motorcycle ---");
        boolean motorcycleRentSuccess = rentalAgency.rentVehicle(motorcycle1, customer, 3);
        if (motorcycleRentSuccess) {
            System.out.println("Motorcycle rented successfully!");
        } else {
            System.out.println("Motorcycle rental failed.");
        }

        //  Generating a report
        System.out.println("\n--- Generating Report ---");
        rentalAgency.generateReport();
    }
}
