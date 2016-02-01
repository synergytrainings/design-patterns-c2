package com.synisys.de.rwandaIngo.chainOfResponsibility;

/**
 * Created by Luiza.Karapetyan on 2/1/2016.
 */
public interface Chain {

    public abstract void setNext(Chain nextInChain);
    public abstract void process(Number request);
}
