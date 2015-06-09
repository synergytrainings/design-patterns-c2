package com.synisys.training.patterns.structural.adapter;

/**
 * @author Tatevik.Marikyan
 * @since 09-Jun-15.
 */
public interface Account {
    public double getBalance();
    public boolean isOverdraftAvailable();
    public void credit(final double credit);
}
