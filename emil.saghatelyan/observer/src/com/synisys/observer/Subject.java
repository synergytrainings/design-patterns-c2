package com.synisys.observer;

/**
 * Created by emil.saghatelyan on 3/17/2016.
 */
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyAllObservers();
}
