package facade;

import facade.domain.Food1;
import facade.domain.Food2;

import java.util.Date;


public class FacadePatternDemo {
    public static void main(String[] args) {
        OrderMaker orderMaker = new OrderMaker();

        Date orderForTime = new Date();
        orderForTime.setHours(9);
        orderForTime.setMinutes(30);
        System.out.println("Your order is " + orderMaker.orderFromShop1(orderForTime, new Food1()));
        System.out.println("Your order is " + orderMaker.orderFromShop2(orderForTime, new Food2(),new Food1()));
    }

}
