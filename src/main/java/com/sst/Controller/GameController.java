package com.sst.Controller;

import com.sst.Exceptions.InvalidMoveException;
import com.sst.Models.Game;
import com.sst.Models.GameState;
import com.sst.Models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
    
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}