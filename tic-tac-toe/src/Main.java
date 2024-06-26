import controller.GameController;
import entity.Game;
import entity.Player;
import entity.SignType;

import java.util.LinkedList;

public class Main {
    /*
    Enter Player1 Name
    Enter Player2 Name
    Please choose i and j playerName
    Print current Board
    Please choose i and j playerName
    PlayerName won
     */
    public static void main(String[] args) {

        Player player1 = new Player("S", SignType.O);
        Player player2 = new Player("T", SignType.X);

        SignType[][] board = new SignType[3][3];
        LinkedList<Player>linkedList = new LinkedList<>();
        linkedList.add(player1);
        linkedList.add(player2);
        GameController.startGame(new Game(linkedList, board));
    }
}