package com.synisys.abstractFactoryEntities;

import com.synisys.abstractFactory.Loan;

public class BussinessLoan implements Loan {
	private final String LOAN_NAME;

	public BussinessLoan() {
		LOAN_NAME = "Bussiness Loan";
	}

	public String getLoanName() {
		return LOAN_NAME;
	}
}