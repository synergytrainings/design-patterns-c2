package com.synisys.training.designpatterns.facade.impl;

public class Bank {
	
	 public boolean hasSufficientSavings(Customer c, int amount)
	    {
	     System.out.println("Check bank for " + c.getName());
	      return true;
	    }
}
