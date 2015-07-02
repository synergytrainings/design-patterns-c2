package com.synisys.training.designpatterns.facade.impl;

public class Loan {
	
	public boolean hasNoBadLoans(Customer c)
    {
      System.out.println("Check loans for " + c.getName());
      return true;
    }
	
}
