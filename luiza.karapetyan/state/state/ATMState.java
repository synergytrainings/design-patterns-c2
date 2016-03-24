package com.synisys.de.rwandaIngo.state;

/**
 * Created by Luiza.Karapetyan on 3/21/2016.
 */
public interface ATMState {

    // Different states expected
    // HasCard, NoCard, HasPin, NoCash

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}
