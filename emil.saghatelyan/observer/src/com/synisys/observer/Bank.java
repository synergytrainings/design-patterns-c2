package com.synisys.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emil.saghatelyan on 3/17/2016.
 */
public class Bank implements Subject{

	private List<Observer> exChanges = new ArrayList<Observer>();
	private Rate rate;



	public Bank() {
	}

	@Override
	public void registerObserver(Observer o) {
		exChanges.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		exChanges.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		for(Observer o:exChanges){
			o.update(this.rate);
		}
	}

	public Rate getRate() {
		return rate;
	}

	public void setRate(Rate rate) {
		this.rate = rate;
		notifyAllObservers();
	}
}
