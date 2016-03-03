package com.synisys.training.patterns.behavioral.mediator.mediator;

import com.synisys.training.patterns.behavioral.mediator.BankType;
import com.synisys.training.patterns.behavioral.mediator.colleague.Bank;
import com.synisys.training.patterns.behavioral.mediator.colleague.BankImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/**
 * @author Tatevik.Marikyan
 * @since 03-Mar-16.
 */
public class BankMediatorImpl implements BankMediator {

    List<Bank> bankList;
    EnumMap<BankType, Bank> bankEnumMap;

    public BankMediatorImpl() {
        this.bankList = new ArrayList<>();
        this.bankEnumMap = new EnumMap<>(BankType.class);
    }


    @Override
    public void sendMoney(BankType bankType, BankType atmBankType, BigDecimal money) {
        Bank atmBank = this.bankEnumMap.get(atmBankType);
        if (atmBank == null){
            atmBank = addBank(atmBankType);
        }
        Bank bank = this.bankEnumMap.get(bankType);
        if (bank == null){
            bank = addBank(bankType);
        }

        bank.receive(money, atmBank);
    }

    @Override
    public void addBank(Bank bank) {
        this.bankEnumMap.put(bank.getBankType(), bank);
    }

    @Override
    public Bank addBank(BankType bankType) {
        Bank bank =  new BankImpl(this, bankType);
        this.bankEnumMap.put(bankType, bank);
        return bank;
    }
}
