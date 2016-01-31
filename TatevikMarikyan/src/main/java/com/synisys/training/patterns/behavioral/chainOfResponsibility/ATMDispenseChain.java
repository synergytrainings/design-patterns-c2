package com.synisys.training.patterns.behavioral.chainOfResponsibility;

import com.synisys.training.patterns.behavioral.chainOfResponsibility.model.*;

import java.util.Scanner;

/**
 * Created by Tatevik
 * since  31-Jan-16.
 */
public class ATMDispenseChain {

    private DispenseChain c50;

    public ATMDispenseChain() {
        // initialize the chain
        this.c50 = new Dollar50Dispenser();
        DispenseChain c20 = new Dollar20Dispenser();
        DispenseChain c10 = new Dollar10Dispenser();
        DispenseChain c5 = new Dollar5Dispenser();
        DispenseChain c2 = new Dollar2Dispenser();
        DispenseChain c1 = new Dollar1Dispenser();

        // set the chain of responsibility
        c50.setNextChain(c20);
        c20.setNextChain(c10);
        c10.setNextChain(c5);
        c5.setNextChain(c2);
        c2.setNextChain(c1);

    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        int amount = 0;
        System.out.println("Enter amount to dispense");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();

/*            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }*/
        // process the request

        atmDispenser.c50.dispense(new Currency(amount));

    }
}
