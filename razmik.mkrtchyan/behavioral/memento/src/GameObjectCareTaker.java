/**
 * Created by Razmik on 3/7/2016.
 */
public class GameObjectCareTaker {
    private GameMemento memento;

    //when level is reached
    public void save(MasterGameObject masterGameObject) {
        this.memento = masterGameObject.saveState();
    }

    //when level is failed
    public void load(MasterGameObject masterGameObject) {
        masterGameObject.restoreState(memento);
    }

}
