package com.synisys.training.designpatterns.composite;

public class Constant implements Expression {
	private int number;
	
	public Constant(int number) {
		this.number = number;
	}
	
	@Override
	public int computeValue() {
		return number;
	}

	@Override
	public String getAsString() {
		return String.valueOf(number);
	}

}
