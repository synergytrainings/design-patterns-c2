package com.synisys.abstractFactory;

import com.synisys.abstractFactoryEntities.AraratBank;
import com.synisys.abstractFactoryEntities.HSBC;

class BankFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HSBC")) {
			return new HSBC();
		} else if (bank.equalsIgnoreCase("ARARATBANK")) {
			return new AraratBank();
		}
		return null;
	}

	public Loan getLoan(String loan) {
		return null;
	}
}