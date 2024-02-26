package MachineCoding.TicTacToe;

import MachineCoding.TicTacToe.Controller.GameController;
import MachineCoding.TicTacToe.Models.Bot;
import MachineCoding.TicTacToe.Models.Constants.BotDificultyLevel;
import MachineCoding.TicTacToe.Models.Constants.GameStatus;
import MachineCoding.TicTacToe.Models.Constants.PlayerType;
import MachineCoding.TicTacToe.Models.Game;
import MachineCoding.TicTacToe.Models.Move;
import MachineCoding.TicTacToe.Models.Player;
import MachineCoding.TicTacToe.Service.BotPlayingStrategy.BotPlayingStrategyFactory;
import MachineCoding.TicTacToe.Service.BotPlayingStrategy.BotPlayingStrategyType;
import MachineCoding.TicTacToe.Service.BotPlayingStrategy.Exception.GameOverException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws GameOverException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome in Tic Tac Toe!!");
        System.out.println("Please enter the dimension of game required:");
        int dimesion = scanner.nextInt();
        System.out.println("Is Bot required ? Y/N");
        String bot_availability = scanner.next();
        int no_of_player = dimesion-1;
        if(bot_availability.equalsIgnoreCase("Y")){
            no_of_player = no_of_player -1;
        }
        List<Player> playerList = new ArrayList<>();

        for(int i=1; i<=no_of_player; i++){
            Player player = new Player();
            System.out.println("Please enter the name of player "+i);
            String name = scanner.next();
            player.setName(name);
            System.out.println("Please enter Symbol of player "+name);
            char symbol = scanner.next().charAt(0);
            player.setSymbol(symbol);
            player.setPlayerType(PlayerType.Human);
            playerList.add(player);
        }

        if(bot_availability.equalsIgnoreCase("Y")){
            Bot bot = new Bot();
            System.out.println("Enter the name of Bot");
            String name = scanner.next();
            System.out.println("Enter symbol for bot "+name);
            char symbol = scanner.next().charAt(0);
            bot.setName(name);
            bot.setSymbol(symbol);
            bot.setPlayerType(PlayerType.Bot);
            bot.setBotDificultyLevel(BotDificultyLevel.Easy);
            bot.setBotPlayingStrategy(BotPlayingStrategyFactory.getBotPlayingStrategy(BotPlayingStrategyType.Basic_Bot_Playing_Strategy));
            playerList.add(bot);

        }
        Collections.shuffle(playerList);
        GameController gameController = new GameController();
        Game game = gameController.createGame(dimesion,playerList);
        int playerindex = -1;
        while (gameController.getGameStatus(game) == GameStatus.InProgress){
            playerindex++;
            playerindex = playerindex % playerList.size();
            Move move = gameController.executeMove(game, playerList.get(playerindex));
            Player winner = gameController.checkWinner(game,move);
            if(winner!=null){
                System.out.println("Hey! you are the winner. Congratulations!! "+ winner.getName().toUpperCase());
                System.out.println("Final board Status.");
                gameController.printBoard(game.getBoard());
                break;
            }
            System.out.println("Final board Status.");
            System.out.println("Do you want to Undo ?");
            gameController.printBoard(game.getBoard());
            System.out.println("Do you want to Undo ? Y/N");
            String undo = String.valueOf(scanner.next().charAt(0));
            if(undo.equalsIgnoreCase("y")){

            }
        }

    }
}
