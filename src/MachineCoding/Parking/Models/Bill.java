package MachineCoding.Parking.Models;

public class Bill {
    int id;
    Vehicle vehicle;
    Token token;
    double amount;

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Token getToken() {
        return token;
    }

    public double getAmount() {
        return amount;
    }
}
