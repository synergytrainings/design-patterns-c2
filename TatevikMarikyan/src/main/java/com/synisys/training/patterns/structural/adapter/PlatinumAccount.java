package com.synisys.training.patterns.structural.adapter;

/**
 * @author Tatevik.Marikyan
 * @since 09-Jun-15.
 */
public class PlatinumAccount extends AbstractAccount {
    public PlatinumAccount(double size) {
        super(size);
        setOverdraftAvailable(true);
    }
}
