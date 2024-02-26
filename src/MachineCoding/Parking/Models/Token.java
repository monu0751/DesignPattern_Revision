package MachineCoding.Parking.Models;

import MachineCoding.Parking.Models.Constants.VehicleType;

import java.time.LocalDateTime;

public class Token {
    int id;
    Vehicle vehicle;
    Gate gate;
    ParkingSlot parkingSlot;
    LocalDateTime entryTime;

    public void setId(int id) {
        this.id = id;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Gate getGate() {
        return gate;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }
}
