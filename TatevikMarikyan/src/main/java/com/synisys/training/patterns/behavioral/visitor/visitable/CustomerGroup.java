package com.synisys.training.patterns.behavioral.visitor.visitable;

import com.synisys.training.patterns.behavioral.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tatevik.Marikyan
 * @since 04-Apr-16.
 */
public class CustomerGroup implements Visitable {

    private List<Customer> customers = new ArrayList<>();

    public void accept(Visitor visitor){
        for (Customer customer : customers){
            customer.accept(visitor);
        }
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }
}
