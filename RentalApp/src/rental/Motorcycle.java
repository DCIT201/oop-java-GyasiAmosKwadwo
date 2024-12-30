package rental;

public class Motorcycle extends Vehicle {
    private final boolean hasHelmetIncluded;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasHelmetIncluded) {
        super(vehicleId, model, baseRentalRate);
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate();
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

