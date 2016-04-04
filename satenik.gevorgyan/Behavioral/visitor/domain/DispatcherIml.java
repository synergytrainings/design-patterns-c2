package visitor.domain;

import visitor.domain.visitor.Bus;
import visitor.domain.visitor.Ship;
import visitor.domain.visitor.Taxi;

public class DispatcherIml implements Dispatcher{
    @Override
    public void order(Taxi taxi) {
    int totalCost = 0;
    if(taxi.getOrderKm() > 10){
        taxi.setPricePerKM(100);
    }else{
        taxi.setPricePerKM(120);
    }
        totalCost = taxi.getPricePerKM() * taxi.getOrderKm();
        System.out.println("You have ordered taxi by number: " + taxi.getVehicleNumber());
        System.out.println("Your order kilometer is: " + taxi.getOrderKm());
        System.out.println("Your order total price: " + totalCost);
    }

    @Override
    public void order(Bus bus) {
        int totalCost = 0;
        if(bus.getOrderSeatCount() < bus.getMaxSeatCount()){
        if(bus.getOrderSeatCount() <20 && bus.orderDays > 1){
            if(bus.haveConditioner){
                bus.setPricePerDay(20000);
            }else {
                bus.setPricePerDay(15000);
            }
        }else{
            bus.setPricePerDay(30000);
        }
        totalCost = bus.getPricePerDay() * bus.orderDays;
        System.out.println("You have ordered Bus by number" + bus.getVehicleNumber());
        System.out.println("Your order days is: " + bus.getOrderDays());
        System.out.println("Your order total price: " + totalCost);
        }else{
            System.out.println("We cant provide one bus for your order.");
        }

    }

    @Override
    public void order(Ship ship) {
        if(ship.getSituationPlace().equals("DC")){
            ship.setPricePerDay(1000);
        }
        System.out.println("You have ordered Ship by serial number" + ship.getSerialNumber());
        System.out.println("Your order days is: 1 day");
        System.out.println("Your order total price: " + ship.getPricePerDay());
    }
}
