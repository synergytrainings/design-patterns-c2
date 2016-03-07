package com.synisys.de.rwandaIngo.momento;

/**
 * Created by Luiza.Karapetyan on 3/7/2016.
 */
public class DietInfoCaretaker {

    Object objMemento;

    public void saveState(DietInfo dietInfo) {
        objMemento = dietInfo.save();
    }

    public void restoreState(DietInfo dietInfo) {
        dietInfo.restore(objMemento);
    }

}
