package MachineCoding.TicTacToe.Models;

import MachineCoding.TicTacToe.Models.Constants.CellState;
import MachineCoding.TicTacToe.Models.Constants.PlayerType;
import MachineCoding.TicTacToe.Service.BotPlayingStrategy.Exception.GameOverException;

import java.util.Scanner;

public class Player {
    int id;
    String name;
    char symbol;
    PlayerType playerType;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move executeMove(Board board) throws GameOverException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! "+this.getName()+". Please play your move and enter row no. between 1 and "+(board.getSize()));
        int row = scanner.nextInt()-1;
        System.out.println("Hello! "+this.getName()+". Please play your move and enter column no. between 1 and "+(board.getSize()));
        int col = scanner.nextInt()-1;
        board.getBoard().get(row).get(col).setCellState(CellState.Fill);
        board.getBoard().get(row).get(col).setPlayer(this);
        return new Move(row,col,this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }
}
