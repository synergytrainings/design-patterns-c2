package com.synisys.abstractFactory;

import java.io.IOException;

public class Demo {
	public static void main(String args[]) throws IOException {

		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank("HSBC");

		System.out.print("\n");
		System.out.print("Bank Name " + b.getBankName() + ": ");

		System.out.print("\n");
		System.out.println("you are taking the loan from " + b.getBankName());

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan("Home");
		System.out.print("\n");
		System.out.print("Loan name is " + l.getLoanName() + ": ");
	}

}
