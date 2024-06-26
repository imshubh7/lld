package entity;

import java.util.LinkedList;
import java.util.List;

public class Game {
    LinkedList<Player> playerList;
    SignType[][] board;


    public Game(LinkedList<Player> playerList, SignType[][]board) {
        this.playerList = playerList;
        this.board = board;
    }

    public LinkedList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(LinkedList<Player> playerList) {
        this.playerList = playerList;
    }

    public SignType[][] getBoard() {
        return board;
    }

    public void setBoard(SignType[][] board) {
        this.board = board;
    }
}
