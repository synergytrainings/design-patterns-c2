package com.synisys.training.designpatterns.facade.impl;

public class TestMortgage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // Facade
	      Mortgage mortgage = new Mortgage();
	 
	      // Check mortgage eligibility for customer
	      Customer customer = new Customer("Anna Smith");
	      boolean eligible = mortgage.IsEligible(customer, 125000);
	 
	      System.out.println("\n" + customer.getName() + " has been " + (eligible ? "Approved" : "Rejected"));

	}

}
