package com.synisys.training.patterns.behavioral.visitor.visitor;

import com.synisys.training.patterns.behavioral.visitor.visitable.Customer;
import com.synisys.training.patterns.behavioral.visitor.visitable.Item;
import com.synisys.training.patterns.behavioral.visitor.visitable.Order;

/**
 * @author Tatevik.Marikyan
 * @since 04-Apr-16.
 */
public class GeneralReportVisitor implements Visitor{
    private int customersNo;
    private int ordersNo;
    private int itemsNo;

    @Override
    public void visit(Customer customer) {
        System.out.println(customer.getName());
        customersNo++;
    }

    @Override
    public void visit(Order order) {
        System.out.println(order.getName());
        ordersNo++;
    }

    @Override
    public void visit(Item item) {
        System.out.println(item.getName());
        itemsNo++;
    }

    public void displayResults() {
        System.out.println("No of customers:" + customersNo);
        System.out.println("No of orders:   " + ordersNo);
        System.out.println("No of items:   " + itemsNo);
    }
}
