package main.java.com.synisys.designPatternsTraining.prototype.impl;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Razmik on 6/12/2015.
 */
public class EnumerationIteratorAdapter<T> implements Iterator<T> {

    private Enumeration<T> enumeration;

    public EnumerationIteratorAdapter(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return this.enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
