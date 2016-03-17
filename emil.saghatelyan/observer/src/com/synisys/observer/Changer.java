package com.synisys.observer;

/**
 * Created by emil.saghatelyan on 3/17/2016.
 */
public class Changer implements Observer{
	private String name;
	private String address;
	private Rate rate;

	public Changer(String address, String name, Rate rate) {
		this.address = address;
		this.name = name;
		this.rate = rate;
	}

	@Override
	public void update(Rate r) {
		this.rate = r;
	}
}
