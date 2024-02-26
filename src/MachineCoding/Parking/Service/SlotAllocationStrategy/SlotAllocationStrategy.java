package MachineCoding.Parking.Service.SlotAllocationStrategy;

import MachineCoding.Parking.Exceptions.ParkingSlotNotFoundException;
import MachineCoding.Parking.Models.Constants.VehicleType;
import MachineCoding.Parking.Models.ParkingFloor;
import MachineCoding.Parking.Models.ParkingSlot;

public interface SlotAllocationStrategy {
    public ParkingSlot getParkingSlot(ParkingFloor parkingFloor, VehicleType vehicleType) throws ParkingSlotNotFoundException;
}
