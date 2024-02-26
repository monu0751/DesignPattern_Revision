package MachineCoding.Parking.Repository;

import MachineCoding.Parking.Exceptions.ParkingLotNotFoundException;
import MachineCoding.Parking.Models.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotHashMap;

    public ParkingLotRepository() {
        this.parkingLotHashMap = new HashMap<>();
    }

    public ParkingLot get(int id) throws ParkingLotNotFoundException {
        ParkingLot parkingLot = parkingLotHashMap.get(id);
        if(parkingLot==null){
            throw new ParkingLotNotFoundException("Foor "+id+" not found.");
        }
        return parkingLot;
    }

    public ParkingLot put(ParkingLot parkingLot){
        parkingLotHashMap.put(parkingLot.getId(),parkingLot);
        return parkingLot;
    }
}
