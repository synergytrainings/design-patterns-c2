package com.synisys.de.rwandaIngo.chainOfResponsibility;

/**
 * Created by Luiza.Karapetyan on 2/1/2016.
 */

public class PositiveProcessor implements Chain {

    private Chain nextInChain;

    public void setNext(Chain c) {
        nextInChain = c;
    }

    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor : " + request.getNumber());
        } else {
            nextInChain.process(request);
        }
    }
}
