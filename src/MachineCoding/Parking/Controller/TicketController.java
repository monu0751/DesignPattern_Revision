package MachineCoding.Parking.Controller;

import MachineCoding.Parking.DTO.TicketRequestDTO;
import MachineCoding.Parking.DTO.TicketResponseDTO;
import MachineCoding.Parking.Exceptions.GateNotFoundException;
import MachineCoding.Parking.Exceptions.ParkingLotNotFoundException;
import MachineCoding.Parking.Exceptions.ParkingSlotNotFoundException;
import MachineCoding.Parking.Models.Token;
import MachineCoding.Parking.Models.Vehicle;
import MachineCoding.Parking.Repository.GateRepository;
import MachineCoding.Parking.Repository.ParkingLotRepository;
import MachineCoding.Parking.Repository.TokenRepository;
import MachineCoding.Parking.Repository.VehicleRepository;
import MachineCoding.Parking.Service.TicketService;
import MachineCoding.Parking.Service.TicketServiceImpl;

import java.time.LocalDateTime;

public class TicketController {
    private TicketService ticketService;

    public TicketController(ParkingLotRepository parkingLotRepository, TokenRepository tokenRepository, GateRepository gateRepository, VehicleRepository vehicleRepository) {
        ticketService = new TicketServiceImpl(parkingLotRepository,tokenRepository,gateRepository,vehicleRepository);
    }

    public TicketResponseDTO createTicket(TicketRequestDTO ticketRequestDTO) throws ParkingLotNotFoundException, ParkingSlotNotFoundException, GateNotFoundException {

        Token token = ticketService.CreateToken(
                ticketRequestDTO.getVehicleName()
                ,ticketRequestDTO.getVehicleNumber()
                ,ticketRequestDTO.getVehicleType()
                , LocalDateTime.now()
                ,ticketRequestDTO.getParkingLotId()
                ,ticketRequestDTO.getGateId()
        );

//        System.out.println("ticketRequestDTO "+ticketRequestDTO.getGateId());


        TicketResponseDTO ticketResponseDTO = new TicketResponseDTO(
                token.getParkingSlot().getSlotNumber()
                ,token.getEntryTime()
                , token.getGate().getId()
                ,token.getGate().getParkingFloorId()
        );
//        System.out.println("token "+ticketRequestDTO.getGateId());
        return ticketResponseDTO;
    }
}
