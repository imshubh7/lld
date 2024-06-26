package utils;

import entity.Player;
import entity.SignType;

import java.util.LinkedList;

public class GameUtils {

    public static Player winner(SignType[][] board, LinkedList<Player>linkedList){
        int size = linkedList.size();
        while (size-->0){
            Player player = linkedList.poll();
            linkedList.push(player);
            SignType signType = player.getSignType();

            //check rows
            loop:
            for(int i=0;i<board.length;i++){

                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]!=signType){
                        continue loop;
                    }
                }
                return player;
            }
            //check columns


            //check diagonal

        }
        return null;
    }

    public static boolean isBoardFull(SignType[][] board){
        for (SignType[] signTypes : board) {
            for (int j = 0; j < board[0].length; j++) {
                if (signTypes[j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(SignType[][]board) {
        for (SignType[] signTypes : board) {
            for (int j = 0; j < board[0].length; j++) {
                if(signTypes[j]==null){
                    System.out.print("__ ");
                }
                else
                    System.out.print(signTypes[j] + " ");
            }
            System.out.println();
        }
    }
}
