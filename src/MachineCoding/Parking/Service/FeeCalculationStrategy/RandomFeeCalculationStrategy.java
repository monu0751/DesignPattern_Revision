package MachineCoding.Parking.Service.FeeCalculationStrategy;

import MachineCoding.Parking.Models.Constants.VehicleType;
import MachineCoding.Parking.Models.Token;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RandomFeeCalculationStrategy implements FeeCalculationStrategy{
    private static final int CAR_BASE_TARRIF = 100;
    private static final int BIKE_BASE_TERRIF = 50;
    private static final double INCREAMENT_FACTOR = 0.1;

    @Override
    public double getFees(Token token, LocalDateTime exitTime) {

        LocalDateTime entryTime = token.getEntryTime();
        double total_hours = entryTime.until(exitTime, ChronoUnit.HOURS);
        int base_amount = (token.getVehicle().getVehicleType() == VehicleType.Bike)?BIKE_BASE_TERRIF:CAR_BASE_TARRIF;

        return base_amount + (base_amount * INCREAMENT_FACTOR * (total_hours - 1));
    }
}
