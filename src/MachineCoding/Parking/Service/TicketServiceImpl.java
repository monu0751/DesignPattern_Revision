package MachineCoding.Parking.Service;

import MachineCoding.Parking.Exceptions.GateNotFoundException;
import MachineCoding.Parking.Exceptions.ParkingLotNotFoundException;
import MachineCoding.Parking.Exceptions.ParkingSlotNotFoundException;
import MachineCoding.Parking.Models.*;
import MachineCoding.Parking.Models.Constants.VehicleType;
import MachineCoding.Parking.Repository.GateRepository;
import MachineCoding.Parking.Repository.ParkingLotRepository;
import MachineCoding.Parking.Repository.TokenRepository;
import MachineCoding.Parking.Repository.VehicleRepository;
import MachineCoding.Parking.Service.SlotAllocationStrategy.SlotAllocationStrategy;
import MachineCoding.Parking.Service.SlotAllocationStrategy.SlotAllocationStrategyFactory;
import MachineCoding.Parking.Service.SlotAllocationStrategy.SlotAllocationStrategyType;

import java.time.LocalDateTime;

public class TicketServiceImpl implements TicketService{
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;
    private TokenRepository tokenRepository;

    private VehicleRepository vehicleRepository;

    public TicketServiceImpl(ParkingLotRepository parkingLotRepository, TokenRepository tokenRepository, GateRepository gateRepository, VehicleRepository vehicleRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.tokenRepository = tokenRepository;
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Token CreateToken(String vehicleName, String vehicleNumber, VehicleType vehicleType, LocalDateTime entryTime, int parkingLotId, int gateId) throws ParkingLotNotFoundException, GateNotFoundException, ParkingSlotNotFoundException {
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);
        Gate gate = gateRepository.get(gateId);
        ParkingFloor parkingFloor = parkingLot.getParkingFloors().get(gate.getParkingFloorId()-1);
        Vehicle vehicle = new Vehicle();
        int vehicleId = vehicleRepository.getVehicleHashMap().size()+1;
        vehicle.setId(vehicleId);
        vehicle.setVehicleName(vehicleName);
        vehicle.setVehicleNumber(vehicleNumber);
        vehicle.setVehicleType(vehicleType);
        vehicleRepository.put(vehicle);
        ParkingSlot parkingSlot = parkingLot.getSlotAllocationStrategy().getParkingSlot(parkingFloor,vehicle.getVehicleType());
        Token token = new Token();
        token.setEntryTime(entryTime);
        token.setGate(gate);

        token.setVehicle(vehicle);
        token.setParkingSlot(parkingSlot);
        int tokenId = tokenRepository.getTokenHashMap().size()+1;
        token.setId(tokenId);
        return tokenRepository.put(token);
    }
}
