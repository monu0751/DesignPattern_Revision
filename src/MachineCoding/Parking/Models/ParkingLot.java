package MachineCoding.Parking.Models;

import MachineCoding.Parking.Models.Constants.ParkingLotStatus;
import MachineCoding.Parking.Models.Constants.VehicleType;
import MachineCoding.Parking.Service.FeeCalculationStrategy.FeeCalculationStrategy;
import MachineCoding.Parking.Service.SlotAllocationStrategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot {
    int id;
    ParkingLotStatus parkingLotStatus;
    List<VehicleType> allowedVehicleTypes;
    List<ParkingFloor> parkingFloors;
    SlotAllocationStrategy slotAllocationStrategy;
    FeeCalculationStrategy feeCalculationStrategy;

    public void setId(int id) {
        this.id = id;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public void setAllowedVehicleTypes(List<VehicleType> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public void setFeeCalculationStrategy(FeeCalculationStrategy feeCalculationStrategy) {
        this.feeCalculationStrategy = feeCalculationStrategy;
    }

    public int getId() {
        return id;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public List<VehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public SlotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public FeeCalculationStrategy getFeeCalculationStrategy() {
        return feeCalculationStrategy;
    }
}
