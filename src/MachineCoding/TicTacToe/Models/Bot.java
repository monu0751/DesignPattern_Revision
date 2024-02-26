package MachineCoding.TicTacToe.Models;

import MachineCoding.TicTacToe.Models.Constants.BotDificultyLevel;
import MachineCoding.TicTacToe.Service.BotPlayingStrategy.BotPlayingStrategy;
import MachineCoding.TicTacToe.Service.BotPlayingStrategy.Exception.GameOverException;

public class Bot extends Player{
    BotDificultyLevel botDificultyLevel;
    BotPlayingStrategy botPlayingStrategy;

    public BotDificultyLevel getBotDificultyLevel() {
        return botDificultyLevel;
    }

    public void setBotDificultyLevel(BotDificultyLevel botDificultyLevel) {
        this.botDificultyLevel = botDificultyLevel;
    }

    public BotPlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }

    public Move executeMove(Board board) throws GameOverException {
        return this.botPlayingStrategy.makeMove(board,this);
    }
}
