package main.java.com.synisys.designPatternsTraining.prototype.impl;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Razmik on 6/12/2015.
 */
public class IteratorEnumerationAdapter<T> implements Enumeration<T> {

    private Iterator<T> iterator;

    public IteratorEnumerationAdapter(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return iterator.next();
    }
}
