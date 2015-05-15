package com.synisys.abstractFactoryEntities;

import com.synisys.abstractFactory.Bank;

public class AraratBank implements Bank {
	private final String BANK_NAME;

	public AraratBank() {
		BANK_NAME = "AraratBank BANK";
	}

	public String getBankName() {
		return BANK_NAME;
	}
}
