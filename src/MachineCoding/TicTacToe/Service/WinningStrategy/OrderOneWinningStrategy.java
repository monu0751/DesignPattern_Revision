package MachineCoding.TicTacToe.Service.WinningStrategy;

import MachineCoding.TicTacToe.Models.Board;
import MachineCoding.TicTacToe.Models.Move;
import MachineCoding.TicTacToe.Models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy implements WinningStrategy{
    int dimension;
    List<HashMap<Character,Integer>> rowHashMapList;
    List<HashMap<Character,Integer>> colHashMapList;
    HashMap<Character, Integer> topLeftCornerMap;
    HashMap<Character, Integer> topRightCornerMap;
    HashMap<Character, Integer> cornerHashMap;



    public OrderOneWinningStrategy(int dimention) {
        this.dimension = dimention;
        rowHashMapList = new ArrayList<>();
        colHashMapList = new ArrayList<>();
        topLeftCornerMap = new HashMap<>();
        topRightCornerMap = new HashMap<>();
        cornerHashMap = new HashMap<>();
        for(int i=0; i<dimension; i++){
            rowHashMapList.add(new HashMap<Character,Integer>());
            colHashMapList.add(new HashMap<Character,Integer>());
        }




    }

    @Override

    public Move undoMove(Board board, Move move) {
        /*
        Will write logic for undo, easy hai.
        */

        Player player = move.getPlayer();
        Character symbol = player.getSymbol();
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();

//        if(undoRowWin(row,symbol)){
//            return player;
//        }else if(checkColWin(col,symbol)){
//            return player;
//        }else if(isTopLeft(row,col) && checkTopLeftWin(symbol)){
//            return player;
//        }else if(isTopRight(row,col) && checkTopRightWin(symbol)){
//            return player;
//        }else if(isCorner(row,col) && checkCornerWin(symbol)){
//            return player;
//        }
        return null;
    }

    private void undoRowWin(int row, Character symbol) {

    }

    @Override
    public Player checkWinner(Board board, Move move) {
        Player player = move.getPlayer();
        Character symbol = player.getSymbol();
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();

        if(checkRowWin(row,symbol)){
            return player;
        }else if(checkColWin(col,symbol)){
            return player;
        }else if(isTopLeft(row,col) && checkTopLeftWin(symbol)){
            return player;
        }else if(isTopRight(row,col) && checkTopRightWin(symbol)){
            return player;
        }else if(isCorner(row,col) && checkCornerWin(symbol)){
            return player;
        }
        return null;
    }

    public boolean isTopLeft(int row, int col){
        return row == col;
    }

    public boolean isTopRight(int row, int col){
        return (row+col) == (dimension-1);
    }

    public boolean isCorner(int row, int col){
//[00] [n 0] [0 n]  [n n]
        if(row==0 || row==(dimension-1)){
            return col == (dimension -1) || col == 0;
        }
        return false;
    }

    public  boolean checkRowWin(int row, char symbol){
        this.rowHashMapList.get(row).putIfAbsent(symbol,0);
        this.rowHashMapList.get(row).put(
                symbol,
                this.rowHashMapList.get(row).get(symbol)+1
        );

        return this.rowHashMapList.get(row).get(symbol) == (dimension);
    }

    public  boolean checkColWin(int col, char symbol){
        this.colHashMapList.get(col).putIfAbsent(symbol,0);
        this.colHashMapList.get(col).put(
                symbol,
                this.colHashMapList.get(col).get(symbol)+1
        );

        return this.colHashMapList.get(col).get(symbol) == (dimension);
    }

    public  boolean checkTopLeftWin(char symbol){
        this.topLeftCornerMap.putIfAbsent(symbol,0);
        this.topLeftCornerMap.put(
                symbol,
                this.topLeftCornerMap.get(symbol)+1
        );

        return this.topLeftCornerMap.get(symbol) == (dimension);
    }

    public  boolean checkTopRightWin(char symbol){
        this.topRightCornerMap.putIfAbsent(symbol,0);
        this.topRightCornerMap.put(
                symbol,
                this.topRightCornerMap.get(symbol)+1
        );

        return this.topRightCornerMap.get(symbol) == (dimension);
    }

    public  boolean checkCornerWin(char symbol){
        this.cornerHashMap.putIfAbsent(symbol,0);
        this.cornerHashMap.put(
                symbol,
                this.cornerHashMap.get(symbol)+1
        );

        return this.cornerHashMap.get(symbol) == 4;
    }

}
