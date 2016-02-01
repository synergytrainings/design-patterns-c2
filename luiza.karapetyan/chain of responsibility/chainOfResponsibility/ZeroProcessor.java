package com.synisys.de.rwandaIngo.chainOfResponsibility;

/**
 * Created by Luiza.Karapetyan on 2/1/2016.
 */
public class ZeroProcessor implements Chain {

    private Chain nextInChain;

    public void setNext(Chain c) {
        nextInChain = c;
    }

    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("ZeroProcessor : " + request.getNumber());
        } else {
            nextInChain.process(request);
        }
    }
}
