package MachineCoding.TicTacToe.Models;

import MachineCoding.TicTacToe.Exception.InvalidBoardDimension;
import MachineCoding.TicTacToe.Exception.InvalidBotCountException;
import MachineCoding.TicTacToe.Exception.InvalidPlayerCount;
import MachineCoding.TicTacToe.Exception.InvalidPlayerSymbol;
import MachineCoding.TicTacToe.Models.Constants.GameStatus;
import MachineCoding.TicTacToe.Models.Constants.PlayerType;
import MachineCoding.TicTacToe.Service.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    Board board;
    List<Player> playerList;
    List<Move> moveList;
    GameStatus gameStatus;
    Player winner;
    List<Board> boardStates;
    WinningStrategy winningStrategy;
    int no_of_moves;

    public int getNo_of_moves() {
        return no_of_moves;
    }

    public void setNo_of_moves(int no_of_moves) {
        this.no_of_moves = no_of_moves;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void setMoveList(List<Move> moveList) {
        this.moveList = moveList;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void setBoardStates(List<Board> boardStates) {
        this.boardStates = boardStates;
    }

    public void setWinningStrategy(WinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }



    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public List<Move> getMoveList() {
        return moveList;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public List<Board> getBoardStates() {
        return boardStates;
    }

    public WinningStrategy getWinningStrategy() {
        return winningStrategy;
    }


    public static GameBuilder getGameBuilder(){
        return new GameBuilder();
    }

    public Game(Board board, List<Player> playerList, WinningStrategy winningStrategy) {
        this.board = board;
        this.playerList = playerList;
        this.moveList = new ArrayList<>();
        this.gameStatus = GameStatus.InProgress;
        this.boardStates = new ArrayList<>();
        this.winningStrategy = winningStrategy;
    }

    public static class GameBuilder{
        int dimension;
        List<Player> playerList;
        WinningStrategy winningStrategy;



        public GameBuilder Dimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        public GameBuilder PlayerList(List<Player> playerList) {
            this.playerList = playerList;
            return this;
        }
        public GameBuilder WinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }

        // Few validations
        /*
        *
         * Players must be N-1, N is dimension of board
         * Board can not be less than 3 or more than 10 in dimensions
         * there can only one bot player
         * Validate player unique symbols
         *
        *
        * */

        void validateBoardDimension() throws InvalidBoardDimension {
            if(dimension < 3 || dimension > 10){
                throw new InvalidBoardDimension("Board dimension must be >= 3 or <= 10");
            }
        }

        void validateBotPlayer() throws InvalidBotCountException {
            int botuser = 0;
            for(Player player : playerList){
                if(player.getPlayerType() == PlayerType.Bot){
                    botuser++;
                }
            }
            if(botuser>1){
                throw new InvalidBotCountException("Bot can not be more than 1");
            }
        }

        void validatePlayerSymbol() throws InvalidPlayerSymbol {
            HashSet<Character> h = new HashSet<>();
            for (Player player: playerList){
//                if(player.playerType == PlayerType.Bot){
                    h.add(player.getSymbol());
//                }
            }
            if(h.size() != playerList.size()){
                throw new InvalidPlayerSymbol("There can not be duplicate symbols");
            }
        }

        void validatePlayerCount() throws InvalidPlayerCount {
            if(playerList.size() != dimension-1){
                throw new InvalidPlayerCount("No. of players can only be "+(dimension-1));
            }
        }

        void validate() throws InvalidBoardDimension, InvalidBotCountException, InvalidPlayerCount, InvalidPlayerSymbol {
            validateBoardDimension();
            validateBotPlayer();
            validatePlayerCount();
            validatePlayerSymbol();
        }

        public Game build() throws InvalidBotCountException, InvalidPlayerSymbol, InvalidBoardDimension, InvalidPlayerCount {
            validate();
            return new Game(new Board(dimension), playerList, winningStrategy);
        }


    }

}
