package agency;

import customer.Customer;
import rental.Vehicle;

public class RentalTransaction {
    final Customer customer;
    final Vehicle vehicle;
    final int rentalDays;
    final double rentalCost;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays, double rentalCost) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.rentalCost = rentalCost;
    }

    @Override
    public String toString() {
        return "Transaction: Customer=" + customer + ", Vehicle=" + vehicle +
                ", Days=" + rentalDays + ", Cost=" + rentalCost;
    }
}
