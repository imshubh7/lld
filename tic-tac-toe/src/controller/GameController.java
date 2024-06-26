package controller;

import entity.Game;
import entity.Player;
import utils.GameUtils;

import java.util.Scanner;

public class GameController {

    public static void startGame(Game game){
        while (!GameUtils.isBoardFull(game.getBoard())){
            Player player = game.getPlayerList().peek();
            System.out.println(player.getName() + " Your Turn Please choose index");
            GameUtils.printBoard(game.getBoard());
            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            int j = in.nextInt();
            game.getBoard()[i][j]= player.getSignType();
            Player winner = GameUtils.winner(game.getBoard(),game.getPlayerList());
            if(winner!=null){
                System.out.println("Winner is "+ winner.getName());
                return;
            }
            game.getPlayerList().add(game.getPlayerList().poll());
        }
        System.out.println("Match Draw");
    }
}
