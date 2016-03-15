package com.synisys.de.rwandaIngo.observer;

/**
 * Created by Luiza.Karapetyan on 3/15/2016.
 */
interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}


