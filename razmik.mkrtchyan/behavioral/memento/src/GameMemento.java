/**
 * Created by Razmik on 3/6/2016.
 */
public class GameMemento {

    private int savedGameState;

    public GameMemento(int savedGameState) {
        this.savedGameState = savedGameState;
    }

    public int getSavedGameState() {
        return savedGameState;
    }

}
