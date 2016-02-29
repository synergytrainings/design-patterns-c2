package facade;

import facade.domain.Food;
import facade.domain.Shop1;
import facade.domain.Shop2;
import facade.domain.Time;

import java.util.Date;


public class OrderMaker {
    private Shop1 shop1;
    private Shop2 shop2;

    public OrderMaker(){
        shop1 = new Shop1();
        shop2 = new Shop2();
    }

    public String orderFromShop1(Date date, Food ... foods){
       shop1.order(foods);
       Time time = shop1.getOrderTime();
       if((date.getHours()*60 + date.getMinutes()) < (time.getHour() * 60 + time.getMinute())){
           return "Order rejected";
       }
        return "Order accepted";
    }

    public String orderFromShop2(Date date, Food ... foods){
        shop2.order(foods);
        Time time = shop2.getOrderTime();
        if((date.getHours()*60 + date.getMinutes()) < (time.getHour() * 60 + time.getMinute())){
            return "Order rejected";
        }
        return "Order accepted";
    }


}
