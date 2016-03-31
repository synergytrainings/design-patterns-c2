package com.synisys.de.rwandaIngo.visitor;

/**
 * Created by Luiza.Karapetyan on 3/31/2016.
 */
public interface Visitable<V extends Visitor<V, T>, T extends Visitable<V, T>> {

    public void accept(V visitor);

}
