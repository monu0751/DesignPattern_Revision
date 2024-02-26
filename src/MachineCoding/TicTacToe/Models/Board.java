package MachineCoding.TicTacToe.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<List<Cell>> board;
    int size;

    public Board(Board board) {
        this.size = board.getSize();
        this.board = board.getBoard();
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Board(int size) {
        this.size = size;
        this.board = new ArrayList<>();
        for(int i = 0; i<size; i++){
            this.board.add(new ArrayList<>());
            for (int j = 0; j<size; j++){
                this.board.get(i).add(new Cell(i,j));
            }
        }
    }

    public void printBoard(){

        for (int i=0; i<size; i++){
            System.out.print("["+(i+1)+"]");
            System.out.print("[");
            List<Cell> cells = board.get(i);
            for(Cell cell: cells){
                cell.display();
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
