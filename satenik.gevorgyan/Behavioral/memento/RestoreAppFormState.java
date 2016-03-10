package memento;

import java.util.ArrayList;
import java.util.List;

public class RestoreAppFormState {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento restoreMementoByState(WFState latestState){
        Memento restoredMemento = null;
        for(Memento memento:mementoList){
            if(memento.getState().equals(latestState)){
                restoredMemento = memento;
            }
        }
        return restoredMemento;
    }
}
