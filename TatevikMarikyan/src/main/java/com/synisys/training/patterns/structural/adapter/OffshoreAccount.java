package com.synisys.training.patterns.structural.adapter;

/**
 * @author Tatevik.Marikyan
 * @since 09-Jun-15.
 */
public class OffshoreAccount {
    private double balance;

    /** The tax for the country where the account is */
    private static final double TAX_RATE = 0.04;

    public OffshoreAccount(final double balance) {
        this.balance = balance;
    }

    public double getTaxRate() {
        return TAX_RATE;
    }

    public double getOffshoreBalance() {
        return balance;
    }
}
