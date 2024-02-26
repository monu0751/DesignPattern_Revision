package MachineCoding.Parking.Service.FeeCalculationStrategy;

import MachineCoding.Parking.Models.Constants.VehicleType;
import MachineCoding.Parking.Models.Token;

import java.time.LocalDateTime;

public interface FeeCalculationStrategy {
    public double getFees(Token token, LocalDateTime exitTime);
}
