package com.synisys.training.patterns.behavioral.mediator.colleague;

import com.synisys.training.patterns.behavioral.mediator.BankType;
import com.synisys.training.patterns.behavioral.mediator.mediator.BankMediator;

import java.math.BigDecimal;

/**
 * @author Tatevik.Marikyan
 * @since 03-Mar-16.
 */
public class BankImpl extends Bank {

    public BankImpl(BankMediator mediator, BankType bankType) {
        super(mediator, bankType);
    }

    @Override
    public void send(BigDecimal money, Bank atmBank) {
        System.out.println("Sending $" + money + " from " + this.bankType.toString() + "to " + atmBank.bankType.toString() + " Bank");
        this.totalMoney = this.totalMoney.subtract(money);
        this.mediator.sendMoney(this.bankType, atmBank.getBankType(), money);
    }

    @Override
    public void receive(BigDecimal money, Bank atmBank) {
        System.out.println("Receives $" + money + " from " + atmBank.getBankType().toString() + " Bank");
        this.totalMoney = this.totalMoney.add(money);
    }

}
