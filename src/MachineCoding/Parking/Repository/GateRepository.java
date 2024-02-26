package MachineCoding.Parking.Repository;

import MachineCoding.Parking.Exceptions.GateNotFoundException;
import MachineCoding.Parking.Models.Gate;
import MachineCoding.Parking.Models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private HashMap<Integer, Gate> gateHashMap;

    @Override
    public String toString() {
        String str = "";
        for(Map.Entry<Integer, Gate> entry : gateHashMap.entrySet()){
            str = str+entry.getValue().toString();
        }

        return str;

    }

    public GateRepository() {
        this.gateHashMap = new HashMap<>();
    }

    public Gate get(int id) throws GateNotFoundException {
        Gate gate = gateHashMap.get(id);
        if(gate==null){
            throw new GateNotFoundException("Gate "+id+" not found.");
        }
        return gate;
    }

    public Gate put(Gate gate){
        gateHashMap.put(gate.getId(),gate);
        return gate;
    }

}
