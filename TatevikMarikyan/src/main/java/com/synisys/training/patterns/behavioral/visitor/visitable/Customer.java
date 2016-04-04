package com.synisys.training.patterns.behavioral.visitor.visitable;

import com.synisys.training.patterns.behavioral.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tatevik.Marikyan
 * @since 04-Apr-16.
 */
public class Customer implements Visitable {

    private String name;

    private List<Order> orders = new ArrayList<>();


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }


    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
