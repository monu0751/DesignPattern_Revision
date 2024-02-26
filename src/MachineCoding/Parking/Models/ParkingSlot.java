package MachineCoding.Parking.Models;

import MachineCoding.Parking.Models.Constants.ParkingSlotStatus;
import MachineCoding.Parking.Models.Constants.VehicleType;

public class ParkingSlot {
    int id;
    int slotNumber;
    ParkingSlotStatus parkingSlotStatus;
    VehicleType vehicleType;

    public void setId(int id) {
        this.id = id;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
