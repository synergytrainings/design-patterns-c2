package com.synisys.training.patterns.behavioral.mediator;

import com.synisys.training.patterns.behavioral.mediator.colleague.Bank;
import com.synisys.training.patterns.behavioral.mediator.colleague.BankImpl;
import com.synisys.training.patterns.behavioral.mediator.mediator.BankMediator;
import com.synisys.training.patterns.behavioral.mediator.mediator.BankMediatorImpl;

import java.math.BigDecimal;

/**
 * @author Tatevik.Marikyan
 * @since 03-Mar-16.
 */
public class BankClient {

    public static void main(String[] args) {
        BankMediator mediator = new BankMediatorImpl();
        Bank vtbBank = new BankImpl(mediator, BankType.VTB);
        Bank hsbcBank = new BankImpl(mediator, BankType.HSBC);

        vtbBank.send(new BigDecimal(15), hsbcBank);
        System.out.println(hsbcBank.getTotalMoney());

    }
}
