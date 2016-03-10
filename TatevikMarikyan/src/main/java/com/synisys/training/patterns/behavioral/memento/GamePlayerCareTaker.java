package com.synisys.training.patterns.behavioral.memento;

import java.util.Stack;

/**
 * @author Tatevik.Marikyan
 * @since 10-Mar-16.
 */
public class GamePlayerCareTaker {

    private Stack<GamePlayer.Memento> undoHistory;

    private Stack<GamePlayer.Memento> redoHistory;

    private GamePlayer gamePlayer;

    public GamePlayerCareTaker(GamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
        undoHistory = new Stack<>();
        redoHistory = new Stack<>();
    }

    public void save() {
        this.undoHistory.push(gamePlayer.save());
        this.redoHistory = new Stack<>();
    }

    public void undo() {
        GamePlayer.Memento revertToState = undoHistory.pop();
        gamePlayer.revertToSate(revertToState);
        redoHistory.push(revertToState);
    }

    public void redo() {
        GamePlayer.Memento revertToSate = redoHistory.pop();
        gamePlayer.revertToSate(revertToSate);
        undoHistory.push(revertToSate);
    }

    public String printHeroState() {
        return "Height: " + gamePlayer.getHeight() +
                "\nEye color: " + gamePlayer.getEyeColor() +
                "\nHair color: " + gamePlayer.getHairColor();
    }
}
