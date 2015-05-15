package com.synisys.abstractFactory;

import com.synisys.abstractFactoryEntities.BussinessLoan;
import com.synisys.abstractFactoryEntities.HomeLoan;

class LoanFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		return null;
	}

	public Loan getLoan(String loan) {
		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Business")) {
			return new BussinessLoan();
		} 
		return null;
	}

}