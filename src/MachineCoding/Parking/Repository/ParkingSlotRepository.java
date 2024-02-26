package MachineCoding.Parking.Repository;

import MachineCoding.Parking.Exceptions.ParkingSlotNotFoundException;
import MachineCoding.Parking.Models.ParkingSlot;

import java.util.HashMap;

public class ParkingSlotRepository {
    private HashMap<Integer, ParkingSlot> parkingSlotHashMap;

    public ParkingSlotRepository() {
        this.parkingSlotHashMap = new HashMap<>();
    }

    public ParkingSlot get(int id) throws ParkingSlotNotFoundException {
        ParkingSlot parkingSlot = parkingSlotHashMap.get(id);
        if(parkingSlot==null){
            throw new ParkingSlotNotFoundException("Foor "+id+" not found.");
        }
        return parkingSlot;
    }

    public ParkingSlot put(ParkingSlot parkingSlot){
        parkingSlotHashMap.put(parkingSlot.getId(),parkingSlot);
        return parkingSlot;
    }
}
