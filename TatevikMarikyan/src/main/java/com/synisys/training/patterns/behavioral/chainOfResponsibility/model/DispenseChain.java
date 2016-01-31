package com.synisys.training.patterns.behavioral.chainOfResponsibility.model;

/**
 * Created by Tatevik
 * since  31-Jan-16.
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
