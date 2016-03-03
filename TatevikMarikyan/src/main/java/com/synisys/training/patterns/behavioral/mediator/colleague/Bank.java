package com.synisys.training.patterns.behavioral.mediator.colleague;

import com.synisys.training.patterns.behavioral.mediator.BankType;
import com.synisys.training.patterns.behavioral.mediator.mediator.BankMediator;

import java.math.BigDecimal;

/**
 * @author Tatevik.Marikyan
 * @since 03-Mar-16.
 */
public abstract class Bank {

    protected BankMediator mediator;

    protected BigDecimal money;

    protected BigDecimal totalMoney;

    protected BankType bankType;

    public Bank(BankMediator mediator, BankType bankType) {
        this.mediator = mediator;
        this.bankType = bankType;
        this.totalMoney = BigDecimal.ZERO;
    }

    public abstract void send(BigDecimal money, Bank atmBank);

    public abstract void receive(BigDecimal money, Bank atmBank);

    public BankMediator getMediator() {
        return mediator;
    }

    public void setMediator(BankMediator mediator) {
        this.mediator = mediator;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BankType getBankType() {
        return bankType;
    }

    public void setBankType(BankType bankType) {
        this.bankType = bankType;
    }
}
