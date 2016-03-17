package com.synisys.training.patterns.behavioral.memento;

/**
 * @author Tatevik.Marikyan
 * @since 10-Mar-16.
 */
public class GamePlayer {

    private Integer height;
    private GamePlayerType type;
    private String eyeColor;
    private String hairColor;

    public GamePlayer(GamePlayerType type) {
        this.type = type;
    }

    protected Memento save(){
        return new Memento(height, eyeColor, hairColor);
    }

    protected void revertToSate(Memento revertToSate){
        this.height = revertToSate.height;
        this.eyeColor = revertToSate.eyeColor;
        this.hairColor = revertToSate.hairColor;
    }

    public static class Memento {
        private Integer height;
        private String eyeColor;
        private String hairColor;

        private Memento(Integer height, String eyeColor, String hairColor) {
            this.height = height;
            this.eyeColor = eyeColor;
            this.hairColor = hairColor;
        }
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
