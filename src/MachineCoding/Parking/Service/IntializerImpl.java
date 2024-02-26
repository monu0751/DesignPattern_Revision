package MachineCoding.Parking.Service;

import MachineCoding.Parking.Models.Constants.*;
import MachineCoding.Parking.Models.Gate;
import MachineCoding.Parking.Models.ParkingFloor;
import MachineCoding.Parking.Models.ParkingLot;
import MachineCoding.Parking.Models.ParkingSlot;
import MachineCoding.Parking.Repository.*;
import MachineCoding.Parking.Service.FeeCalculationStrategy.FeeCalculationStrategyFactory;
import MachineCoding.Parking.Service.FeeCalculationStrategy.FeeCalculationStrategyType;
import MachineCoding.Parking.Service.SlotAllocationStrategy.SlotAllocationStrategyFactory;
import MachineCoding.Parking.Service.SlotAllocationStrategy.SlotAllocationStrategyType;

import java.util.ArrayList;
import java.util.List;

public class IntializerImpl implements Initialzer{

    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSlotRepository parkingSlotRepository;

    public IntializerImpl(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSlotRepository parkingSlotRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSlotRepository = parkingSlotRepository;
    }

    @Override
    public void init() {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setParkingLotStatus(ParkingLotStatus.Open);
        List<VehicleType> allowedVehicleType = List.of(VehicleType.Car,VehicleType.Bike);
        parkingLot.setAllowedVehicleTypes(allowedVehicleType);
        parkingLot.setFeeCalculationStrategy(FeeCalculationStrategyFactory.getFeeCalculationStrategy(
                FeeCalculationStrategyType.RandomFeeCalculationStrategy
        ));
        parkingLot.setSlotAllocationStrategy(SlotAllocationStrategyFactory.getSlotAllocationStrategy(
                SlotAllocationStrategyType.ComeFirstServeFirstStrategy
        ));
        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        for(int i=1; i<=10; i++){
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.Open);
            List<ParkingSlot> parkingSlotList = new ArrayList<>();
            for(int j=1; j<=10; j++){
                ParkingSlot parkingSlot = new ParkingSlot();
                parkingSlot.setId((10 * i)+j);
                parkingSlot.setSlotNumber((10 * i)+j);
                parkingSlot.setParkingSlotStatus(ParkingSlotStatus.Open);
                VehicleType vehicleType = (j%2 == 0)?VehicleType.Bike:VehicleType.Car;
                parkingSlot.setVehicleType(vehicleType);
                parkingSlotList.add(parkingSlot);
                parkingSlotRepository.put(parkingSlot);
            }
            parkingFloor.setParkingSlots(parkingSlotList);

            Gate entryGate = new Gate();
            entryGate.setId((10 * i)+1);
            entryGate.setGateStatus(GateStatus.Open);
            entryGate.setGateType(GateType.Entry);
            entryGate.setParkingFloorId(i);

            Gate exitGate = new Gate();
            exitGate.setId((10 * i)+2);
            exitGate.setGateStatus(GateStatus.Open);
            exitGate.setGateType(GateType.Exit);
            exitGate.setParkingFloorId(i);
            gateRepository.put(entryGate);
            gateRepository.put(exitGate);
            parkingFloor.setEntryGates(List.of(entryGate));
            parkingFloor.setExitGates(List.of(exitGate));

            parkingFloorList.add(parkingFloor);
            parkingFloorRepository.put(parkingFloor);
        }
        parkingLot.setParkingFloors(parkingFloorList);
        parkingLotRepository.put(parkingLot);
//        System.out.println(gateRepository.toString());
    }
}
