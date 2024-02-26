package MachineCoding.TicTacToe.Service.BotPlayingStrategy;

import MachineCoding.TicTacToe.Models.Board;
import MachineCoding.TicTacToe.Models.Player;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotPlayingStrategyType botPlayingStrategyType){
        switch (botPlayingStrategyType){
            case Basic_Bot_Playing_Strategy -> {
                return new BasicBotStrategy();
            }
            default -> {
                return null;
            }
        }
    }

}
