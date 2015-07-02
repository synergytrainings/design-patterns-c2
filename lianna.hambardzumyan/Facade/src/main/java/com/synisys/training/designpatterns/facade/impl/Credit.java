package com.synisys.training.designpatterns.facade.impl;

public class Credit {
	
	public boolean hasGoodCredit(Customer c) {
		System.out.println("Check credit for " + c.getName());
		return true;
	}
}
