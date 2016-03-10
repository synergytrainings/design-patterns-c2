/**
 * Created by Razmik on 3/7/2016.
 */
public class MasterGameObject {
    private int gameState;

    public void restoreState(GameMemento gameMemento) {
        this.gameState = gameMemento.getSavedGameState();
    }

    public GameMemento saveState() {
        return new GameMemento(gameState);
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
}
