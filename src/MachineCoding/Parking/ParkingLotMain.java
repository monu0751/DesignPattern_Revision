package MachineCoding.Parking;

import MachineCoding.Parking.Controller.TicketController;
import MachineCoding.Parking.DTO.TicketRequestDTO;
import MachineCoding.Parking.DTO.TicketResponseDTO;
import MachineCoding.Parking.Exceptions.GateNotFoundException;
import MachineCoding.Parking.Exceptions.ParkingLotNotFoundException;
import MachineCoding.Parking.Exceptions.ParkingSlotNotFoundException;
import MachineCoding.Parking.Models.Constants.VehicleType;
import MachineCoding.Parking.Models.ParkingLot;
import MachineCoding.Parking.Repository.*;
import MachineCoding.Parking.Service.Initialzer;
import MachineCoding.Parking.Service.IntializerImpl;

import java.time.LocalDateTime;

public class ParkingLotMain {
    public static void main(String[] args) {
        Initialzer initialzer;

        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TokenRepository tokenRepository = new TokenRepository();

        initialzer = new IntializerImpl(gateRepository, parkingLotRepository, parkingFloorRepository, parkingSlotRepository);
        initialzer.init();

        TicketController ticketController
                = new TicketController(parkingLotRepository, tokenRepository,gateRepository,vehicleRepository);
        TicketRequestDTO ticketRequestDTO
                = new TicketRequestDTO();
        ticketRequestDTO.setParkingLotId(1);
        ticketRequestDTO.setEntryTime(LocalDateTime.now());
        ticketRequestDTO.setGateId(31);
        ticketRequestDTO.setVehicleName("Baleno");
        ticketRequestDTO.setVehicleNumber("4799");
        ticketRequestDTO.setVehicleType(VehicleType.Car);

        try {
         TicketResponseDTO ticketResponseDTO = ticketController.createTicket(ticketRequestDTO);
            System.out.println(ticketResponseDTO.toString());

        } catch (ParkingLotNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ParkingSlotNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (GateNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
