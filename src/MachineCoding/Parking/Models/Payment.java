package MachineCoding.Parking.Models;

public class Payment {
    int id;
    Bill bill;
    double amount;

    public Bill getBill() {
        return bill;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }
}
