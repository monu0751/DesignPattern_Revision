package MachineCoding.TicTacToe.Service.WinningStrategy;

import MachineCoding.TicTacToe.Models.Board;
import MachineCoding.TicTacToe.Models.Move;
import MachineCoding.TicTacToe.Models.Player;

import java.util.HashMap;
import java.util.List;

public interface WinningStrategy {
    Player checkWinner(Board board, Move move);
    public Move undoMove(Board board, Move move);
}
