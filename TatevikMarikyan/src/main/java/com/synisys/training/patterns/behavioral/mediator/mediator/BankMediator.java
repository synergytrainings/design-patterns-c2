package com.synisys.training.patterns.behavioral.mediator.mediator;

import com.synisys.training.patterns.behavioral.mediator.BankType;
import com.synisys.training.patterns.behavioral.mediator.colleague.Bank;

import java.math.BigDecimal;

/**
 * @author Tatevik.Marikyan
 * @since 03-Mar-16.
 */
public interface BankMediator {

    void sendMoney(BankType bankType, BankType atmBankType, BigDecimal money);

    void addBank(Bank bank);

    Bank addBank(BankType bankType);
}
