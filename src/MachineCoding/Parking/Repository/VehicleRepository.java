package MachineCoding.Parking.Repository;

import MachineCoding.Parking.Exceptions.VehicleNotFoundException;
import MachineCoding.Parking.Models.Vehicle;

import java.util.HashMap;

public class VehicleRepository {
    private HashMap<Integer, Vehicle> vehicleHashMap;

    public HashMap<Integer, Vehicle> getVehicleHashMap() {
        return vehicleHashMap;
    }

    public VehicleRepository() {
        this.vehicleHashMap = new HashMap<>();
    }

    public Vehicle get(int id) throws VehicleNotFoundException {
        Vehicle vehicle = vehicleHashMap.get(id);
        if(vehicle==null){
            throw new VehicleNotFoundException("Foor "+id+" not found.");
        }
        return vehicle;
    }

    public Vehicle put(Vehicle vehicle){
        vehicleHashMap.put(vehicle.getId(),vehicle);
        return vehicle;
    }
}
