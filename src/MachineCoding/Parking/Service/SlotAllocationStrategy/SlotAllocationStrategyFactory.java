package MachineCoding.Parking.Service.SlotAllocationStrategy;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy getSlotAllocationStrategy(SlotAllocationStrategyType slotAllocationStrategyType){
        switch (slotAllocationStrategyType){
            case ComeFirstServeFirstStrategy -> {
                return new ComeFirstServeFirstStrategy();
            }
            default -> {
                return null;
            }
        }
    }
}
