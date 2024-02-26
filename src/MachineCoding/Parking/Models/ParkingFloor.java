package MachineCoding.Parking.Models;

import MachineCoding.Parking.Models.Constants.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor {
    int id;
    int floorNumber;
    ParkingFloorStatus parkingFloorStatus;
    List<ParkingSlot> parkingSlots;
    List<Gate> entryGates;
    List<Gate> exitGates;

    public void setId(int id) {
        this.id = id;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public int getId() {
        return id;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }
}
