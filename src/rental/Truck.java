package rental;

public class Truck extends Vehicle {
    private double loadCapacity; // in tons

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate() + (loadCapacity * 50);
    }

    public float getBaseRentalRate() {
        return 0;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public boolean isAvailable() {
        return false;
    }
}

