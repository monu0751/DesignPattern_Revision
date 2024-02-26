package MachineCoding.Parking.Service;

import MachineCoding.Parking.Exceptions.GateNotFoundException;
import MachineCoding.Parking.Exceptions.ParkingLotNotFoundException;
import MachineCoding.Parking.Exceptions.ParkingSlotNotFoundException;
import MachineCoding.Parking.Models.Constants.VehicleType;
import MachineCoding.Parking.Models.Token;
import MachineCoding.Parking.Models.Vehicle;

import java.time.LocalDateTime;

public interface TicketService
{
    public Token CreateToken(String vehicleName, String vehicleNumber, VehicleType vehicleType, LocalDateTime entryTime, int parkingLotId, int gateId) throws ParkingLotNotFoundException, GateNotFoundException, ParkingSlotNotFoundException;
}
