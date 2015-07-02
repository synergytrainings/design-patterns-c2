package com.synisys.training.designpatterns.facade.impl;

public class Mortgage {
	private Bank bank = new Bank();
    private Loan loan = new Loan();
    private Credit credit = new Credit();
 
    public boolean IsEligible(Customer customer, int amount)
    {
      System.out.println(customer.getName() + " applies for " + amount + "$ loan\n");
 
      boolean eligible = true;
 
      // Check creditworthyness of applicant
      if (!bank.hasSufficientSavings(customer, amount))
      {
        eligible = false;
      }
      else if (!loan.hasNoBadLoans(customer))
      {
        eligible = false;
      }
      else if (!credit.hasGoodCredit(customer))
      {
        eligible = false;
      }
 
      return eligible;
    }
}
