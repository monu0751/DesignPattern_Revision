package MachineCoding.Parking.Models;

import MachineCoding.Parking.Models.Constants.GateStatus;
import MachineCoding.Parking.Models.Constants.GateType;

public class Gate {
    int id;
    int parkingFloorId;
    GateType gateType;

    @Override
    public String toString() {
        return "Gate{" +
                "id=" + id +
                ", parkingFloorId=" + parkingFloorId +
                ", gateType=" + gateType +
                ", gateStatus=" + gateStatus +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public int getParkingFloorId() {
        return parkingFloorId;
    }

    public void setParkingFloorId(int parkingFloorId) {
        this.parkingFloorId = parkingFloorId;
    }



    public int getId() {
        return id;
    }

    public GateType getGateType() {
        return gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    GateStatus gateStatus;
}
