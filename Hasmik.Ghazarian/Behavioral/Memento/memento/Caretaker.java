package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasmik.Ghazaryan on 3/10/2016.
 */
public class Caretaker<T> {

    //list of states saved
    private static List<Memento> mementoList = new ArrayList<>();

    //save state of the originator
    public static void saveState(Originator orig)
    {
        mementoList.add(orig.createMemento());
    }

    //restore state of the originator
    public static void restoreState(Originator orig, int stateNumber)
    {
        orig.setMemento(mementoList.get(stateNumber));
    }
}
