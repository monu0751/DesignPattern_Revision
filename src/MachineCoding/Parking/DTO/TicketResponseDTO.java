package MachineCoding.Parking.DTO;

import MachineCoding.Parking.Models.ParkingSlot;

import java.time.LocalDateTime;

public class TicketResponseDTO {
    int slotNumber;
    LocalDateTime entryTime;
    int gateId;
    int floorId;

    @Override
    public String toString() {
        return "TicketResponseDTO{" +
                "slotNumber=" + slotNumber +
                ", entryTime=" + entryTime +
                ", gateId=" + gateId +
                ", floorId=" + floorId +
                '}';
    }

    public TicketResponseDTO(int slotNumber, LocalDateTime entryTime, int gateId, int floorId) {
        this.slotNumber = slotNumber;
        this.entryTime = entryTime;
        this.gateId = gateId;
        this.floorId = floorId;
    }
}
