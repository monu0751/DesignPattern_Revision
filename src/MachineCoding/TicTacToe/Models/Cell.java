package MachineCoding.TicTacToe.Models;

import MachineCoding.TicTacToe.Models.Constants.CellState;
import MachineCoding.TicTacToe.Models.Constants.PlayerType;

public class Cell {
    int row;
    int column;
    Player player;
    CellState cellState;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        cellState = CellState.Empty;
    }
    public void display(){
        if(player == null){
            System.out.print(" |''| ");
        }else{
            System.out.print(" |"+player.getSymbol()+"| ");
        }
    }
}
