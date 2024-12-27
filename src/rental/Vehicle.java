package rental;

public abstract class Vehicle {
    private final String vehicleId;
    private final String model;
    private final double baseRentalRate;
    private boolean isAvailable;

    // Constructor
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true; // Default: available
        boolean isAvailableForRental = false;
    }

    // Getters and setters with validation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public float getBaseRentalRate() {
        return (float) baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Abstract methods
    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();


    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Model: " + model +
                ", Base Rate: " + baseRentalRate + ", Available: " + isAvailable;
    }
}
