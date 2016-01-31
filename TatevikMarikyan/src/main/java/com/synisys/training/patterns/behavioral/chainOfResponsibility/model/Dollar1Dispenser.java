package com.synisys.training.patterns.behavioral.chainOfResponsibility.model;

/**
 * Created by Tatevik
 * since  31-Jan-16.
 */
public class Dollar1Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 1){
            int num = currency.getAmount() / 1;
            int remainder = currency.getAmount() % 1;
            System.out.println("Dispensing " + num + " 1$ note");
            if(remainder != 0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(currency);
        }
    }
}
