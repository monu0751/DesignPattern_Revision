package MachineCoding.TicTacToe.Service.BotPlayingStrategy;

import MachineCoding.TicTacToe.Models.Board;
import MachineCoding.TicTacToe.Models.Move;
import MachineCoding.TicTacToe.Models.Player;
import MachineCoding.TicTacToe.Service.BotPlayingStrategy.Exception.GameOverException;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player) throws GameOverException;
}
