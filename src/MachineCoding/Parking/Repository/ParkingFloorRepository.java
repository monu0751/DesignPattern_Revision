package MachineCoding.Parking.Repository;

import MachineCoding.Parking.Exceptions.GateNotFoundException;
import MachineCoding.Parking.Exceptions.ParkingFloorNotFoundException;
import MachineCoding.Parking.Models.Gate;
import MachineCoding.Parking.Models.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> parkingFloorHashMap;

    public ParkingFloorRepository() {
        this.parkingFloorHashMap = new HashMap<>();
    }

    public ParkingFloor get(int id) throws ParkingFloorNotFoundException {
        ParkingFloor parkingFloor = parkingFloorHashMap.get(id);
        if(parkingFloor==null){
            throw new ParkingFloorNotFoundException("Foor "+id+" not found.");
        }
        return parkingFloor;
    }

    public ParkingFloor put(ParkingFloor parkingFloor){
        parkingFloorHashMap.put(parkingFloor.getId(),parkingFloor);
        return parkingFloor;
    }
}
