package MachineCoding.Parking.Service.FeeCalculationStrategy;

public class FeeCalculationStrategyFactory {
    public static FeeCalculationStrategy getFeeCalculationStrategy(FeeCalculationStrategyType feeCalculationStrategyType){
        switch (feeCalculationStrategyType){
            case RandomFeeCalculationStrategy -> {
                return new RandomFeeCalculationStrategy();
            }
            default -> {
                return null;
            }
        }
    }
}
