package Controller;
import Models.*;
import java.util.LinkedList;
import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> players){
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGamestatus();
    }

    public String getWinnerName(Game game){
        return game.getWinningPlayer().getName();
    }
    public void setGameStatus(Game game, GameStatus gameStatus){
        game.setGameStatus(gameStatus);
    }

    public void displayBoard(Game game) {
        game.getBoard().displayBoard();
    }

    public void executeNextMove(Game game) {
        game.makeNextMove();

    }
}