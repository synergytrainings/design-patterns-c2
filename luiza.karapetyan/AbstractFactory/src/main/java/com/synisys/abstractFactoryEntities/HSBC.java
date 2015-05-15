package com.synisys.abstractFactoryEntities;

import com.synisys.abstractFactory.Bank;

public class HSBC implements Bank {
	private final String BANK_NAME;

	public HSBC() {
		BANK_NAME = "HSBC BANK";
	}

	public String getBankName() {
		return BANK_NAME;
	}
}