package com.synisys.abstractFactoryEntities;

import com.synisys.abstractFactory.Loan;

public class HomeLoan implements Loan {
	private final String LOAN_NAME;

	public HomeLoan() {
		LOAN_NAME = "Home Loan";
	}

	public String getLoanName() {
		return LOAN_NAME;
	}
}
