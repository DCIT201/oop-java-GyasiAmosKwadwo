package rental;

public class Car extends Vehicle {
    private final boolean hasAirConditioning;

    public Car(String vehicleId, String model, double baseRentalRate, boolean hasAirConditioning) {
        super(vehicleId, model, baseRentalRate);
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = days * getBaseRentalRate();
        if (hasAirConditioning) {
            cost += days * 10; // Additional daily fee for A/C
        }
        return cost;
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

    public void setAvailable(boolean available) {
    }
}
