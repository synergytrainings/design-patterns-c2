package com.synisys.training.patterns.structural.adapter;

/**
 * @author Tatevik.Marikyan
 * @since 09-Jun-15.
 */
public class StandardAccount extends AbstractAccount {
    public StandardAccount(double size) {
        super(size);
        setOverdraftAvailable(false);
    }
}
