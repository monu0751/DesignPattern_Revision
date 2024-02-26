package MachineCoding.TicTacToe.Service.BotPlayingStrategy;

import MachineCoding.TicTacToe.Models.Board;
import MachineCoding.TicTacToe.Models.Cell;
import MachineCoding.TicTacToe.Models.Constants.CellState;
import MachineCoding.TicTacToe.Models.Move;
import MachineCoding.TicTacToe.Models.Player;
import MachineCoding.TicTacToe.Service.BotPlayingStrategy.Exception.GameOverException;

import java.util.List;

public class BasicBotStrategy implements BotPlayingStrategy{


    @Override
    public Move makeMove(Board board, Player player) throws GameOverException {
        int size = board.getSize();
        List<List<Cell>> matrix = board.getBoard();
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(matrix.get(i).get(j).getCellState() == CellState.Empty){
                    matrix.get(i).get(j).setPlayer(player);
                    matrix.get(i).get(j).setCellState(CellState.Fill);
                    return new Move(i,j,player);
                }
            }
        }

        throw new GameOverException("Game over, no cell left for any move");

    }
}
