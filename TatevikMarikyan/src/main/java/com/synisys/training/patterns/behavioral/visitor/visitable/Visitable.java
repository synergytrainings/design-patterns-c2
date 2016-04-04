package com.synisys.training.patterns.behavioral.visitor.visitable;

import com.synisys.training.patterns.behavioral.visitor.visitor.Visitor;

/**
 * @author Tatevik.Marikyan
 * @since 04-Apr-16.
 */
public interface Visitable {

    public void accept(Visitor visitor);
}
