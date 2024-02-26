package MachineCoding.TicTacToe.Controller;

import MachineCoding.TicTacToe.Exception.InvalidBoardDimension;
import MachineCoding.TicTacToe.Exception.InvalidBotCountException;
import MachineCoding.TicTacToe.Exception.InvalidPlayerCount;
import MachineCoding.TicTacToe.Exception.InvalidPlayerSymbol;
import MachineCoding.TicTacToe.Models.*;
import MachineCoding.TicTacToe.Models.Constants.CellState;
import MachineCoding.TicTacToe.Models.Constants.GameStatus;
import MachineCoding.TicTacToe.Models.Constants.PlayerType;
import MachineCoding.TicTacToe.Service.BotPlayingStrategy.Exception.GameOverException;
import MachineCoding.TicTacToe.Service.WinningStrategy.WinningStrategy;
import MachineCoding.TicTacToe.Service.WinningStrategy.WinningStrategyFactory;
import MachineCoding.TicTacToe.Service.WinningStrategy.WinningStrategyType;

import java.util.List;
import java.util.StringJoiner;

public class GameController {
    private WinningStrategy winningStrategy;

    public Game createGame(int dimension, List<Player> playerList){
        try {
            return Game.getGameBuilder()
                    .Dimension(dimension)
                    .PlayerList(playerList)
                    .WinningStrategy(WinningStrategyFactory.getWinningStrategy(WinningStrategyType.Order_One_Winning_Strategy,dimension))
                    .build();
        } catch (InvalidBotCountException e) {
            throw new RuntimeException(e);
        } catch (InvalidPlayerSymbol e) {
            throw new RuntimeException(e);
        } catch (InvalidBoardDimension e) {
            throw new RuntimeException(e);
        } catch (InvalidPlayerCount e) {
            throw new RuntimeException(e);
        }

    }

    public Move executeMove(Game game, Player player) throws GameOverException {
            updateBoardList(game);
            return player.executeMove(game.getBoard());
    }

    public Player checkWinner(Game game, Move move){
        return game.getWinningStrategy().checkWinner(game.getBoard(), move);
    }


    public void printBoard(Board board){
        board.printBoard();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void updateGameStatus(Game game){
        int no_of_move = game.getNo_of_moves();
        game.setNo_of_moves(no_of_move+1);
        int size = game.getBoard().getSize();
        if(no_of_move + 1 == size * size )
            game.setGameStatus(GameStatus.Draw);
        game.setGameStatus(GameStatus.InProgress);
    }

    public void updateBoardList(Game game){
        game.getBoardStates().add(new Board(game.getBoard()));
    }
    public void updateMoveList(Game game, Move move){
        game.getMoveList().add(new Move(move.getCell().getRow(),move.getCell().getColumn(),move.getPlayer()));
    }

    public Board undoMove(Game game, Move move){
        game.getBoard().getBoard()
                .get(move.getCell().getRow())
                .get(move.getCell().getColumn())
                .setCellState(CellState.Empty);


        game.getBoard().getBoard()
                .get(move.getCell().getRow())
                .get(move.getCell().getColumn())
                .setPlayer(null);

        game.getWinningStrategy().undoMove(game.getBoard(),move);

        return game.getBoard();
    }

}
