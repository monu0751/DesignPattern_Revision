package MachineCoding.Parking.Service.SlotAllocationStrategy;

import MachineCoding.Parking.Exceptions.ParkingSlotNotFoundException;
import MachineCoding.Parking.Models.Constants.ParkingSlotStatus;
import MachineCoding.Parking.Models.Constants.VehicleType;
import MachineCoding.Parking.Models.ParkingFloor;
import MachineCoding.Parking.Models.ParkingSlot;

public class ComeFirstServeFirstStrategy implements SlotAllocationStrategy{

    @Override
    public ParkingSlot getParkingSlot(ParkingFloor parkingFloor, VehicleType vehicleType) throws ParkingSlotNotFoundException {
        for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()){
            if(parkingSlot.getVehicleType() == vehicleType && parkingSlot.getParkingSlotStatus() == ParkingSlotStatus.Open){
                return parkingSlot;
            }
        }

        throw new ParkingSlotNotFoundException("Parking slot not available");

    }
}
