package MachineCoding.Parking.Models;

import MachineCoding.Parking.Models.Constants.VehicleType;

public class Vehicle {
    int id;
    String VehicleName;
    String VehicleNumber;
    VehicleType vehicleType;

    public void setId(int id) {
        this.id = id;
    }

    public void setVehicleName(String vehicleName) {
        VehicleName = vehicleName;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
