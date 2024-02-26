package MachineCoding.TicTacToe.Service.WinningStrategy;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyType winningStrategyType, int dimention){
        switch (winningStrategyType){
            case Order_One_Winning_Strategy -> {
                return new OrderOneWinningStrategy(dimention);
            }
            default -> {
                return null;
            }
        }

    }
}
