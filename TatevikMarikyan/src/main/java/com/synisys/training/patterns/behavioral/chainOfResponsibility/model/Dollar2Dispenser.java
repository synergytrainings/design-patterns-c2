package com.synisys.training.patterns.behavioral.chainOfResponsibility.model;

/**
 * Created by Tatevik
 * since  31-Jan-16.
 */
public class Dollar2Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 2){
            int num = currency.getAmount() / 2;
            int remainder = currency.getAmount() % 2;
            System.out.println("Dispensing " + num + " 2$ note");
            if(remainder != 0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(currency);
        }
    }
}
