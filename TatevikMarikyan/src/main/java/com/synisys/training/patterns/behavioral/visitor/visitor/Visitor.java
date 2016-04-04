package com.synisys.training.patterns.behavioral.visitor.visitor;

import com.synisys.training.patterns.behavioral.visitor.visitable.Customer;
import com.synisys.training.patterns.behavioral.visitor.visitable.Item;
import com.synisys.training.patterns.behavioral.visitor.visitable.Order;

/**
 * @author Tatevik.Marikyan
 * @since 04-Apr-16.
 */
public interface Visitor {

    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);



}
